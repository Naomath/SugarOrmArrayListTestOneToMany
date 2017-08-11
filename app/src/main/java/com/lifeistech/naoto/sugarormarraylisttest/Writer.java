package com.lifeistech.naoto.sugarormarraylisttest;

import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by naoto on 2017/08/10.
 */

public class Writer extends SugarRecord{
    String name;

    public  Writer(){

    }

    public List<TwoWords> getTwoWords(){
        return TwoWords.find(TwoWords.class, "writer = ?",String.valueOf(this.getId()));
    }

}
