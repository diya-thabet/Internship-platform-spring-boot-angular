package enicar.platform.stages;

import enicar.platform.stages.DTO.InternshipDTO;
import enicar.platform.stages.controller.InternshipController;
import enicar.platform.stages.service.InternshipService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class InternshipControllerTest {

    @Mock
    private InternshipService internshipService;

    @InjectMocks
    private InternshipController internshipController;

    @Test
    void testGetAllInternships() {
        InternshipDTO internshipDTO = new InternshipDTO();
        internshipDTO.setIdI(1);
        internshipDTO.setCompany("Tunisie Télécom");
        internshipDTO.setDescription("Mobile development");
        internshipDTO.setNameIntern("Stage Mobile 2025");
        internshipDTO.setImageIntern("images/interns/tt1.jpg");
        internshipDTO.setUrlDrive("drive.google.com/tt1");
        internshipDTO.setDateEnd(LocalDate.parse("2025-06-30"));
        internshipDTO.setPopularity(50);
        when(internshipService.getAllInternships()).thenReturn(Collections.singletonList(internshipDTO));

        List<InternshipDTO> result = internshipController.getAllInternships();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Tunisie Télécom", result.get(0).getCompany());
    }
}