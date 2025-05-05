package enicar.platform.stages;

import enicar.platform.stages.DTO.ParticipantDTO;
import enicar.platform.stages.controller.ParticipantController;
import enicar.platform.stages.service.ParticipantService;
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
class ParticipantControllerTest {

    @Mock
    private ParticipantService participantService;

    @InjectMocks
    private ParticipantController participantController;

    @Test
    void testGetAllParticipants() {
        ParticipantDTO participantDTO = new ParticipantDTO();
        participantDTO.setIdF(1);
        participantDTO.setFirstName("Ahmed");
        participantDTO.setLastName("Ben Ali");
        participantDTO.setSection("Informatique");
        participantDTO.setTel("+21622123456");
        when(participantService.getAllParticipants()).thenReturn(Collections.singletonList(participantDTO));

        List<ParticipantDTO> result = participantController.getAllParticipants();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Ahmed", result.get(0).getFirstName());
    }
}