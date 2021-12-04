package com.stitchline.controller;

import com.stitchline.dto.JwtRequestDTO;
import com.stitchline.dto.JwtResponseDTO;
import com.stitchline.dto.UserDTO;
import com.stitchline.dto.UserLoginDTO;
import com.stitchline.service.UserService;
import com.stitchline.service.impl.UserServiceImpl;
import com.stitchline.utility.JTWUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
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

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private JTWUtility jwtUtility;

    @Autowired
    private AuthenticationManager manager;

    @GetMapping
    public String test(){
        return "Test";
    }

    @PostMapping(path = "/register")
    public boolean addUser(@RequestBody UserDTO dto){
        return service.addUser(dto);
    }

    @PostMapping(path = "/login")
    public UserDTO loginUSer(@RequestBody UserLoginDTO loginDTO){
        try {
            if (loginDTO.getUserName() != null && loginDTO.getPassword() != null){
                return service.findUserByUsernameAndPassword(loginDTO.getUserName(),loginDTO.getPassword());
            }else {
                throw new Exception("Wrong");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    @PostMapping("/auth")
    public JwtResponseDTO authenticate(@RequestBody JwtRequestDTO dto) throws Exception{
        try {
            manager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            dto.getUsername(),
                            dto.getPassword()
                    )
            );
        }catch (BadCredentialsException e){
            throw  new Exception("Invalid", e);
        }
        final UserDetails userDetails
                = userService.loadUserByUsername(dto.getUsername());
        final String token =
                jwtUtility.generateToken(userDetails);

        System.out.println(token);

        return  new JwtResponseDTO(token);
    }
}

