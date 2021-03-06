package io.github.linxiaobaixcg.controller;


import entity.PageResult;
import entity.Result;
import entity.StatusCode;
import io.github.linxiaobaixcg.pojo.Article;
import io.github.linxiaobaixcg.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

/**
 * Description:
 * date: 2018/11/29 9:37
 * author: loveLy
 */
@RestController
@CrossOrigin
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    //文章搜索
    @RequestMapping(value = "/search/{keywords}/{page}/{size}",method = RequestMethod.GET)
    public Result findByKey(@PathVariable String key,@PathVariable int page,@PathVariable int size){
        Page<Article> articlePage = articleService.findByKey(key, page, size);
        return new Result(true,StatusCode.OK.getCode(),"查询成功",new PageResult<>(articlePage.getTotalElements(),articlePage.getContent()));
    }


    //添加文章
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Article article){
        articleService.save(article);
        return new Result(true,StatusCode.OK.getCode(),"操作成功");
    }
}