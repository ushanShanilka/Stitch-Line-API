package com.stitchline.service.impl;

import com.stitchline.dto.ProgramDTO;
import com.stitchline.entity.Program;
import com.stitchline.repo.ProgramRepo;
import com.stitchline.service.ProgramService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 12/3/2021
 **/
@Service
public class ProgramServiceImpl implements ProgramService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private ProgramRepo repo;

    @Override
    public boolean addProgram(ProgramDTO dto) {
        repo.save(mapper.map(dto, Program.class));
        return true;
    }

    @Override
    public boolean updateProgram(ProgramDTO dto) {
        if (repo.existsById(dto.getName())){
            repo.save(mapper.map(dto,Program.class));
        }
        return false;
    }

}
