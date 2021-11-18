package com.example.training1.springbootdemo.controller;


import com.example.training1.springbootdemo.models.User;
import com.example.training1.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/controller")
public class FirstController {

    @Autowired
    private UserService userService;

//	@Autowired
//	SplunkService splunkService;

    @Value("${message}")
    String message;

    @GetMapping("/message")
    public String message() {
        String message = this.message;
//		LOGGER.info("splunk example");

        return message;
    }

    @GetMapping("/name/{name}")
    public User getUserByName(@PathVariable String name) {
//		return "name api";
        User user = userService.getUserByName(name);
        return user;
    }

//	@GetMapping("/splunklog")
//	public void testSplunk() {
//		splunkService.testSplunk();
//	}

}
