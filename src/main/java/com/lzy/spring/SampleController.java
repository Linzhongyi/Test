/**
 * 
 */
package com.lzy.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
* @author  E-mail: 
* @date Date：2018年3月22日 下午10:21:50 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
    	System.out.println("hello spring boot");
    	int sum=0;
    	int i=1;
    	i = 0;
    	while(i<30){
    		sum+=i;
    		i++;
    	}
    	System.out.println(sum);
    	
    	System.out.println("haha");
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
