package com.shiblee.demoswagger;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Database {

    public Database() {
    }

    ArrayList<String> names = new ArrayList<>();

    public String savedName( String name){
        int i =0;
         names.add(name);

        return name;
    }
    public String getName( int i){

        return names.get(i);
    }







}
