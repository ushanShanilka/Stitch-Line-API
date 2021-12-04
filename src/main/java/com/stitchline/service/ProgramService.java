package com.stitchline.service;

import com.stitchline.dto.ProgramDTO;

import java.util.List;


/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 12/3/2021
 **/
public interface ProgramService {
    boolean addProgram(ProgramDTO dto);
    boolean updateProgram(ProgramDTO dto);
    List<ProgramDTO> getAllPrograms();
}
