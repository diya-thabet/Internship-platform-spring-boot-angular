package enicar.platform.stages;

import enicar.platform.stages.DTO.CertificationDTO;
import enicar.platform.stages.controller.CertificationController;
import enicar.platform.stages.service.CertificationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CertificationControllerTest {

    @Mock
    private CertificationService certificationService;

    @InjectMocks
    private CertificationController certificationController;

    @Test
    void testGetAllCertifications() {
        CertificationDTO certificationDTO = new CertificationDTO();
        certificationDTO.setIdCertif(1);
        certificationDTO.setTitleCert("Python Certification");
        certificationDTO.setType("Programming");
        certificationDTO.setDescription("Advanced training");
        certificationDTO.setImageUrl("images/certifs/python.jpg");
        when(certificationService.getAllCertifications()).thenReturn(Collections.singletonList(certificationDTO));

        List<CertificationDTO> result = certificationController.getAllCertifications();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Python Certification", result.get(0).getTitleCert());
    }
}