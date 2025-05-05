package enicar.platform.stages;

import enicar.platform.stages.DTO.PodcastDTO;
import enicar.platform.stages.controller.PodcastController;
import enicar.platform.stages.service.PodcastService;
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
class PodcastControllerTest {

    @Mock
    private PodcastService podcastService;

    @InjectMocks
    private PodcastController podcastController;

    @Test
    void testGetAllPodcasts() {
        PodcastDTO podcastDTO = new PodcastDTO();
        podcastDTO.setIdP(1);
        podcastDTO.setNameP("L’Avenir de l’IA");
        podcastDTO.setDescriptionP("AI discussion");
        podcastDTO.setImageP("images/podcasts/ia.jpg");
        podcastDTO.setUrlP("podcasts/ia.mp3");
        when(podcastService.getAllPodcasts()).thenReturn(Collections.singletonList(podcastDTO));

        List<PodcastDTO> result = podcastController.getAllPodcasts();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("L’Avenir de l’IA", result.get(0).getNameP());
    }
}