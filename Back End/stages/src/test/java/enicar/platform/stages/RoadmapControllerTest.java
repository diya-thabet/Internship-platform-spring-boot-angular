package enicar.platform.stages;

import enicar.platform.stages.DTO.RoadmapDTO;
import enicar.platform.stages.controller.RoadmapController;
import enicar.platform.stages.service.RoadmapService;
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
class RoadmapControllerTest {

    @Mock
    private RoadmapService roadmapService;

    @InjectMocks
    private RoadmapController roadmapController;

    @Test
    void testGetAllRoadmaps() {
        RoadmapDTO roadmapDTO = new RoadmapDTO();
        roadmapDTO.setIdR(1);
        roadmapDTO.setType("Informatique");
        roadmapDTO.setImageR("images/roadmaps/info.jpg");
        roadmapDTO.setDescription("Learning path");
        when(roadmapService.getAllRoadmaps()).thenReturn(Collections.singletonList(roadmapDTO));

        List<RoadmapDTO> result = roadmapController.getAllRoadmaps();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Informatique", result.get(0).getType());
    }
}