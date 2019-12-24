package io.github.linxiaobaixcg.service;

import io.github.linxiaobaixcg.dao.ArticleDao;
import io.github.linxiaobaixcg.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import util.IdWorker;

/**
 * @program: tensquare_parent
 * @description:
 * @author: LCQ
 * @create: 2019-12-20 23:17
 **/
@Service
public class ArticleService {
    @Autowired
    private ArticleDao articleDao;

//    @Autowired
//    private IdWorker idWorker;

    //增加文章
    public void save(Article article){
        articleDao.save(article);
    }

    //文章搜索
    public Page<Article> findByKey(String keywords, int page, int size){
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        return articleDao.findByTitleOrContentLike(keywords,keywords,pageRequest);
    }
}
