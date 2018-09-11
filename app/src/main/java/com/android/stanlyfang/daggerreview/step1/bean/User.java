package com.android.stanlyfang.daggerreview.step1.bean;

import javax.inject.Inject;

public class User {
    @Inject
    public User(){
        this.Name = "Stanly";
    }

    private String Name;
    private String ID;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
