package io.github.linxiaobaixcg.client.impl;

import io.github.linxiaobaixcg.client.LabelClient;
import entity.Result;
import entity.StatusCode;
import org.springframework.stereotype.Component;

/**
 * Description:
 * date: 2018/12/4 20:51
 * author: loveLy
 */
@Component
public class LabelClientImpl implements LabelClient {

    @Override
    public Result findById(String id) {
        return new Result(false,StatusCode.ERROR.getCode(),"熔断器启动了");
    }
}
