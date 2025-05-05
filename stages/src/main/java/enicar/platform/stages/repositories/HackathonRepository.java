package enicar.platform.stages.repositories;

import enicar.platform.stages.entities.Hackathon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HackathonRepository extends JpaRepository<Hackathon, Integer> {
}