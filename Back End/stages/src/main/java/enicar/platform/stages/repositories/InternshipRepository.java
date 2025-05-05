package enicar.platform.stages.repositories;

import enicar.platform.stages.entities.Internship;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface InternshipRepository extends JpaRepository<Internship, Integer> {
    List<Internship> findByDateEndBetween(LocalDate start, LocalDate end);
    List<Internship> findByDateEnd(LocalDate date);
    List<Internship> findByPopularityGreaterThan(int popularity);
}