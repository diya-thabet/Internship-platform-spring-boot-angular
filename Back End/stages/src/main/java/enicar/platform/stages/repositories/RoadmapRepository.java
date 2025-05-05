package enicar.platform.stages.repositories;

import enicar.platform.stages.entities.Roadmap;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RoadmapRepository extends JpaRepository<Roadmap, Integer> {
    List<Roadmap> findByType(String type);
}