package enicar.platform.stages;

import enicar.platform.stages.DTO.DTOConverter;
import enicar.platform.stages.DTO.VideosRoadDTO;
import enicar.platform.stages.repositories.VideosRoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VideosRoadService {

    @Autowired
    private VideosRoadRepository videosRoadRepository;

    public List<VideosRoadDTO> getAllVideosRoad() {
        return DTOConverter.toVideosRoadDTOList(videosRoadRepository.findAll());
    }
}