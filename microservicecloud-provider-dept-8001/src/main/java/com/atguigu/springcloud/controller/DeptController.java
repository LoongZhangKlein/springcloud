package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
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

    @GetMapping("/get")
    public List<Dept> select(){
        System.out.println();
        Dept dept = new Dept();
        return deptService.find(dept);

    }

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
    @GetMapping("/get/{id}")
    public Dept getById(@PathVariable Long id){
         return deptService.findById(id);
    }
}
