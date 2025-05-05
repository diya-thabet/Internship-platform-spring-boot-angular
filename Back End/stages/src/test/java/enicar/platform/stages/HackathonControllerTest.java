package enicar.platform.stages;

import enicar.platform.stages.DTO.HackathonDTO;
import enicar.platform.stages.controller.HackathonController;
import enicar.platform.stages.service.HackathonService;
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
class HackathonControllerTest {

    @Mock
    private HackathonService hackathonService;

    @InjectMocks
    private HackathonController hackathonController;

    @Test
    void testGetAllHackathons() {
        HackathonDTO hackathonDTO = new HackathonDTO();
        hackathonDTO.setIdH(1);
        hackathonDTO.setNameHack("Hackathon IA 2025");
        hackathonDTO.setDateHack(LocalDate.parse("2025-06-15"));
        hackathonDTO.setDescription("AI competition");
        hackathonDTO.setImageH("images/hackathons/ia2025.jpg");
        hackathonDTO.setUrlH("hackathons/ia2025");
        when(hackathonService.getAllHackathons()).thenReturn(Collections.singletonList(hackathonDTO));

        List<HackathonDTO> result = hackathonController.getAllHackathons();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Hackathon IA 2025", result.get(0).getNameHack());
    }
}