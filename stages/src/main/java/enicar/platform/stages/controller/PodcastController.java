package enicar.platform.stages.controller;

import enicar.platform.stages.DTO.PodcastDTO;
import enicar.platform.stages.service.PodcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/podcasts")
@CrossOrigin(origins = "*")
public class PodcastController {

    @Autowired
    private PodcastService podcastService;

    @GetMapping
    public List<PodcastDTO> getAllPodcasts() {
        return podcastService.getAllPodcasts();
    }
}