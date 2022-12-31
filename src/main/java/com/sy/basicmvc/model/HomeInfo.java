package com.sy.basicmvc.model;

import lombok.Data;

@Data
public class HomeInfo {
    private String name;
    private String id;

    public HomeInfo(){
        name = "";
        id = "";
    }
}
