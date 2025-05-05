package enicar.platform.stages.repositories;

import enicar.platform.stages.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}