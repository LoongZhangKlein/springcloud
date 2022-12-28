package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import sun.plugin.com.DispatchClient;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author loongzhang
 * @Description DOING
 * @date 2022-12-18-19:34
 */
@RestController
public class DepConsumerController {
    //private static final String REST_UTL_PREFIX = "http://localhost:8001";
    private static final String REST_UTL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
    /**
     * 发送请求便捷访问http方法
     */
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public Boolean add(Dept dept) {
        return restTemplate.getForObject(REST_UTL_PREFIX + "/dept/add", Boolean.class, dept);
    }

    @GetMapping(value = "/consumer/dept/get")
    public List<Dept> get(Dept dept) {
        System.out.println("");
        return restTemplate.getForObject(REST_UTL_PREFIX + "/dept/get", List.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_UTL_PREFIX + "/dept/get" + id, Dept.class);
    }

    /**
     * 提供对外访问接口
     * 相当于 @GetMapping
     */
    @RequestMapping(value = "/consumer/dept/discovery", method = RequestMethod.GET)
    public void discovery() {
        restTemplate.getForObject(REST_UTL_PREFIX + "/dept/discovery", Object.class);
    }
}
