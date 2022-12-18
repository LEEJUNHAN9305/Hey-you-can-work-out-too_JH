# 필요한 라이브러리 불러오기
from selenium import webdriver  # 데이터 수집 라이브러리로 selenium 선택
from urllib.request import urlopen
from selenium.webdriver.common.keys import Keys
import time
import urllib.request
import os

# 이미지 저장할 폴더 생성
if not os.path.isdir("smith_machine/"):
    os.makedirs("smith_machine/")

# 크롬 웹드라이버 연결
driver = webdriver.Chrome()
driver.get("https://www.google.com/imghp?hl=ko&tab=8i")

# 검색어 수동 설정
search = "smith machine"  # 운동기구 입력 01
elem = driver.find_element_by_name("q")
elem.send_keys(search)
elem.send_keys(Keys.RETURN)

# 스크롤 끝까지 내리기
SCROLL_PAUSE_TIME = 1

last_height = driver.execute_script("return document.body.scrollHeight")

while True:
    driver.execute_script("window.scrollTo(0, document.body.scrollHeight);")  # 브라우저 한번 끝까지 스크롤을 내림
    time.sleep(SCROLL_PAUSE_TIME)
    new_height = driver.execute_script("return document.body.scrollHeight")  # 브라우저 끝까지 한번 내렸을 때의 브라우저 길이가 새로운 길이가 됨

    if new_height == last_height:
        try:
            driver.find_element_by_css_selector(".mye4qd").click()  #mye4qd 는 "결과 더보기"의 css 클래스명 | "결과 더보기"를 찾아 누르라고 명령
        except:
            break
    last_height = new_height  # 끝까지 내릴 때마다 그 브라우저 길이가 새로운 길이가 됨을 반복

# 이미지 찾아서 원본 파일로 저장하기
images = driver.find_elements_by_css_selector(".rg_i.Q4LuWd")
count = 1

for image in images:
    try:
        image.click()
        time.sleep(2)
        imgUrl = driver.find_element_by_xpath('//*[@id="Sva75c"]/div/div/div[3]/div[2]/c-wiz/div/div[1]/div[1]/div[3]/div/a/img').get_attribute("src")  # 원본 이미지 XPath
        urllib.request.urlretrieve(imgUrl, "smith_machine/" + search + "_" + str(count) + ".jpg")  # 운동기구 입력 02 | 운동기구_count.jpg 형식으로 이미지가 저장됨
        print("Image saved: smith_machine_{}.jpg".format(count))  # 운동기구 입력 03
        count += 1
    except:
        pass

driver.close()
