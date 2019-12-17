package io.github.linxiaobaixcg.dao;

import io.github.linxiaobaixcg.pojo.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Description:
 * date: 2018/11/28 11:47
 * author: loveLy
 */
public interface CommentDao extends MongoRepository<Comment,String> {


    /**
     * 根据文章ID查询评论列表
     * @param articleid
     * @return
     */
    public List<Comment> findByArticleid(String articleid);
}
