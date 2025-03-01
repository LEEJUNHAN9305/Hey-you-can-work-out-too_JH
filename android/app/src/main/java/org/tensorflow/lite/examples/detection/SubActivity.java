package org.tensorflow.lite.examples.detection;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SubActivity extends Activity {

    private TextView textviewHtmlDocument;
    public ListView foodView;
    public ScrollView sub_activity_page;
    ArrayList<String> foodStrings = new ArrayList<String>();
    ArrayList<Workout_Item> arrayList;
    // 버튼 선언
    Button button2;
    Button btn3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        arrayList = new ArrayList<>();
        final Bundle bundle = new Bundle();
        foodView = findViewById(R.id.food_list);
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urls = "https://www.youtube.com/results?search_query=";
                Intent intent = getIntent();
                String name0 = intent.getExtras().getString("name0");
                Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + name0));
                startActivity(intents);
            }
        });
        textviewHtmlDocument = (TextView) findViewById(R.id.textView);
        TextView workout_methods = (TextView) findViewById(R.id.textView2);
        textviewHtmlDocument.setMovementMethod(new ScrollingMovementMethod());
        ImageView workout_view = (ImageView) findViewById(R.id.workout_view);
        TextView workout_name = (TextView) findViewById(R.id.workout_name);
        TextView b_routine = (TextView) findViewById((R.id.b_routine));
        TextView workout_effect1 = (TextView) findViewById(R.id.workout_effect1);
        TextView workout_effect2 = (TextView) findViewById(R.id.workout_effect2);
        TextView routine_intro = (TextView) findViewById(R.id.routine_intro);
        LinearLayout layout = (LinearLayout) findViewById(R.id.routine_view);
        LinearLayout layout2 = (LinearLayout) findViewById(R.id.routine_view2);

        ScrollView sub_activity_page = (ScrollView) findViewById(R.id.sub_activity_page);

        SubLayout subLayout = null;

       String a1 =
                "\n\n ✔ 주운동 부위 : 가슴 (대흉근)  " +
                        "\n\n ✔ 부운동 부위 : 상완삼두근 및 삼각근 " +
                        "\n\n\n ✔ 운동 방법 : " +
                        "\n\n 1️⃣ 손잡이와 가슴 높이가 비슷하게 위치하도록 의자 높낮이를 조정해준다" +
                        "\n\n 2️⃣ 가슴을 펴고 허리가 과하게 꺽이지 않게 바르게 펴고 팔을 앞으로 밀어준다 " +
                        "\n\n 3️⃣ 손목, 팔꿈치를 일직선을 유지시킨 상태에서 팔꿈치를 뒤로 천천히 빼준다 " +
                        "\n\n 4️⃣ 반복해서 진행 한다 " +
                        "\n\n\n \uD83D\uDD25 tip : \n\n  팔의 각도가 중요하다, 팔꿈치의 위치가 높아서는 안된다 " +
                        "\n\n\n 🥊 효과 : \n\n 가슴 및 팔 근육을 키울 수 있다" +
                        "\n\n\n \uD83D\uDC40 주의점 : \n\n 손잡이를 잡을 때 너무 과하게 손목이 꺾이지 않기 \n\n불필요하게 승모에 힘주지 않기";

        String a2 =
                "\n\n ✔ 주운동 부위 : 등 (광배근) " +
                        "\n\n ✔ 부운동 부위 : 이두근 " +
                        "\n\n\n ✔ 운동 방법 : " +
                        "\n\n 1️⃣ 턱걸이를 하듯 어깨보다 좀 더 넓게 바를 잡는다" +
                        "\n\n 2️⃣ 상체를 뒤로 젖히고 팔이 아니라 등의 힘으로 당겨 내려온다" +
                        "\n\n 3️⃣ 저항을 느끼며 천천히 다시 올려준다 " +
                        "\n\n 4️⃣ 반복해서 진행 한다 " +
                        "\n\n\n \uD83D\uDD25 tip : \n\n  턱걸이와 가동부위는 거의 같으며, 좁게 잡을수록 광배근 안쪽이, 넓게 잡을수록 상부와 바깥쪽이 발달된다 " +
                        "\n\n\n 🥊 효과 : \n\n 광배근을 발달시키기 위한 대표적인 운동이다 \n\n 턱걸이를 하기 어려운 초보자들에게 좋은 운동이다" +
                        "\n\n\n \uD83D\uDC40 주의점 : \n\n 팔만 이용하여 바(bar)를 잡아당기면 이두근의 참여도가 지나치게 높아지므로 동작을 시작하는 시점에서 견갑골(날개뼈)을 우선적으로 내리도록 한다";

     String a3 =
                "\n\n ✔ 주운동 부위 : 등 (광배근, 중부 승모근, 능형근)  " +
                        "\n\n ✔ 부운동 부위 : 상완이두근 " +
                        "\n\n\n ✔ 운동 방법 : " +
                        "\n\n 1️⃣ 벤치에 앉아서 발판에 발을 올리고 그립을 잡고 척추를 바르게 편다" +
                        "\n\n 2️⃣ 호흡을 들이마시며 가슴을 들고 견갑골을 모아주며 그립을 당겨준다 " +
                        "\n\n 3️⃣ 숨을 내뱉으며 팔과 견갑골을 천천히 펴준다 " +
                        "\n\n 4️⃣ 반복해서 진행한다 " +
                        "\n\n\n \uD83D\uDD25 tip : \n\n  그립은 골반 쪽(밑으로)당겨주며, 팔꿈치가 벌어지지 않게 한다 " +
                        "\n\n\n 🥊 효과 : \n\n 등 근육의 크기를 키우는 운동으로 광배근 하부 크기에 관여하는 운동이다 \n\n벤트 오버 로우 동작을 앉아서 케이블을 이용해 하는 운동이다" +
                        "\n\n\n \uD83D\uDC40 주의점 : \n\n 팔꿈치로 당긴다기보다 견갑곱을 모으는데 집중해주고 척추중립을 유지해준다";

      String a4 =
                "\n\n ✔ 주운동 부위 : 팔 (상완이두근)  " +
                        "\n\n ✔ 부운동 부위 : 전완근 " +
                        "\n\n\n ✔ 운동 방법 : " +
                        "\n\n 1️⃣ 벤치에 앉아 바벨을 어깨 너비로 잡는다" +
                        "\n\n 2️⃣ 가슴과 팔을 패드에 고정시킨 후 손을 몸쪽으로 올려 이두를 수축시킨다 " +
                        "\n\n 3️⃣ 저항을 느끼며 팔을 천천히 펴준다 " +
                        "\n\n 4️⃣ 반복해서 진행한다 " +
                        "\n\n\n \uD83D\uDD25 tip : \n\n  좁게 잡으면 장두 , 넓게 잡으면 단두운동이된다 " +
                        "\n\n\n 🥊 효과 : \n\n 고정된 팔꿈치로 인해 강력한 상완 이두근 운동을 할 수 있는 머신이다 \n\n 등, 어깨의 개입을 최소화 하여 오직 이두에만 집중하기 위한 머신이다" +
                        "\n\n\n \uD83D\uDC40 주의점 : \n\n 손목이 안으로 꺽이지 않게 한다. 반동을 이용하지 않는다";

         String a5 =
                "\n\n ✔ 주운동 부위 :  가슴(대흉근) 중앙(내측근) " +
                        "\n\n ✔ 부운동 부위 : 삼각근 " +
                        "\n\n\n ✔ 운동 방법 : " +
                        "\n\n 1️⃣ 벤치에 앉아 허리는 살짝 아치형을 만든다" +
                        "\n\n 2️⃣ 손잡이를 잡은 뒤 ,가슴을 모아준다 " +
                        "\n\n 3️⃣ 가슴을 늘려준다는 느낌으로 천천히 이완한다 " +
                        "\n\n 4️⃣ 반복해서 진행한다 " +
                        "\n\n\n \uD83D\uDD25 tip : \n\n  팔힘을 이용해 수축시켜 주는 느낌이 아닌, 겨드랑이에 힘을 주고 가슴을 모아준다는 느낌으로 수축시켜준다" +
                        "\n\n\n 🥊 효과 : \n\n 운동을 처음 시작하는 초보자들이 덤벨 플라이를 실시하기 전에 근육의 자극을 경험하고 자세를 교정하는 데 효과적이다 " +
                        "\n\n\n \uD83D\uDC40 주의점 : \n\n 다리를 사용하지 않는다, 허리가 굽히지 않게 신경쓰면서 천천히 수축 이완을 한다";

        String a6 =
              "\n     ⚡등운동⚡" +
                        "\n\n ✔ 주운동 부위 : 등 (광배근)  " +
                        "\n\n ✔ 부운동 부위 : 팔 (이두근) " +
                        "\n\n\n ✔ 운동 방법 : " +
                        "\n\n 1️⃣ 어깨넓이보다 약간 더 넓게 오버핸드그립(손목이 아래로 향하여 쥐는형태)자세로 점프하여 바를 잡는다 " +
                        "\n\n 2️⃣ 등,코어,둔근을 자극하며 어깨뼈를 앞에서 뒤로 당긴다, 턱이 턱걸이 봉을 지날때까지 몸을 들어올린다 " +
                        "\n\n 3️⃣ 천천히 자극을 느끼면서 몸을 다시 처음으로 돌아온다 " +
                        "\n\n 4️⃣ 반복해서 진행한다 " +
                        "\n\n\n \uD83D\uDD25 tip : \n\n 매달리기부터 시작한다. 최소 30초 이상을 버티는 악력, 전완근이 필요하다 \n\n  횟수보다는 올바른 방법이 중요하다, 동작이 안되면 밴드를 이용하거나 매달리기 부터 하길 권장한다 " +
                        "\n\n\n 🥊 효과 : \n\n 맨손운동의 알파이자 오메가라고 불릴만큼 최고의 맨몸운동이다 \n\n 상체 전반을 단련시킨다, 특히 광배근을 단련시킨다" +
                        "\n\n\n \uD83D\uDC40 주의점 : \n\n 동작 중 몸을 고정시키며, 반동을 쓰지 않는다" ;
        String a14 =
                "\n     ⚡가슴운동⚡"+
                        "\n\n ✔ 주운동 부위 : 가슴 (대흉근) 하부  " +
                        "\n\n ✔ 부운동 부위 : 어깨 (삼각근), 팔 (삼두근) " +
                        "\n\n\n ✔ 운동 방법 : " +
                        "\n\n 1️⃣ 바를 잡고 팔꿈치를 펴고 선다" +
                        "\n\n 2️⃣ 팔꿈치를 굽혀주면서 상체를 내려준다 " +
                        "\n\n 3️⃣ 팔꿈치를 다시 펴 원위치한다 " +
                        "\n\n 4️⃣ 반복해서 진행한다 " +
                        "\n\n\n \uD83D\uDD25 tip : \n\n 힘이 부족한 경우 어시스트를 해줄 수 있는 머신. 밴드를 이용하면 수월하다 \n\n 딥스 자세는 몸의 반동이 최소화되어야 한다  " +
                        "\n\n\n 🥊 효과 : \n\n 무척 어렵고 수행하는 것 자체가 높은 난이도를 요구하지만, 가장 효과가 좋고 대표적인 가슴하부 운동이다" +
                        "\n\n\n \uD83D\uDC40 주의점 : \n\n 초보자의 경우 과도하게 내려가려다가 팔꿈치나 어깨가 망가질 수 있으니 주의해야한다" ;

        String a7 =
                "\n\n ✔ 주운동 부위 : 어깨 (측면 삼각근)  " +
                        "\n\n ✔ 부운동 부위 : 어깨 (전면 삼각근) " +
                        "\n\n\n ✔ 운동 방법 : " +
                        "\n\n 1️⃣ 벤치에 앉아 어깨선을 맞춰서 의자 높이를 조절한다" +
                        "\n\n 2️⃣ 팔꿈치는 직각이 되도록 패드에 맞춰준다 " +
                        "\n\n 3️⃣ 손잡이를 잡은 후 팔꿈치를 멀리 보낸다는 느낌으로 벌려준다 " +
                        "\n\n 4️⃣ 천천히 저항을 느끼면서 내려준다 " +
                        "\n\n\n \uD83D\uDD25 tip : \n\n 저중량 고반복이 효과적이다 " +
                        "\n\n\n 🥊 효과 : \n\n 레터럴 레이즈는 측면 삼각근을 단련하는 운동이다 \n\n 양손에 덤벨을 들고 실시하는 것이 보통이나 케이블, 머신 등으로 대체할 수도 있다" +
                        "\n\n\n \uD83D\uDC40 주의점 : \n\n 팔꿈치가 어깨보다 더 높게 올라가지 않게 한다. 부상 위험이 있다";

       String a8 =
                "\n\n ✔ 주운동 부위 : 허벅지 앞쪽(대퇴사두근)  " +
                        "\n\n ✔ 부운동 부위 : 둔근 " +
                        "\n\n\n ✔ 운동 방법 : " +
                        "\n\n 1️⃣ 등받이에 등을 대고 손잡이를 잡는다" +
                        "\n\n 2️⃣ 발목을 어깨너비보다 좁게 벌려서 롤패드에 고정시킨다 " +
                        "\n\n 3️⃣ 다리를 들어올려 무릎을 펴서 허벅지 근육을 수축시킨다 " +
                        "\n\n 4️⃣ 천천히 저항을 느끼면서 다리를 내리며 긴장을 유지한다 " +
                        "\n\n\n \uD83D\uDD25 tip : \n\n  두 다리의 근력 수준 차이를 극복하기 위해 한 발씩 실시해도 좋은 운동 " +
                        "\n\n\n 🥊 효과 : \n\n 허벅지 전면 근육을 발달시키는 운동이다 \n\n여성의 경우, 적당한 무게로 횟수를 늘려 실시하면 탄력 있는 허벅지를 만드는 데 효과적이다" +
                        "\n\n\n \uD83D\uDC40 주의점 : \n\n 상체에 반동이 일어나지 않도록 천천히 실시";

      String a9 =
                "\n\n ✔ 주운동 부위 : 허벅지 앞쪽 (대퇴사두근)  " +
                        "\n\n ✔ 부운동 부위 : 대둔근 , 슬굴곡근 " +
                        "\n\n\n ✔ 운동 방법 : " +
                        "\n\n 1️⃣ 머신에 앉아 엉덩이와 어깨를 밀착시킨다 " +
                        "\n\n 2️⃣ 양발을 발판에 대고 어깨너비만큼 벌린 다음 무릎을 핀다 " +
                        "\n\n 3️⃣ 앉는다는 느낌으로 천천히 무릎이 90도가 될 때까지 구부린다 " +
                        "\n\n 4️⃣ 발 뒤꿈치로 민다는 느낌으로 허벅지에 힘을 주면서 무릎을 편다 " +
                        "\n\n\n \uD83D\uDD25 tip : \n\n  발판의 보폭을 좁게 하면 대퇴부 바깥쪽이, 넓게 하면 대퇴부 안쪽이 발달된다 \n\n 발을 발판의 윗쪽에 대고 하면 대둔근이, 발을 발판의 아래쪽에 대고 하면 대퇴사두근 아래쪽이 발달된다" +
                        "\n\n\n 🥊 효과 : \n\n 대퇴사두근과 둔근을 강화시켜주는 대표적이고 필수적인 하체 운동이다 \n\n 초보자가 실시하기에 가장 적당한 하체 운동이며 스쿼트에 비해 허리에 가해지는 부하가 적어 비교적 무거운 무게로 운동을 할 수 있는 장점이 있다 " +
                        "\n\n\n \uD83D\uDC40 주의점 : \n\n 무릎을 완전히 펴지 말고 약간 구부려주는 것이 운동 효과에 좋다 \n\n 엉덩이와 허리가 항상 기구에 밀착해 있어야 한다";

      String a10 =
                "\n\n ✔ 주운동 부위 : 햄스트링 (넙다리뒤근육)  " +
                        "\n\n ✔ 부운동 부위 : 종아리근육 " +
                        "\n\n\n ✔ 운동 방법 : " +
                        "\n\n 1️⃣ 머신에 엎드려서 자세를 잡는다, 다리패드가 아킬레스건 위에 위치할수 있게 한다" +
                        "\n\n 2️⃣ 허벅지 뒷근육을 이용해서 당겨준다, 발끝은 다리와 90도가 되도록하며, 최대한 엉덩이까지 당겨준다 " +
                        "\n\n 3️⃣ 천천히 다리를 펴준다 " +
                        "\n\n 4️⃣ 반복해서 진행한다 " +
                        "\n\n\n \uD83D\uDD25 tip : \n\n 고중량 저반복이 효과적이다" +
                        "\n\n\n 🥊 효과 : \n\n 대퇴후면의 슬굴곡근을 발달시키기 위한 운동이다 \n\n스탠딩 레그 컬보다 많은 중량을 들 수 있는 것이 장점으로, 하체 근력이 약한 사람에게 필수적인 운동이다" +
                        "\n\n\n \uD83D\uDC40 주의점 : \n\n 엉덩이가 들리지 않게한다 , 반동을 주지 않는다";

      String a11 =
                "\n\n ✔ 주운동 부위 : 가슴 (대흉근) 하부  " +
                        "\n\n ✔ 부운동 부위 : 상완 삼두근과 전면 삼각근" +
                        "\n\n\n ✔ 운동 방법 : " +
                        "\n\n 1️⃣ 벤치에 앉아 손잡이를 잡고 허벅지를 패드에 고정시켜준 후 상체를 앞으로 살짝 숙여준다" +
                        "\n\n 2️⃣ 숨을 내쉬면서 가슴의 힘을 최대한 사용하여 팔꿈치가 완전히 펴지기 직전까지 아래로 꾹 눌러준다 " +
                        "\n\n 3️⃣ 저항을 느끼며 천천히 돌아온다 " +
                        "\n\n 4️⃣ 반복해서 진행한다 " +
                        "\n\n\n \uD83D\uDD25 tip : \n\n 상체를 앞으로 살짝 숙일때 허리, 가슴은 꼭 펴줘야한다" +
                        "\n\n\n 🥊 효과 : \n\n 디클라인 벤치 프레스와 함께 대흉근의 하부를 발달시키는 데 효과적인 운동 \n\n 일반 딥스보다 부상 위험이 적고 , 딥스를 하기 어려운 초보자에게 매우 유용한운동" +
                        "\n\n\n \uD83D\uDC40 주의점 : \n\n 어깨각도에 주의해야한다";

        String a12 =
                "\n\n ✔ 주운동 부위 : 어깨 (삼각근) " +
                        "\n\n ✔ 부운동 부위 : 상완 삼두근 , 승모근 상부 " +
                        "\n\n\n ✔ 운동 방법 : " +
                        "\n\n 1️⃣ 머신에 앉아 엉덩이와 어깨를 벤치에 밀착시킨다" +
                        "\n\n 2️⃣ 어깨너비 두 배 정도로 양손을 벌린 상태에서 손바닥이 앞을 향하도록 바를 잡는다" +
                        "\n\n 3️⃣ 손으로 밀지 말고 어깨로 드는 느낌으로 중량을 밀어 올린다 " +
                        "\n\n 4️⃣ 저항을 느끼면서 서서히 바가 귀와 평행하게 될 때까지 내린다 " +
                        "\n\n\n \uD83D\uDD25 tip : \n\n 팔꿈치를 완전히 펴면 삼각근에 자극이 풀어지게 되므로 완전히 신전하지 않는다" +
                        "\n\n\n 🥊 효과 : \n\n 삼각근의 전면과 측면의 볼륨을 키울 수 있는 다관절 운동 \n\n 머신을 이용하기 때문에 동작의 컨트롤이 용이하고 안정된 자세로 좀 더 많은 중량을 다룰 수 있다는 장점이 있다" +
                        "\n\n\n \uD83D\uDC40 주의점 : \n\n 바가 지나치게 내려오게 되면 어깨에 부상을 유발할 수 있으므로 귀 높이까지만 동작한다 \n\n 중력 방향에 대한 저항만이 근육에 가해지기 때문에 다양한 자극을 부여하기는 어려운 점이 있다";

       String a13 =
                        "\n     ⚡가슴운동⚡" +
                        "\n\n ✔ 주운동 부위 : 가슴 (흉근)  " +
                        "\n\n ✔ 부운동 부위 : 팔 (삼두근) " +
                        "\n\n\n ✔ 운동 방법 : " +
                        "\n\n 1️⃣ 봉이 내려올때 가슴 위쪽에 닿게 셋팅한 후 벤치에 누워서 허리를 아치형으로 만들어준다 " +
                        "\n\n 2️⃣ 바벨을 잡고 숨을 들이마시며 천천히 가슴위쪽까지 내린다 " +
                        "\n\n 3️⃣ 호흡을 뱉으며 힘있게 밀어 올린다 " +
                        "\n\n 4️⃣ 반복해서 진행한다" +
                        "\n\n\n \uD83D\uDD25 tip : \n\n 팔꿈치를 90도 정도 구부린다는 생각으로 천천히 내려준다 " +
                        "\n\n\n 🥊 효과 : \n\n 프리웨이트로 시행하면 가벼운 무게도 흔들리기때문에 팔힘이 비교적 약한 초보자들에게 좋다 " +
                        "\n\n\n \uD83D\uDC40 주의점 : \n\n  궤적이 고정되있기때문에 팔꿈치나 손목 부상에 조심해야한다" ;

       String a15 =
                        "\n     ⚡하체운동⚡"+
                        "\n\n ✔ 주운동 부위 : 허벅지 앞쪽(대퇴사두근)  " +
                        "\n\n ✔ 부운동 부위 : 대둔근, 술굴곡근 " +
                        "\n\n\n ✔ 운동 방법 : " +
                        "\n\n 1️⃣ 바벨을 어깨(승모근) 위에 올리고 어깨너비보다 넓게 바벨을 잡는다" +
                        "\n\n 2️⃣ 스쿼트 랙 아래에서 어깨너비로 서서 발끝이 약간 바깥쪽으로 향하도록 한다 " +
                        "\n\n 3️⃣ 무릎이 허벅지와 수평이 될때까지 앉는다 " +
                        "\n\n 4️⃣ 발뒤꿈치로 민다는 느낌으로 허벅지에 힘을 주면서 일어선다 " +
                        "\n\n\n \uD83D\uDD25 tip : \n\n 상체가 굽거나 꺾이지 않게 한다, 일어서는 동작에서 엉덩이에 힘을 주면서 일어나면 좋다 " +
                        "\n\n\n 🥊 효과 : \n\n 무릎과 등 하부에 부담을 줄이고 대퇴를 강도 높게 자극할 수 있다 \n\n 바벨 스쿼트 운동에 비해 고립된 운동으로 대퇴부와 둔부 크기를 증가시키기 위한 운동" +
                        "\n\n\n \uD83D\uDC40 주의점 : \n\n 안정성을 위해 허리는 항상 곧게 편다 \n\n 무릎을 바깥쪽 또는 안쪽으로 굽히지 말고, 일정하게 수평을 이루며 동작을 실시한다" ;

        // ## 운동기구 루틴 ##
        arrayList = new ArrayList<>();
        Intent intent = getIntent();
        String name0 = intent.getExtras().getString("name0");
        if (name0.equals("스미스머신")) {
            workout_view.setImageResource(R.drawable.smith_machine);
            workout_name.setText("스미스 머신");
            b_routine.setText("루틴B");
            textviewHtmlDocument.setText(a13);
            workout_methods.setText(a15);
            workout_methods.setVisibility(View.VISIBLE);
            workout_effect1.setText("🔺가슴");
            workout_effect2.setText("🔺하체");
            routine_intro.setText("스미스 머신이 포함된 루틴을 추천해드릴게요");

            arrayList.add(new Workout_Item("4세트", "10회", "벤치 프레스\n(가슴)", R.drawable.img_smith));
            arrayList.add(new Workout_Item("4세트", "10회", "체스트 플라이 머신\n(가슴)", R.drawable.img_chestfly));
            arrayList.add(new Workout_Item("4세트", "10회", "시티드 딥스 머신\n(삼두)", R.drawable.img_seateddips));
            arrayList.add(new Workout_Item("4세트", "10회", "치닝디핑\n(삼두)", R.drawable.img_chiningdipping));

            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setVisibility(View.VISIBLE);
                    textviewHtmlDocument.setText(a13);
                    workout_methods.setText(a15);
                    workout_effect1.setText("🔺가슴");
                    workout_effect2.setText("🔺하체");
                    workout_view.setImageResource(R.drawable.smith_machine);
                    workout_name.setText("스미스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a5);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.chest_fly);
                    workout_name.setText("체스트 플라이 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a11);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.seated_dip_machine);
                    workout_name.setText("시티드 딥스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setVisibility(View.VISIBLE);
                    textviewHtmlDocument.setText(a14);
                    workout_methods.setText(a6);
                    workout_effect1.setText("🔺등");
                    workout_effect2.setText("🔺가슴");
                    workout_view.setImageResource(R.drawable.chining_dipping);
                    workout_name.setText("치닝 디핑");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            arrayList = new ArrayList<>();

            arrayList.add(new Workout_Item("4세트", "10회", "스쿼트\n(하체)", R.drawable.img_smith));
            arrayList.add(new Workout_Item("4세트", "12회", "레그 프레스 머신\n(하체)", R.drawable.img_legpress));
            arrayList.add(new Workout_Item("4세트", "10회", "숄더 프레스 머신\n(어깨)", R.drawable.img_shoulderpress));
            arrayList.add(new Workout_Item("4세트", "15회", "레터럴 레이즈 머신\n(어깨)", R.drawable.img_lateralraise));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 레이아웃
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setVisibility(View.VISIBLE);
                    textviewHtmlDocument.setText(a15);
                    workout_methods.setText(a13);
                    workout_effect1.setText("🔺가슴");
                    workout_effect2.setText("🔺하체");
                    workout_view.setImageResource(R.drawable.smith_machine);
                    workout_name.setText("스미스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 레이아웃
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a9);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.leg_press);
                    workout_name.setText("레그 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 레이아웃
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a12);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.shoulder_press);
                    workout_name.setText("숄더 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            // 추가될 레이아웃
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a7);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.lateral_raise);
                    workout_name.setText("레터럴 레이즈 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

        } else if (name0.equals("치닝디핑")) {
            workout_view.setImageResource(R.drawable.chining_dipping);
            workout_name.setText("치닝 디핑");
            b_routine.setText("루틴B");
            textviewHtmlDocument.setText(a6);
            workout_methods.setText(a14);
            workout_methods.setVisibility(View.VISIBLE);
            workout_effect1.setText("🔺등");
            workout_effect2.setText("🔺가슴");
            routine_intro.setText("치닝 디핑이 포함된 루틴을 추천해드릴게요");

            arrayList.add(new Workout_Item("4세트", "10회", "치닝디핑\n(삼두)", R.drawable.img_chiningdipping));
            arrayList.add(new Workout_Item("4세트", "10회", "시티드 딥스 머신\n(삼두)", R.drawable.img_seateddips));
            arrayList.add(new Workout_Item("4세트", "10회", "체스트 플라이 머신\n(가슴)", R.drawable.img_chestfly));
            arrayList.add(new Workout_Item("4세트", "10회", "벤치 프레스\n(가슴)", R.drawable.img_smith));
//          for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setVisibility(View.VISIBLE);
                    textviewHtmlDocument.setText(a14);
                    workout_methods.setText(a6);
                    workout_effect1.setText("🔺등");
                    workout_effect2.setText("🔺가슴");
                    workout_view.setImageResource(R.drawable.chining_dipping);
                    workout_name.setText("치닝 디핑");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a11);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.seated_dip_machine);
                    workout_name.setText("시티드 딥스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a5);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.chest_fly);
                    workout_name.setText("체스트 플라이 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setVisibility(View.VISIBLE);
                    textviewHtmlDocument.setText(a13);
                    workout_methods.setText(a15);
                    workout_effect1.setText("🔺가슴");
                    workout_effect2.setText("🔺하체");
                    workout_view.setImageResource(R.drawable.smith_machine);
                    workout_name.setText("스미스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            arrayList = new ArrayList<>();

            arrayList.add(new Workout_Item("3세트", "8회", "치닝디핑\n(등)", R.drawable.img_chiningdipping));
            arrayList.add(new Workout_Item("4세트", "10회", "시티드 로우 머신\n(등)", R.drawable.img_seated_row));
            arrayList.add(new Workout_Item("4세트", "10회", "암 컬 머신\n(이두)", R.drawable.img_armcurl));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setVisibility(View.VISIBLE);
                    textviewHtmlDocument.setText(a6);
                    workout_methods.setText(a14);
                    workout_effect1.setText("🔺등");
                    workout_effect2.setText("🔺가슴");
                    workout_view.setImageResource(R.drawable.chining_dipping);
                    workout_name.setText("치닝 디핑");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a3);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.seated_row);
                    workout_name.setText("시티드 로우 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a4);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.bicep_curl);
                    workout_name.setText("암 컬 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

//            }

        } else if (name0.equals("숄더프레스머신")) {
            workout_view.setImageResource(R.drawable.shoulder_press);
            workout_name.setText("숄더 프레스 머신");
            b_routine.setText("루틴B");
            textviewHtmlDocument.setText(a12);
            workout_methods.setText("");
            workout_methods.setVisibility(View.GONE);
            routine_intro.setText("숄더 프레스 머신이 포함된 루틴을 추천해드릴게요");

            arrayList.add(new Workout_Item("4세트", "10회", "숄더 프레스 머신\n(어깨)", R.drawable.img_shoulderpress));
            arrayList.add(new Workout_Item("4세트", "15회", "레터럴 레이즈 머신\n(어깨)", R.drawable.img_lateralraise));
            arrayList.add(new Workout_Item("4세트", "12회", "레그 프레스 머신\n(하체)", R.drawable.img_legpress));
            arrayList.add(new Workout_Item("4세트", "10회", "스쿼트\n(하체)", R.drawable.img_smith));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a12);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.shoulder_press);
                    workout_name.setText("숄더 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a7);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.lateral_raise);
                    workout_name.setText("레터럴 레이즈 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a9);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.leg_press);
                    workout_name.setText("레그 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setVisibility(View.VISIBLE);
                    textviewHtmlDocument.setText(a15);
                    workout_methods.setText(a13);
                    workout_effect1.setText("🔺가슴");
                    workout_effect2.setText("🔺하체");
                    workout_view.setImageResource(R.drawable.smith_machine);
                    workout_name.setText("스미스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

//            }
            arrayList = new ArrayList<>();

            arrayList.add(new Workout_Item("4세트", "10회", "숄더 프레스 머신\n(어깨)", R.drawable.img_shoulderpress));
            arrayList.add(new Workout_Item("4세트", "15회", "레터럴 레이즈 머신\n(어깨)", R.drawable.img_lateralraise));
            arrayList.add(new Workout_Item("4세트", "12회", "레그 프레스 머신\n(하체)", R.drawable.img_legpress));
            arrayList.add(new Workout_Item("4세트", "12회", "레그 컬 머신\n(하체)", R.drawable.img_legcurl));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a12);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.shoulder_press);
                    workout_name.setText("숄더 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a7);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.lateral_raise);
                    workout_name.setText("레터럴 레이즈 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a9);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.leg_press);
                    workout_name.setText("레그 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a10);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.leg_curl);
                    workout_name.setText("레그 컬 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

//            }

        } else if (name0.equals("시티드딥스")) {
            workout_view.setImageResource(R.drawable.seated_dip_machine);
            workout_name.setText("시티드 딥스 머신");
            b_routine.setText("루틴B");
            textviewHtmlDocument.setText(a11);
            workout_methods.setText("");
            workout_methods.setVisibility(View.GONE);
            routine_intro.setText("시티드 딥스 머신이 포함된 루틴을 추천해드릴게요");

            arrayList.add(new Workout_Item("4세트", "10회", "시티드 딥스 머신\n(삼두)", R.drawable.img_seateddips));
            arrayList.add(new Workout_Item("4세트", "10회", "치닝디핑\n(삼두)", R.drawable.img_chiningdipping));
            arrayList.add(new Workout_Item("4세트", "10회", "체스트 플라이 머신\n(가슴)", R.drawable.img_chestfly));
            arrayList.add(new Workout_Item("4세트", "10회", "벤치 프레스\n(가슴)", R.drawable.img_smith));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a11);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.seated_dip_machine);
                    workout_name.setText("시티드 딥스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setVisibility(View.VISIBLE);
                    textviewHtmlDocument.setText(a14);
                    workout_methods.setText(a6);
                    workout_effect1.setText("🔺등");
                    workout_effect2.setText("🔺가슴");
                    workout_view.setImageResource(R.drawable.chining_dipping);
                    workout_name.setText("치닝 디핑");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a5);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.chest_fly);
                    workout_name.setText("체스트 플라이 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setVisibility(View.VISIBLE);
                    textviewHtmlDocument.setText(a13);
                    workout_methods.setText(a15);
                    workout_view.setImageResource(R.drawable.smith_machine);
                    workout_name.setText("스미스 머신");
                    workout_effect1.setText("🔺가슴");
                    workout_effect2.setText("🔺하체");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });
            arrayList = new ArrayList<>();

            arrayList.add(new Workout_Item("4세트", "10회", "시티드 딥스 머신\n(삼두)", R.drawable.img_seateddips));
            arrayList.add(new Workout_Item("4세트", "10회", "치닝디핑\n(삼두)", R.drawable.img_chiningdipping));
            arrayList.add(new Workout_Item("4세트", "10회", "체스트 프레스 머신\n(가슴)", R.drawable.img_chesspress));
            arrayList.add(new Workout_Item("4세트", "10회", "체스트 플라이 머신\n(가슴)", R.drawable.img_chestfly));
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a11);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.seated_dip_machine);
                    workout_name.setText("시티드 딥스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setVisibility(View.VISIBLE);
                    textviewHtmlDocument.setText(a14);
                    workout_methods.setText(a6);
                    workout_effect1.setText("🔺등");
                    workout_effect2.setText("🔺가슴");
                    workout_view.setImageResource(R.drawable.chining_dipping);
                    workout_name.setText("치닝 디핑");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a1);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.chest_press);
                    workout_name.setText("체스트 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a5);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.chest_fly);
                    workout_name.setText("체스트 플라이 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });


//            }


        } else if (name0.equals("레그컬머신")) {
            workout_view.setImageResource(R.drawable.leg_curl);
            workout_name.setText("레그 컬 머신");
            textviewHtmlDocument.setText(a10);
            workout_methods.setText("");
            workout_methods.setVisibility(View.GONE);
            routine_intro.setText("레그 컬 머신이 포함된 루틴을 추천해드릴게요");

            arrayList.add(new Workout_Item("4세트", "12회", "레그 컬 머신\n(하체)", R.drawable.img_legcurl));
            arrayList.add(new Workout_Item("4세트", "12회", "레그 프레스 머신\n(하체)", R.drawable.img_legpress));
            arrayList.add(new Workout_Item("4세트", "15회", "레터럴 레이즈 머신\n(어깨)", R.drawable.img_lateralraise));
            arrayList.add(new Workout_Item("4세트", "10회", "숄더 프레스 머신\n(어깨)", R.drawable.img_shoulderpress));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a10);
                    workout_view.setImageResource(R.drawable.leg_curl);
                    workout_name.setText("레그 컬 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a9);
                    workout_view.setImageResource(R.drawable.leg_press);
                    workout_name.setText("레그 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a7);
                    workout_view.setImageResource(R.drawable.lateral_raise);
                    workout_name.setText("레터럴 레이즈 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a12);
                    workout_view.setImageResource(R.drawable.shoulder_press);
                    workout_name.setText("숄더 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

//            }

        } else if (name0.equals("레그프레스")) {
            workout_view.setImageResource(R.drawable.leg_press);
            workout_name.setText("레그 프레스 머신");
            b_routine.setText("루틴B");
            textviewHtmlDocument.setText(a9);
            workout_methods.setText("");
            workout_methods.setVisibility(View.GONE);
            routine_intro.setText("레그 프레스 머신이 포함된 루틴을 추천해드릴게요");

            arrayList.add(new Workout_Item("4세트", "12회", "레그 프레스 머신\n(하체)", R.drawable.img_legpress));
            arrayList.add(new Workout_Item("4세트", "12회", "레그 컬 머신\n(하체)", R.drawable.img_legcurl));
            arrayList.add(new Workout_Item("4세트", "15회", "레터럴 레이즈 머신\n(어깨)", R.drawable.img_lateralraise));
            arrayList.add(new Workout_Item("4세트", "10회", "숄더 프레스 머신\n(어깨)", R.drawable.img_shoulderpress));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a9);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_view.setImageResource(R.drawable.leg_press);
                    workout_name.setText("레그 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a10);
                    workout_view.setImageResource(R.drawable.leg_curl);
                    workout_name.setText("레그 컬 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a7);
                    workout_view.setImageResource(R.drawable.lateral_raise);
                    workout_name.setText("레터럴 레이즈 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a12);
                    workout_view.setImageResource(R.drawable.shoulder_press);
                    workout_name.setText("숄더 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

//            }
            arrayList = new ArrayList<>();

            arrayList.add(new Workout_Item("4세트", "12회", "레그 프레스 머신\n(하체)", R.drawable.img_legpress));
            arrayList.add(new Workout_Item("4세트", "10회", "스쿼트\n(하체)", R.drawable.img_smith));
            arrayList.add(new Workout_Item("4세트", "15회", "레터럴 레이즈 머신\n(어깨)", R.drawable.img_lateralraise));
            arrayList.add(new Workout_Item("4세트", "10회", "숄더 프레스 머신\n(어깨)", R.drawable.img_shoulderpress));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a12);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.shoulder_press);
                    workout_name.setText("숄더 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setVisibility(View.VISIBLE);
                    textviewHtmlDocument.setText(a15);
                    workout_methods.setText(a13);
                    workout_view.setImageResource(R.drawable.smith_machine);
                    workout_name.setText("스미스 머신");
                    workout_effect1.setText("🔺가슴");
                    workout_effect2.setText("🔺하체");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a7);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.lateral_raise);
                    workout_name.setText("레터럴 레이즈 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    textviewHtmlDocument.setText(a12);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.shoulder_press);
                    workout_name.setText("숄더 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

//            }

        } else if (name0.equals("레그익스텐션")) {
            workout_view.setImageResource(R.drawable.leg_extension);
            workout_name.setText("레그 익스텐션 머신");
            textviewHtmlDocument.setText(a8);
            workout_methods.setText("");
            workout_methods.setVisibility(View.GONE);
            routine_intro.setText("레그 익스텐션 머신이 포함된 루틴을 추천해드릴게요");

            arrayList.add(new Workout_Item("4세트", "12회", "레그 익스텐션\n(하체)", R.drawable.img_legextention));
            arrayList.add(new Workout_Item("4세트", "12회", "레그 컬 머신\n(하체)", R.drawable.img_legcurl));
            arrayList.add(new Workout_Item("4세트", "15회", "레터럴 레이즈 머신\n(어깨)", R.drawable.img_lateralraise));
            arrayList.add(new Workout_Item("4세트", "10회", "숄더 프레스 머신\n(어깨)", R.drawable.img_shoulderpress));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a8);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.leg_extension);
                    workout_name.setText("레그 익스텐션 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a10);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.leg_curl);
                    workout_name.setText("레그 컬 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a7);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.lateral_raise);
                    workout_name.setText("레터럴 레이즈 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a12);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.shoulder_press);
                    workout_name.setText("숄더 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

//            }

        } else if (name0.equals("레터럴레이즈머신")) {
            workout_view.setImageResource(R.drawable.lateral_raise);
            workout_name.setText("레터럴 레이즈 머신");
            b_routine.setText("루틴B");
            textviewHtmlDocument.setText(a7);
            workout_methods.setText("");
            workout_methods.setVisibility(View.GONE);
            routine_intro.setText("레터럴 레이즈 머신이 포함된 루틴을 추천해드릴게요");

            arrayList.add(new Workout_Item("4세트", "15회", "레터럴 레이즈\n머신 (어깨)", R.drawable.img_lateralraise));
            arrayList.add(new Workout_Item("4세트", "10회", "숄더 프레스 머신\n(어깨)", R.drawable.img_shoulderpress));
            arrayList.add(new Workout_Item("4세트", "12회", "레그 프레스 머신\n(하체)", R.drawable.img_legpress));
            arrayList.add(new Workout_Item("4세트", "10회", "스쿼트\n(하체)", R.drawable.img_smith));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a7);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.lateral_raise);
                    workout_name.setText("레터럴 레이즈 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a12);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.shoulder_press);
                    workout_name.setText("숄더 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a9);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.leg_press);
                    workout_name.setText("레그 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a15);
                    workout_methods.setText(a13);
                    workout_methods.setVisibility(View.VISIBLE);
                    workout_effect1.setText("🔺가슴");
                    workout_effect2.setText("🔺하체");
                    workout_view.setImageResource(R.drawable.smith_machine);
                    workout_name.setText("스미스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });
//            }
            arrayList = new ArrayList<>();

            arrayList.add(new Workout_Item("4세트", "15회", "레터럴 레이즈 머신\n(어깨)", R.drawable.img_lateralraise));
            arrayList.add(new Workout_Item("4세트", "10회", "숄더 프레스 머신\n(어깨)", R.drawable.img_shoulderpress));
            arrayList.add(new Workout_Item("4세트", "10회", "레그 익스텐션\n(하체)", R.drawable.img_legextention));
            arrayList.add(new Workout_Item("4세트", "12회", "레그 컬 머신\n(하체)", R.drawable.img_legcurl));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a7);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.lateral_raise);
                    workout_name.setText("레터럴 레이즈 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a12);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.shoulder_press);
                    workout_name.setText("숄더 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a8);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.leg_extension);
                    workout_name.setText("레그 익스텐션 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a10);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.leg_curl);
                    workout_name.setText("레그 컬 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

//            }
        } else if (name0.equals("체스트플라이머신")) {
            workout_view.setImageResource(R.drawable.chest_fly);
            workout_name.setText("체스트 플라이 머신");
            b_routine.setText("루틴B");
            textviewHtmlDocument.setText(a5);
            workout_methods.setText("");
            workout_methods.setVisibility(View.GONE);
            routine_intro.setText("체스트 플라이 머신이 포함된 루틴을 추천해드릴게요");

            arrayList.add(new Workout_Item("4세트", "10회", "체스트 플라이 머신\n(가슴)", R.drawable.img_chestfly));
            arrayList.add(new Workout_Item("4세트", "10회", "벤치 프레스\n(가슴)", R.drawable.img_smith));
            arrayList.add(new Workout_Item("4세트", "10회", "시티드 딥스 머신\n(삼두)", R.drawable.img_seateddips));
            arrayList.add(new Workout_Item("4세트", "10회", "치닝디핑\n(삼두)", R.drawable.img_chiningdipping));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a5);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.chest_fly);
                    workout_name.setText("체스트 플라이 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a13);
                    workout_methods.setText(a15);
                    workout_methods.setVisibility(View.VISIBLE);
                    workout_effect1.setText("🔺가슴");
                    workout_effect2.setText("🔺하체");
                    workout_view.setImageResource(R.drawable.smith_machine);
                    workout_name.setText("스미스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a11);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.seated_dip_machine);
                    workout_name.setText("시티드 딥스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a14);
                    workout_methods.setText(a6);
                    workout_methods.setVisibility(View.VISIBLE);
                    workout_effect1.setText("🔺등");
                    workout_effect2.setText("🔺가슴");
                    workout_view.setImageResource(R.drawable.chining_dipping);
                    workout_name.setText("치닝 디핑");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });
//            }
            arrayList = new ArrayList<>();

            arrayList.add(new Workout_Item("4세트", "10회", "체스트 플라이 머신\n(가슴)", R.drawable.img_chestfly));
            arrayList.add(new Workout_Item("4세트", "10회", "체스트 프레스 머신\n(가슴)", R.drawable.img_chesspress));
            arrayList.add(new Workout_Item("4세트", "10회", "시티드 딥스 머신\n(삼두)", R.drawable.img_seateddips));
            arrayList.add(new Workout_Item("4세트", "10회", "치닝디핑\n(삼두)", R.drawable.img_chiningdipping));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a5);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.chest_fly);
                    workout_name.setText("체스트 플라이 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a1);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.chest_press);
                    workout_name.setText("체스트 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a11);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.seated_dip_machine);
                    workout_name.setText("시티드 딥스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a14);
                    workout_methods.setText(a6);
                    workout_methods.setVisibility(View.VISIBLE);
                    workout_effect1.setText("🔺등");
                    workout_effect2.setText("🔺가슴");
                    workout_view.setImageResource(R.drawable.chining_dipping);
                    workout_name.setText("치닝 디핑");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

//            }
        } else if (name0.equals("암컬머신")) {
            workout_view.setImageResource(R.drawable.bicep_curl);
            workout_name.setText("암 컬 머신");
            b_routine.setText("루틴B");
            textviewHtmlDocument.setText(a4);
            workout_methods.setText("");
            workout_methods.setVisibility(View.GONE);
            routine_intro.setText("암 컬 머신이 포함된 루틴을 추천해드릴게요");

            arrayList.add(new Workout_Item("4세트", "10회", "암 컬 머신\n(이두)", R.drawable.img_armcurl));
            arrayList.add(new Workout_Item("4세트", "10회", "치닝디핑\n(삼두)", R.drawable.img_chiningdipping));
            arrayList.add(new Workout_Item("4세트", "10회", "시티드 딥스 머신\n(삼두)", R.drawable.img_seateddips));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a4);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.bicep_curl);
                    workout_name.setText("암 컬 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a14);
                    workout_methods.setText(a6);
                    workout_methods.setVisibility(View.VISIBLE);
                    workout_effect1.setText("🔺등");
                    workout_effect2.setText("🔺가슴");
                    workout_view.setImageResource(R.drawable.chining_dipping);
                    workout_name.setText("치닝 디핑");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a11);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.seated_dip_machine);
                    workout_name.setText("시티드 딥스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });
//            }
            arrayList = new ArrayList<>();

            arrayList.add(new Workout_Item("4세트", "10회", "암 컬 머신\n(이두)", R.drawable.img_armcurl));
            arrayList.add(new Workout_Item("4세트", "10회", "랫 풀 다운\n(등)", R.drawable.img_latpulldown));
            arrayList.add(new Workout_Item("4세트", "10회", "시티드 로우 머신\n(등)", R.drawable.img_seated_row));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a4);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.bicep_curl);
                    workout_name.setText("암 컬 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a2);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.lat_pulldown);
                    workout_name.setText("랫 풀 다운");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a3);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.seated_row);
                    workout_name.setText("시티드 로우 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

//            }
        } else if (name0.equals("시티드로우")) {
            workout_view.setImageResource(R.drawable.seated_row);
            workout_name.setText("시티드 로우 머신");
            b_routine.setText("루틴B");
            textviewHtmlDocument.setText(a3);
            workout_methods.setText("");
            workout_methods.setVisibility(View.GONE);
            routine_intro.setText("시티드 로우 머신이 포함된 루틴을 추천해드릴게요");

            arrayList.add(new Workout_Item("4세트", "10회", "시티드 로우 머신\n(등)", R.drawable.img_seated_row));
            arrayList.add(new Workout_Item("3세트", "8회", "치닝디핑\n(등)", R.drawable.img_chiningdipping));
            arrayList.add(new Workout_Item("4세트", "10회", "암 컬 머신\n(이두)", R.drawable.img_armcurl));
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a3);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.seated_row);
                    workout_name.setText("시티드 로우 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a6);
                    workout_methods.setText(a14);
                    workout_methods.setVisibility(View.VISIBLE);
                    workout_effect1.setText("🔺등");
                    workout_effect2.setText("🔺가슴");
                    workout_view.setImageResource(R.drawable.chining_dipping);
                    workout_name.setText("치닝 디핑");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a4);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.bicep_curl);
                    workout_name.setText("암 컬 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            arrayList = new ArrayList<>();

            arrayList.add(new Workout_Item("4세트", "10회", "시티드 로우 머신\n(등)", R.drawable.img_seated_row));
            arrayList.add(new Workout_Item("4세트", "10회", "랫 풀 다운\n(등)", R.drawable.img_latpulldown));
            arrayList.add(new Workout_Item("4세트", "10회", "암 컬 머신\n(이두)", R.drawable.img_armcurl));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a3);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.seated_row);
                    workout_name.setText("시티드 로우 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a2);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.lat_pulldown);
                    workout_name.setText("랫 풀 다운");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            layout2.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a4);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.bicep_curl);
                    workout_name.setText("암 컬 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });
        } else if (name0.equals("랫풀다운")) {
            workout_view.setImageResource(R.drawable.lat_pulldown);
            workout_name.setText("랫 풀 다운");
            textviewHtmlDocument.setText(a2);
            workout_methods.setText("");
            workout_methods.setVisibility(View.GONE);
            routine_intro.setText("랫 풀 다운이 포함된 루틴을 추천해드릴게요");

            arrayList.add(new Workout_Item("4세트", "10회", "랫 풀 다운\n(등)", R.drawable.img_latpulldown));
            arrayList.add(new Workout_Item("4세트", "10회", "치닝 디핑\n(등)", R.drawable.img_chiningdipping));
            arrayList.add(new Workout_Item("4세트", "10회", "암 컬 머신\n(이두)", R.drawable.img_armcurl));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a2);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_view.setImageResource(R.drawable.lat_pulldown);
                    workout_name.setText("랫 풀 다운");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a6);
                    workout_methods.setText(a14);
                    workout_methods.setVisibility(View.VISIBLE);
                    workout_effect1.setText("🔺등");
                    workout_effect2.setText("🔺가슴");
                    workout_view.setImageResource(R.drawable.chining_dipping);
                    workout_name.setText("치닝 디핑");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a4);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_view.setImageResource(R.drawable.bicep_curl);
                    workout_name.setText("암 컬 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });
        } else if (name0.equals("체스트프레스머신")) {
            workout_view.setImageResource(R.drawable.chest_press);
            workout_name.setText("체스트 프레스 머신");
            textviewHtmlDocument.setText(a1);
            workout_methods.setText("");
            workout_methods.setVisibility(View.GONE);
            routine_intro.setText("체스트 프레스 머신이 포함된 루틴을 추천해드릴게요");

            arrayList.add(new Workout_Item("4세트", "10회", "체스트 프레스 머신\n(가슴)", R.drawable.img_chesspress));
            arrayList.add(new Workout_Item("4세트", "10회", "체스트 플라이 머신\n(가슴)", R.drawable.img_chestfly));
            arrayList.add(new Workout_Item("4세트", "10회", "시티드 딥스 머신\n(삼두)", R.drawable.img_seateddips));
            arrayList.add(new Workout_Item("4세트", "10회", "치닝디핑\n(삼두)", R.drawable.img_chiningdipping));
//            for (int i = 0; i < arrayList.size(); i++) {
            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(0));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a1);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.chest_press);
                    workout_name.setText("체스트 프레스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(1));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a5);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.chest_fly);
                    workout_name.setText("체스트 플라이 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(2));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a11);
                    workout_methods.setText("");
                    workout_methods.setVisibility(View.GONE);
                    workout_effect1.setText("");
                    workout_effect2.setText("");
                    workout_view.setImageResource(R.drawable.seated_dip_machine);
                    workout_name.setText("시티드 딥스 머신");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });

            // 추가할 레이아웃
            subLayout = new SubLayout(getApplicationContext(), arrayList.get(3));
            // 추가될 위치
            layout.addView(subLayout);
            subLayout.iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ObjectAnimator.ofInt(sub_activity_page, "scrollY", 0).setDuration(600).start();
                    textviewHtmlDocument.setText(a14);
                    workout_methods.setText(a6);
                    workout_methods.setVisibility(View.VISIBLE);
                    workout_effect1.setText("🔺등");
                    workout_effect2.setText("🔺가슴");
                    workout_view.setImageResource(R.drawable.chining_dipping);
                    workout_name.setText("치닝 디핑");
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String urls = "https://www.youtube.com/results?search_query=";
                            Intent intents = new Intent(Intent.ACTION_VIEW, Uri.parse(urls + workout_name.getText()));
                            startActivity(intents);
                        }
                    });
                }
            });
        }
    }
}