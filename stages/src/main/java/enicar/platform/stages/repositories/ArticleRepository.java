package enicar.platform.stages.repositories;

import enicar.platform.stages.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}