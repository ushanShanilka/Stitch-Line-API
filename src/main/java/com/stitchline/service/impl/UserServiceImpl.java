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
        repo.save(mapper.map(dto, User.class));
        return true;
    }

    @Override
    public UserDTO getUser(String userName) {
        System.out.println(userName);
        Optional<User> byId = repo.findById(userName);
        return mapper.map(byId,UserDTO.class);
    }


}
