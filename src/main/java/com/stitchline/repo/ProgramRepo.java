package com.stitchline.repo;

import com.stitchline.entity.Program;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 12/3/2021
 **/
@Repository
public interface ProgramRepo extends MongoRepository<Program,String> {
}
