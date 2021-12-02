package com.stitchline.service;

import com.stitchline.dto.UserDTO;
import com.stitchline.entity.User;

import java.util.Optional;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 12/3/2021
 **/
public interface UserService {
    boolean addUser(UserDTO dto);
    UserDTO getUser (String userName);
}
