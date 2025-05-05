package enicar.platform.stages.service;

import enicar.platform.stages.DTO.DTOConverter;
import enicar.platform.stages.DTO.MentorDTO;
import enicar.platform.stages.repositories.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MentorService {

    @Autowired
    private MentorRepository mentorRepository;

    public List<MentorDTO> getAllMentors() {
        return DTOConverter.toMentorDTOList(mentorRepository.findAll());
    }
}