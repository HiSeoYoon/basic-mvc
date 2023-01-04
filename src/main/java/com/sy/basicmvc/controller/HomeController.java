package com.sy.basicmvc.controller;

import com.sy.basicmvc.model.HomeInfo;
import com.sy.basicmvc.service.HomeServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeServiceI homeServiceI;

    @ResponseBody
    @PostMapping()
    public ResponseEntity<?> addHome(@RequestBody HomeInfo info) {

        System.out.println("ECHO: " + info.getId() + ", " + info.getName());

        HashMap<String, Object> reqMap = homeServiceI.doHomeService(info);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=UTF-8");

        return new ResponseEntity<>(reqMap,headers, HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping()
    public ResponseEntity<?> getHomeInfo(@RequestBody HomeInfo info) {

        System.out.println("ECHO: " + info.getId() + ", " + info.getName());

        HashMap<String, Object> reqMap = homeServiceI.doHomeService(info);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=UTF-8");

        return new ResponseEntity<>(reqMap,headers, HttpStatus.OK);
    }
}
