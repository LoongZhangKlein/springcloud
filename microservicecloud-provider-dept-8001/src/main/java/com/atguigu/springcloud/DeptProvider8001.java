package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author loongzhang
 * @Description DOING
 * @date 2022-12-18-18:27
 */
@SpringBootApplication
public class DeptProvider8001 {
    public static void main(String[] args) {
         SpringApplication.run(DeptProvider8001.class, args);
//        System.out.println("访问端口:"+run.getId());
        System.out.println("DeptProvider8001启动成功");
    }
}
