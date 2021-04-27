package com.milkywaylhy.ex28activitiy3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class secondActivity extends AppCompatActivity {

    EditText etid;
    EditText etps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etid= findViewById(R.id.et_id);
        etps= findViewById(R.id.et_password);
    }

    public void clickBtn(View view) {
        // 나에게 왔던 택배기사님에게 데이터들을 넣어서 되돌려 보내기

        String id= etid.getText().toString();
        String passward= etps.getText().toString();

        //나에게 왔던 텍배기사님 소환
        Intent intent= getIntent();
        intent.putExtra("id",id);
        intent.putExtra("passward",passward);
        //결과를 주었다고 명시
        this.setResult(RESULT_OK);
        //이 액티비티를 종료
        finish();

    }
}