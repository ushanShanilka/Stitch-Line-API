package com.stitchline.controller;

import com.stitchline.dto.ProgramDTO;
import com.stitchline.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 12/3/2021
 **/
@RestController
@RequestMapping("/api/v1/content")
public class ProgramController {

    @Autowired
    private ProgramService service;

    @PostMapping(path = "/create")
    public boolean addProgram(@RequestBody ProgramDTO dto){
        return service.addProgram(dto);
    }

    @PostMapping("/update")
    public boolean updateProgram(@RequestBody ProgramDTO dto){
        return service.updateProgram(dto);
    }

}
