package enicar.platform.stages.controller;

import enicar.platform.stages.DTO.CourseDTO;
import enicar.platform.stages.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "*")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<CourseDTO> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/top-two")
    public List<CourseDTO> getTopTwoCourses() {
        return courseService.getTopTwoCourses();
    }
}