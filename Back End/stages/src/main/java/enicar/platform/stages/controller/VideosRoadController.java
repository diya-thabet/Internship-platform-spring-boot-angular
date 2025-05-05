package enicar.platform.stages.controller;

import enicar.platform.stages.DTO.VideosRoadDTO;
import enicar.platform.stages.VideosRoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/videos-road")
@CrossOrigin(origins = "*")
public class VideosRoadController {

    @Autowired
    private VideosRoadService videosRoadService;

    @GetMapping
    public List<VideosRoadDTO> getAllVideosRoad() {
        return videosRoadService.getAllVideosRoad();
    }
}