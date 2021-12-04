package com.stitchline.service.impl;

import com.stitchline.dto.UserDTO;
import com.stitchline.entity.User;
import com.stitchline.repo.UserRepo;
import com.stitchline.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 12/3/2021
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private UserRepo repo;


    @Override
    public boolean addUser(UserDTO dto) {
        if (repo.existsById(dto.getUsername())){
            return false;
        }else {
            repo.save(mapper.map(dto, User.class));
            return true;
        }
    }

    @Override
    public UserDTO getUser(String userName, String password) {
        System.out.println(userName + " " + password);
        Optional<User> byId = repo.findById(userName);
        return mapper.map(byId,UserDTO.class);
    }

    @Override
    public UserDTO findUserByUsernameAndPassword(String userName, String password) {
        Optional<User> userByUsernameAndPassword = repo.findUserByUsernameAndPassword(userName, password);
        if (userByUsernameAndPassword.isPresent()){
            User user = userByUsernameAndPassword.get();
            return mapper.map(user,UserDTO.class);
        }
        return null;
    }


}
