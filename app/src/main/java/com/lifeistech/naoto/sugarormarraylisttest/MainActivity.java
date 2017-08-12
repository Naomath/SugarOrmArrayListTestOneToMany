package com.lifeistech.naoto.sugarormarraylisttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fafa(View view){
        String test = "huh";
        ArrayList<TwoWords> arrayList = new ArrayList<>();
        for (int i = 0;i<6;i++){
            TwoWords twoWords = new TwoWords(test);
            twoWords.save();
            arrayList.add(twoWords);
        }
        String str = "test";
        int size = arrayList.size();
        long firstid = (long) arrayList.get(0).getId();
        Group group = new Group(str, size, firstid);
        group.save();
    }

    public void add(View view){
        Group group = Group.findById(Group.class, 0L);
        ArrayList<TwoWords> arrayList = new ArrayList<>();
        int size = group.size;
        long firstid = group.firstid;
        String str = group.str;
        for (int i = 0;i<size;firstid++){
            TwoWords twoWords = TwoWords.findById(TwoWords.class, firstid);
            arrayList.add(twoWords);
        }
        Log.d("test",String.valueOf(arrayList.size()));
    }
}
