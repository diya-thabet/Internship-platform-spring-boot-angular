package enicar.platform.stages.controller;

import enicar.platform.stages.DTO.VideoDTO;
import enicar.platform.stages.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/videos")
@CrossOrigin(origins = "*")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping
    public List<VideoDTO> getAllVideos() {
        return videoService.getAllVideos();
    }
}