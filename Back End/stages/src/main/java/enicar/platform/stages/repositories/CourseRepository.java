package enicar.platform.stages.repositories;

import enicar.platform.stages.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    List<Course> findTop2ByOrderByIdCourseDesc();
}
