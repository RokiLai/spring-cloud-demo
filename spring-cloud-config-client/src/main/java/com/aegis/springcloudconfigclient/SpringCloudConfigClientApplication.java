package com.aegis.springcloudconfigclient;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConfigClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudConfigClientApplication.class, args);
  }

//  @Bean
//  public ServletRegistrationBean<HystrixMetricsStreamServlet> getServlet() {
//    HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
//    ServletRegistrationBean<HystrixMetricsStreamServlet> registrationBean = new ServletRegistrationBean<>(streamServlet);
//    registrationBean.setLoadOnStartup(1);
//    registrationBean.addUrlMappings("/actuator/hystrix.stream");
//    registrationBean.setName("HystrixMetricsStreamServlet");
//    return registrationBean;
//  }
}
