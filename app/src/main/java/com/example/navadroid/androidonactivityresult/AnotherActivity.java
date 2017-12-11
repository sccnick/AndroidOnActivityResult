package com.example.navadroid.androidonactivityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    private static final int RESULT_OK = 0;
    //    private final int REQUEST_CODE = 555;
    private TextView tvFullName, tvSurName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        tvFullName = (TextView) findViewById(R.id.tvFullname);
        tvSurName = (TextView) findViewById(R.id.tvSurname);

//        Bundle extras = getIntent().getExtras();

        Intent intent = getIntent();

        if (intent.hasExtra("Value1")) {
            tvFullName.setText(intent.getExtras().getString("Value1"));
        }
        if(intent.hasExtra("Value2")) {
            tvSurName.setText(intent.getExtras().getString("Value2"));
        }


    }

    @Override
    public void finish() {
        Intent intent = new Intent();

//        if (((RadioButton) findViewById(R.id.rb_apple)).isChecked()) {
//            intent.putExtra("returnKey1", "This is an apple.");
//        }
//        if (((RadioButton) findViewById(R.id.rb_pen)).isChecked()) {
//            intent.putExtra("returnKey2", "This is a pen.");
//        }

        setResult(RESULT_OK, intent);
        //
        super.finish();
    }
}
