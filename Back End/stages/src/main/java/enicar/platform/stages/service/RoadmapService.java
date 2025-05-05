package enicar.platform.stages.service;

import enicar.platform.stages.DTO.DTOConverter;
import enicar.platform.stages.DTO.RoadmapDTO;
import enicar.platform.stages.repositories.RoadmapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoadmapService {

    @Autowired
    private RoadmapRepository roadmapRepository;

    public List<RoadmapDTO> getAllRoadmaps() {
        return DTOConverter.toRoadmapDTOList(roadmapRepository.findAll());
    }

    public List<RoadmapDTO> getRoadmapsByType(String type) {
        return DTOConverter.toRoadmapDTOList(roadmapRepository.findByType(type));
    }
}