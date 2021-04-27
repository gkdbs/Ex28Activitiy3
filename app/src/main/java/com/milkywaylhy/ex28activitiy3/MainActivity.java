package com.milkywaylhy.ex28activitiy3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);

    }

    public void clickBtn(View view) {
        //결과(data)를 받기 위해 secondactivity 실행
        Intent intent = new Intent(this, secondActivity.class);
        startActivityForResult(intent, 10);
    }

    //startActivityForResult()로 실행한 ACtivity 가 종료되면
    //다시 이 액티비티(MainActivity)가 보이게 될때
    //자동으로 실행되는 콜백 메소드
    @Override
    public void onActivityReenter(int resultCode, Intent data) {
        super.onActivityReenter(resultCode, data);

        switch (resultCode) {
            case 10:
                if (resultCode == RESULT_OK) {
                    //결과가 ok냐 - 결과코드(result code)
                    //이 메소드의 3번째 파라미터 : Intent data=돌아온 택배기사
                    String id = data.getStringExtra("id");
                    String password = data.getStringExtra("passward");
                    tv.setText(id + "\n" + password);

                    break;
                }
        }
    }
}