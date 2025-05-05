package enicar.platform.stages;

import enicar.platform.stages.DTO.ArticleDTO;
import enicar.platform.stages.controller.ArticleController;
import enicar.platform.stages.service.ArticleService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ArticleControllerTest {

    @Mock
    private ArticleService articleService;

    @InjectMocks
    private ArticleController articleController;

    @Test
    void testGetAllArticles() {
        ArticleDTO articleDTO = new ArticleDTO();
        articleDTO.setIdA(1);
        articleDTO.setName("L’Impact de l’IA en Tunisie");
        articleDTO.setTypeA("Informatique");
        articleDTO.setDescription("AI applications");
        articleDTO.setUrl("articles/ia-tunisie.pdf");
        when(articleService.getAllArticles()).thenReturn(Collections.singletonList(articleDTO));

        List<ArticleDTO> result = articleController.getAllArticles();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("L’Impact de l’IA en Tunisie", result.get(0).getName());
    }
}