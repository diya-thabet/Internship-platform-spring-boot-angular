package enicar.platform.stages.repositories;

import enicar.platform.stages.entities.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CertificationRepository extends JpaRepository<Certification, Integer> {
    List<Certification> findByType(String type);
}