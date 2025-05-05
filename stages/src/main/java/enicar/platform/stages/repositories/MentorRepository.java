package enicar.platform.stages.repositories;

import enicar.platform.stages.entities.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MentorRepository extends JpaRepository<Mentor, Integer> {
}