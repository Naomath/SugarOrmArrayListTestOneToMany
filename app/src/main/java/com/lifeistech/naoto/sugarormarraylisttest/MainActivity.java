package com.lifeistech.naoto.sugarormarraylisttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fafa(View view){
        String test = "huh";
        for (int i = 0;i<6;i++){
            TwoWords twoWords = new TwoWords(test);
            twoWords.save();
        }
        Writer writer = new Writer();
        List<TwoWords> list = writer.getTwoWords();
        String jyaku = "pp";
    }
}
