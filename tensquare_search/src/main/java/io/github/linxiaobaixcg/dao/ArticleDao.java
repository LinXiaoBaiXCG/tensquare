package io.github.linxiaobaixcg.dao;

import io.github.linxiaobaixcg.pojo.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @program: tensquare_parent
 * @description:
 * @author: LCQ
 * @create: 2019-12-20 23:15
 **/
public interface ArticleDao extends ElasticsearchRepository<Article,String> {

    /**
     * 文章搜索. 模糊查询
     * @param title
     * @param content
     * @param pageable
     * @return
     */
    public Page<Article> findByTitleOrContentLike(String title, String content, Pageable pageable);
}
