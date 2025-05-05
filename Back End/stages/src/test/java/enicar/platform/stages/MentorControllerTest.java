package enicar.platform.stages;

import enicar.platform.stages.DTO.MentorDTO;
import enicar.platform.stages.controller.MentorController;
import enicar.platform.stages.service.MentorService;
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
class MentorControllerTest {

    @Mock
    private MentorService mentorService;

    @InjectMocks
    private MentorController mentorController;

    @Test
    void testGetAllMentors() {
        MentorDTO mentorDTO = new MentorDTO();
        mentorDTO.setIdM(1);
        mentorDTO.setName("Dr. Hedi Ben Salah");
        mentorDTO.setJob("Professeur");
        mentorDTO.setEmail("hedi.bensalah@enicarthage.tn");
        when(mentorService.getAllMentors()).thenReturn(Collections.singletonList(mentorDTO));

        List<MentorDTO> result = mentorController.getAllMentors();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Dr. Hedi Ben Salah", result.get(0).getName());
    }
}