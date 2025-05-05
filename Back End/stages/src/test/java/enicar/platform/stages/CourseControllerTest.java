package enicar.platform.stages;

import enicar.platform.stages.DTO.CourseDTO;
import enicar.platform.stages.controller.CourseController;
import enicar.platform.stages.service.CourseService;
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
class CourseControllerTest {

    @Mock
    private CourseService courseService;

    @InjectMocks
    private CourseController courseController;

    @Test
    void testGetAllCourses() {
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setIdCourse(1);
        courseDTO.setTitle("Introduction à l’Informatique");
        courseDTO.setTypeC("Informatique");
        courseDTO.setNView(150);
        courseDTO.setImageC("images/courses/info101.jpg");
        when(courseService.getAllCourses()).thenReturn(Collections.singletonList(courseDTO));

        List<CourseDTO> result = courseController.getAllCourses();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Introduction à l’Informatique", result.get(0).getTitle());
    }
}