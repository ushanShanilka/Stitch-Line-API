package com.stitchline.controller;

import com.stitchline.dto.UserDTO;
import com.stitchline.service.UserService;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 12/3/2021
 **/
@RestController
@RequestMapping("/api/v1/service")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping(path = "/register")
    public boolean addUser(@RequestBody UserDTO dto){
        return service.addUser(dto);
    }

    @PostMapping(path = "/login")
    public UserDTO getUSer(@RequestBody String userName){
        System.out.println((userName));
        return service.getUser(userName);
    }
}
