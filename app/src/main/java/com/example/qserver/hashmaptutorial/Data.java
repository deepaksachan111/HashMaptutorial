package com.example.qserver.hashmaptutorial;

/**
 * Created by QServer on 3/18/2016.
 */
public class Data {

    private  String name ;
    private String id;

    public Data(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
