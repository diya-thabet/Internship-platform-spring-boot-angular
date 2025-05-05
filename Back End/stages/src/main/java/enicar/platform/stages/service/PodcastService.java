package enicar.platform.stages.service;

import enicar.platform.stages.DTO.DTOConverter;
import enicar.platform.stages.DTO.PodcastDTO;
import enicar.platform.stages.repositories.PodcastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PodcastService {

    @Autowired
    private PodcastRepository podcastRepository;

    public List<PodcastDTO> getAllPodcasts() {
        return DTOConverter.toPodcastDTOList(podcastRepository.findAll());
    }
}