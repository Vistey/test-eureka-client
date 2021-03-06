package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建接口，通过DiscoveryClient对象，在日志中打印出服务实例的相关内容
 */
@RestController
public class DcController {

  private final DiscoveryClient discoveryClient;

  /**
   * test-eureka-client2 中增加（）模拟ribbon负载均衡调用
   * client2 为配合test-eureka-client-ribbon-hystrix增加一个延迟
   * 结果：首次调用client1 再次请求调用client2
   */
  @GetMapping("/dc")
  public String dc() throws InterruptedException {
    //Thread.sleep(5000);
    String services = "Services: " + discoveryClient.getServices();
    System.out.println(services);
    return services;
  }

  @Autowired
  public DcController(DiscoveryClient discoveryClient) {
    this.discoveryClient = discoveryClient;
  }


}
