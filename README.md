# YOLOv5를 이용한 운동기구 탐지 애플리케이션  
운동기구 이미지 수집은 job01_image_crawling_google.py 을 참조해주세요.  
운동기구 학습 및 TensorFlow-Lite 모델로의 변환은 yolov5_workout_machines_learning_pt_tflite_convert (1).ipynb 을 참조해주세요.  
애플리케이션 제작은 android 폴더를 참조해주세요.  
## 운동기구 탐지 애플리케이션 사용방법  
![intro](https://user-images.githubusercontent.com/54476630/208314145-6ce24559-12dd-4419-a841-24b5ede15278.png)  
애플리케이션 시작 버튼을 탭하면 운동기구 탐지 화면이 로드되면서 YOLOv5 기반 운동기구 탐지 모델이 운동기구 탐지를 시작합니다.  
탐지된 운동기구는 목록에 아이템으로 저장되고, 해당 아이템을 탭할 수 있습니다.
해당 아이템을 탭하면 운동기구의 사용법, 유튜브 영상으로 넘어갈 수 있는 버튼, 운동기구가 포함된 추천 루틴이 제공됩니다.  
추천 루틴에서 다른 운동기구를 탭할 시, 그 운동기구의 사용법 페이지로 넘어갈 수 있습니다.
