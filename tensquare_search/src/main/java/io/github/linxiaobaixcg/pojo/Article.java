package io.github.linxiaobaixcg.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;

//indexName:数据库名称  type:表名称
@Document(indexName = "tensquare", type = "article")
@Data
public class Article implements Serializable {

    @Id
    private String id;//ID

    //index:是否索引，表示该域是否能被搜索
    @Field(index = true, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String title;//标题

    @Field(index = true, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String content;//文章正文

    private String state;//审核状态
}
