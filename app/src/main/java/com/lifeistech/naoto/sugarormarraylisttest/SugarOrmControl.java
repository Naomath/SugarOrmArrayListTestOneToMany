package com.lifeistech.naoto.sugarormarraylisttest;

import com.orm.SugarApp;
import com.orm.SugarContext;

/**
 * Created by naoto on 2017/08/10.
 */

public class SugarOrmControl extends SugarApp {

    @Override
    public void onCreate(){
        super.onCreate();
        SugarContext.init(this);
    }
}
