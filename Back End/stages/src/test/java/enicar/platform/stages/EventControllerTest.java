package enicar.platform.stages;

import enicar.platform.stages.DTO.EventDTO;
import enicar.platform.stages.controller.EventController;
import enicar.platform.stages.service.EventService;
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
class EventControllerTest {

    @Mock
    private EventService eventService;

    @InjectMocks
    private EventController eventController;

    @Test
    void testGetAllEvents() {
        EventDTO eventDTO = new EventDTO();
        eventDTO.setIdE(1);
        eventDTO.setName("Journée Portes Ouvertes 2025");
        eventDTO.setDescription("Discover programs");
        eventDTO.setImageE("images/events/jpo2025.jpg");
        eventDTO.setUrlE("events/jpo2025");
        when(eventService.getAllEvents()).thenReturn(Collections.singletonList(eventDTO));

        List<EventDTO> result = eventController.getAllEvents();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Journée Portes Ouvertes 2025", result.get(0).getName());
    }
}