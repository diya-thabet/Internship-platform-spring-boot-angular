package enicar.platform.stages.service;

import enicar.platform.stages.DTO.CertificationDTO;
import enicar.platform.stages.DTO.DTOConverter;
import enicar.platform.stages.repositories.CertificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CertificationService {

    @Autowired
    private CertificationRepository certificationRepository;

    public List<CertificationDTO> getAllCertifications() {
        return DTOConverter.toCertificationDTOList(certificationRepository.findAll());
    }

    public List<CertificationDTO> getCertificationsByType(String type) {
        return DTOConverter.toCertificationDTOList(certificationRepository.findByType(type));
    }
}