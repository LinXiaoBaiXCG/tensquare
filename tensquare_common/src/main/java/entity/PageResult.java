package entity;


import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {
    // 总页数
    private Long total;
    // 查询的数据
    private List<T> rows;

    /**
     * 控构造器
     */
    public PageResult() {
    }

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }
}