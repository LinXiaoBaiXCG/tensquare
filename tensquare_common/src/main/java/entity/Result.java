package entity;

import lombok.Data;

/**
 * @program: tensquare_parent
 * @description: 返回实体类
 * @author: LCQ
 * @create: 2019-12-17 16:08
 **/
@Data
public class Result {

    private boolean flag;
    private Integer code;
    private String message;
    private Object data;

    /**
     * 控构造器
     */
    public Result() {
    }

    public Result(Boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result(Boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
