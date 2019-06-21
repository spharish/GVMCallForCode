package com.ngocollaborator.model;

public class HelpRequest {

    String id;
    String name;

    public HelpRequest(String s) {
        name = s;
        id = "1";

    }

    public HelpRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
