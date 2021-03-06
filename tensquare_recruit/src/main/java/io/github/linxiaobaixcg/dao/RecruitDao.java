package io.github.linxiaobaixcg.dao;

import io.github.linxiaobaixcg.pojo.Recruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface RecruitDao extends JpaRepository<Recruit,String>,JpaSpecificationExecutor<Recruit>{

    //推荐职位列表
    public List<Recruit> findTop4ByStateOrderByCreatetimeDesc(String state);


    //最新职位列表
    List<Recruit> findTop12ByStateNotOrderByCreatetimeDesc(String state);
}