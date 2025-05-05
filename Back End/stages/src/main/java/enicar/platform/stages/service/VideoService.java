package enicar.platform.stages.service;

import enicar.platform.stages.DTO.DTOConverter;
import enicar.platform.stages.DTO.VideoDTO;
import enicar.platform.stages.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public List<VideoDTO> getAllVideos() {
        return DTOConverter.toVideoDTOList(videoRepository.findAll());
    }
}