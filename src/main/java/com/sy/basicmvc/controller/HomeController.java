package com.sy.basicmvc.controller;

import com.sy.basicmvc.model.HomeInfo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("/home")
public class HomeController {

    @ResponseBody
    @GetMapping()
    public ResponseEntity<?> homeReq(@RequestBody HomeInfo info) {

        System.out.println("ECHO: " + info.getId() + ", " + info.getName());

        HashMap<String, Object> reqMap = new HashMap<>();
        reqMap.put("resCode", 0);
        reqMap.put("resMsg", "OK");

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=UTF-8");

        return new ResponseEntity<>(reqMap,headers, HttpStatus.OK);
    }
}
