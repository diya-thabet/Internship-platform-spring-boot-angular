package enicar.platform.stages.controller;

import enicar.platform.stages.DTO.RoadmapDTO;
import enicar.platform.stages.service.RoadmapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/roadmaps")
@CrossOrigin(origins = "*")
public class RoadmapController {

    @Autowired
    private RoadmapService roadmapService;

    @GetMapping
    public List<RoadmapDTO> getAllRoadmaps() {
        return roadmapService.getAllRoadmaps();
    }

    @GetMapping("/type/{type}")
    public List<RoadmapDTO> getRoadmapsByType(@PathVariable String type) {
        return roadmapService.getRoadmapsByType(type);
    }
}