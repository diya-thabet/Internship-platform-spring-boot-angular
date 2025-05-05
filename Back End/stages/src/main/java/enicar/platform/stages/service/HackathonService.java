package enicar.platform.stages.service;

import enicar.platform.stages.DTO.DTOConverter;
import enicar.platform.stages.DTO.HackathonDTO;
import enicar.platform.stages.repositories.HackathonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HackathonService {

    @Autowired
    private HackathonRepository hackathonRepository;

    public List<HackathonDTO> getAllHackathons() {
        return DTOConverter.toHackathonDTOList(hackathonRepository.findAll());
    }

    // Assuming getNodeHackel refers to a specific hackathon, possibly by name or ID
    // Since "NodeHackel" is unclear, I'll implement it as fetching all hackathons for now
    // Please clarify if a specific filter is needed
    public List<HackathonDTO> getNodeHackel() {
        return DTOConverter.toHackathonDTOList(hackathonRepository.findAll());
    }
}