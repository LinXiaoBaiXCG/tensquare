package io.github.linxiaobaixcg.controller;

import entity.PageResult;
import entity.Result;
import entity.StatusCode;
import io.github.linxiaobaixcg.pojo.Label;
import io.github.linxiaobaixcg.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: tensquare_parent
 * @description: 基础Controller
 * @author: LCQ
 * @create: 2019-12-17 16:52
 **/
@RestController
@CrossOrigin
@RequestMapping("/label")
public class LabelController {

    @Autowired
    LabelService service;

    @GetMapping
    public Result findAll(){
        return new Result(true, StatusCode.OK.getCode(),"查询成功");
    }

    @GetMapping("/{labelId}")
    public Result findById(@PathVariable("labelId") String id) {
        return new Result(true, StatusCode.OK.getCode(), "查询成功", service.findById(id));
    }

    @PostMapping
    public Result save(@RequestBody Label label) {
        service.save(label);
        return new Result(true, StatusCode.OK.getCode(), "添加成功");
    }

    @PutMapping("/{labelId}")
    public Result update(@PathVariable("labelId") String id, @RequestBody Label label) {
        label.setId(id);
        service.update(label);
        return new Result(true, StatusCode.OK.getCode(), "修改成功");
    }

    @DeleteMapping("/{labelId}")
    public Result deleteById(@PathVariable("labelId") String id) {
        service.deleteById(id);
        return new Result(true, StatusCode.OK.getCode(), "删除成功");
    }

    @PostMapping("/search")
    public Result findSearch(@RequestBody Label label) {
        List<Label> list = service.findSearch(label);
        return new Result(true, StatusCode.OK.getCode(), "查询成功", list);
    }

    @PostMapping("/search/{page}/{size}")
    public Result pageQuery(@RequestBody Label label, @PathVariable("page") int currentPage, @PathVariable("size") int pageSize) {
        Page<Label> pageData = service.pageQuery(label, currentPage, pageSize);
        return new Result(true, StatusCode.OK.getCode(), "查询成功",
                new PageResult<>(pageData.getTotalElements(), pageData.getContent()));
    }
}
