package enicar.platform.stages.repositories;

import enicar.platform.stages.entities.Podcast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PodcastRepository extends JpaRepository<Podcast, Integer> {
}