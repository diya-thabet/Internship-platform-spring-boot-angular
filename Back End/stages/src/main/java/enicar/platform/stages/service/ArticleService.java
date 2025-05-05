package enicar.platform.stages.service;

import enicar.platform.stages.DTO.ArticleDTO;
import enicar.platform.stages.DTO.DTOConverter;
import enicar.platform.stages.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<ArticleDTO> getAllArticles() {
        return DTOConverter.toArticleDTOList(articleRepository.findAll());
    }
}