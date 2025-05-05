package enicar.platform.stages.repositories;

import enicar.platform.stages.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}