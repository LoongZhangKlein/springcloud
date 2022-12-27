package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;
import java.util.List;


/**
 * @author loongzhang
 * @Description DOING
 * @date 2022-12-18-19:34
 */
@RestController
public class DepConsumerController {
    private static final String REST_UTL_PREFIX="http://localhost:8001";
    /**
     * 发送请求便捷访问http方法
     */
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping(value = "/consumer/dept/add")
    public Boolean add(Dept dept){
       return restTemplate.getForObject(REST_UTL_PREFIX+"/dept/add",Boolean.class,dept);
    }
    @GetMapping(value = "/consumer/dept/get")
    public List<Dept> get(Dept dept){
        System.out.println("");
        return restTemplate.getForObject(REST_UTL_PREFIX+"/dept/get",List.class);
    }
    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")  Long id){
        return restTemplate.getForObject(REST_UTL_PREFIX+"/dept/get"+id,Dept.class);
    }
}
