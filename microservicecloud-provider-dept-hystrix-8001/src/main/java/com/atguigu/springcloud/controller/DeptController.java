package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author loongzhang
 * @Description DOING
 * @date 2022-12-18-18:15
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Resource
    DeptService deptService;
    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping("/add")
    public void add(@RequestBody Dept dept){
        deptService.add(dept);
    }

//    @GetMapping("/get")
//    public List<Dept> select(){
//        System.out.println();
//        Dept dept = new Dept();
//        return deptService.find(dept);
//
//    }

    /**
     * 提供对外访问接口
     * 相当于 @GetMapping
     */
    @RequestMapping(value = "/discovery",method = RequestMethod.GET)
    public void discovery(){
        List<String> servicesList = discoveryClient.getServices();
        System.out.println(servicesList);
        List<ServiceInstance> instancesList = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance instance : instancesList) {
            System.out.println(instance.getServiceId()+"\t"
                    +instance.getHost()
                    +instance.getPort()
                    +instance.getUri());
        }
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Dept> list(){
       return  deptService.find(new Dept());
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    //@HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept getById(@PathVariable("id") Long id){
        System.out.println("7777");
        Dept dept = deptService.findById(id);
        if (null==dept){
            throw new RuntimeException("ID"+id);
        }
        return dept;
    }

    /**
     * 发生错误走该方法
     * @param id
     * @return
     */
//    public Dept processHystrix_Get(@PathVariable("id") Long id)
//    {
//        return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
//                .setDb_source("no this database in MySQL");
//    }

}
