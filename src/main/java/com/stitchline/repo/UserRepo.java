package com.stitchline.repo;

import com.stitchline.dto.UserDTO;
import com.stitchline.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 12/3/2021
 **/
@Repository
public interface UserRepo extends MongoRepository<User,String> {
    Optional<User> findUserByUsernameAndPassword(String userName,String password);
}
