package com.lifeistech.naoto.sugarormarraylisttest;

import com.orm.SugarRecord;

/**
 * Created by naoto on 2017/08/12.
 */

public class Group extends SugarRecord {
    String str;

    int size;

    long firstid;

    public Group(){

    }

    public Group(String str, int size, long firstid){
        this.str = str;
        this.size = size;
        this.firstid = firstid;
    }


}
