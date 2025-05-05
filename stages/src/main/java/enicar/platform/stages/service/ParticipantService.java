package enicar.platform.stages.service;

import enicar.platform.stages.DTO.DTOConverter;
import enicar.platform.stages.DTO.ParticipantDTO;
import enicar.platform.stages.repositories.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    public List<ParticipantDTO> getAllParticipants() {
        return DTOConverter.toParticipantDTOList(participantRepository.findAll());
    }
}