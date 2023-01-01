package com.sy.basicmvc.service;

import com.sy.basicmvc.model.HomeInfo;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class HomeService implements HomeServiceI {
    @Override
    public HashMap<String, Object> doHomeService(HomeInfo info) {
        HashMap<String, Object> resMap = new HashMap<>();
        resMap.put("name", info.getName());
        resMap.put("id", info.getId());

        return resMap;
    }
}
