package com.yushen.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**  
* 
* @class_name SpringMain.java
* @package_name com.yushen.springboot
* @author liuyu1@bonc.com.cn 
* @date 2018年5月7日 下午1:55:47
*/
@RestController
@EnableAutoConfiguration
public class SpringMain {
    
    @RequestMapping(value="/home",method = RequestMethod.GET)
    @ResponseBody
    public String home(){
        return "say hello,Spring Boot";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringMain.class, args);
    }

}
