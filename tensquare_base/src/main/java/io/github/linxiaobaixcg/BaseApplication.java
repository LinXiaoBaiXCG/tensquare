package io.github.linxiaobaixcg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import util.IdWorker;

/**
 * @program: tensquare_parent
 * @description:
 * @author: LCQ
 * @create: 2019-12-17 16:44
 **/
@SpringBootApplication
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
    }

    /**
     * 将id生成器放到容器中
     * @return
     */
    @Bean
    public IdWorker idWorker() {
        return new IdWorker();
    }
}
