package io.github.linxiaobaixcg.dao;

import io.github.linxiaobaixcg.pojo.Spit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @program: tensquare_parent
 * @description:
 * @author: LCQ
 * @create: 2019-12-18 17:13
 **/
public interface SpitDao extends MongoRepository<Spit, String> {

    //根据上级ID查询吐槽列表(分页)
    public Page<Spit> findByParentid(String parentid, Pageable pageable);
}
