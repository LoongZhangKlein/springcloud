package com.atguigu.springcloud.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.servie.DeptClientService;
import org.springframework.web.bind.annotation.*;
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
    //private static final String REST_UTL_PREFI
    // X = "http://localhost:8001";
    @Resource
    private DeptClientService deptClientService;
    /**
     * 发送请求便捷访问http方法
     */


    @RequestMapping(value = "/consumer/dept/add")
    public Boolean add(Dept dept) {
        return deptClientService.add(dept);
    }



    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.get(id);
    }

    /**
     * 提供对外访问接口
     * 相当于 @GetMapping
     */
    @RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
    public void discovery() {
        List<Dept> list = this.deptClientService.list();
        System.out.println(list);
    }
}
