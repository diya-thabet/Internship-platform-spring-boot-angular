package enicar.platform.stages.controller;

import enicar.platform.stages.DTO.HackathonDTO;
import enicar.platform.stages.service.HackathonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/hackathons")
@CrossOrigin(origins = "*")
public class HackathonController {

    @Autowired
    private HackathonService hackathonService;

    @GetMapping
    public List<HackathonDTO> getAllHackathons() {
        return hackathonService.getAllHackathons();
    }

    @GetMapping("/node-hackel")
    public List<HackathonDTO> getNodeHackel() {
        return hackathonService.getNodeHackel();
    }
}