package com.sy.basicmvc.service;

import com.sy.basicmvc.model.HomeInfo;

import java.util.HashMap;

public interface HomeServiceI {
    public HashMap<String, Object> doHomeService(HomeInfo info);
}
