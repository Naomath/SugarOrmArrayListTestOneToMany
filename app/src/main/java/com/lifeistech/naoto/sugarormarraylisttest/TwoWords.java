package com.lifeistech.naoto.sugarormarraylisttest;

import com.orm.SugarRecord;

/**
 * Created by naoto on 2017/08/10.
 */

public class TwoWords extends SugarRecord {
    String name;

    public TwoWords(){

    }

    public TwoWords(String name){
        this.name = name;
    }
}
