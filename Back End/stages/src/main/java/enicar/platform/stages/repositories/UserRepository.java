package enicar.platform.stages.repositories;

import enicar.platform.stages.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}