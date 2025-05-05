package enicar.platform.stages.controller;

import enicar.platform.stages.DTO.CertificationDTO;
import enicar.platform.stages.service.CertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/certifications")
@CrossOrigin(origins = "*")
public class CertificationController {

    @Autowired
    private CertificationService certificationService;

    @GetMapping
    public List<CertificationDTO> getAllCertifications() {
        return certificationService.getAllCertifications();
    }

    @GetMapping("/type/programming")
    public List<CertificationDTO> getProgrammingCertifications() {
        return certificationService.getCertificationsByType("Programming");
    }

    @GetMapping("/type/data")
    public List<CertificationDTO> getDataCertifications() {
        return certificationService.getCertificationsByType("Data");
    }

    @GetMapping("/type/cyber")
    public List<CertificationDTO> getCyberCertifications() {
        return certificationService.getCertificationsByType("Cyber");
    }

    @GetMapping("/type/networking")
    public List<CertificationDTO> getNetworkingCertifications() {
        return certificationService.getCertificationsByType("Networking");
    }

    @GetMapping("/type/analytics")
    public List<CertificationDTO> getAnalyticsCertifications() {
        return certificationService.getCertificationsByType("Analytics");
    }

    @GetMapping("/type/agile")
    public List<CertificationDTO> getAgileCertifications() {
        return certificationService.getCertificationsByType("Agile");
    }

    @GetMapping("/type/anglais")
    public List<CertificationDTO> getAnglaisCertifications() {
        return certificationService.getCertificationsByType("Anglais");
    }
}