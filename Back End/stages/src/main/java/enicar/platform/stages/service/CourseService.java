package enicar.platform.stages.service;

import enicar.platform.stages.DTO.CourseDTO;
import enicar.platform.stages.DTO.DTOConverter;
import enicar.platform.stages.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<CourseDTO> getAllCourses() {
        return DTOConverter.toCourseDTOList(courseRepository.findAll());
    }

    public List<CourseDTO> getTopTwoCourses() {
        return DTOConverter.toCourseDTOList(courseRepository.findTop2ByOrderByIdCourseDesc());
    }
}