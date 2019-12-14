package com.great;


import com.great.dao.UserDao;

import java.util.HashMap;
import java.util.Map;

public class Spring {

    private Map<String, Object> daoMap = new HashMap<String, Object>();
    private static Spring  spring = null;

    private Spring(){
        init();
    }

    private void init(){

        daoMap.put("userDao", new UserDao());
    }

    public static Object getBean(String key){
        if(spring == null) {
            spring = new Spring();
        }

        return spring.daoMap.get(key);
    }



}
