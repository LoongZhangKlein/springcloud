package com.atguigu.springcloud.servie;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author loongzhang
 * @Description DOING
 * @date 2022-12-29-21:42
 */

//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)

public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
     Dept get(@PathVariable("id")long id);
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
     List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
     boolean add(Dept dept);
}
