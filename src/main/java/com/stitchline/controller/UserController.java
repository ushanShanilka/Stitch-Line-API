package com.stitchline.controller;

import com.stitchline.dto.UserDTO;
import com.stitchline.dto.UserLoginDTO;
import com.stitchline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 12/3/2021
 **/
@RestController
@RequestMapping("/api/v1/service")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping(path = "/register")
    public boolean addUser(@RequestBody UserDTO dto){
        return service.addUser(dto);
    }

    @PostMapping(path = "/login")
    public UserDTO loginUSer(@RequestBody UserLoginDTO loginDTO){
        return service.findUserByUsernameAndPassword(loginDTO.getUserName(), loginDTO.getPassword());
    }
}
