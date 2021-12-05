package com.stitchline.controller;

import com.stitchline.dto.ProgramDTO;
import com.stitchline.dto.SearchProgramDTO;
import com.stitchline.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 12/3/2021
 **/
@RestController
@RequestMapping("/api/v1/content/programs")
@CrossOrigin(origins = "http://localhost:4200")
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

    @GetMapping(path = "/all")
    public List<ProgramDTO> getAllProgram(){
        List<ProgramDTO> allPrograms = service.getAllPrograms();
        System.out.println(allPrograms);
        List<ProgramDTO> allPrograms1 = service.getAllPrograms();
        return allPrograms1;
    }


    @GetMapping
    public List<ProgramDTO> getProgramBetweenDate(@RequestBody SearchProgramDTO dto){
        List<ProgramDTO> programByStart_dateAndEnd_date = service.findProgram(dto.getStartDate(), dto.getEndDate());
        return programByStart_dateAndEnd_date;
    }
}
