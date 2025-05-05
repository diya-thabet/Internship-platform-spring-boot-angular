package enicar.platform.stages.controller;

import enicar.platform.stages.DTO.MentorDTO;
import enicar.platform.stages.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/mentors")
@CrossOrigin(origins = "*")
public class MentorController {

    @Autowired
    private MentorService mentorService;

    @GetMapping
    public List<MentorDTO> getAllMentors() {
        return mentorService.getAllMentors();
    }
}