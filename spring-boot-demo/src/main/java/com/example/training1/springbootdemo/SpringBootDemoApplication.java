package com.example.training1.springbootdemo;

//import com.example.training1.springbootdemo.service.SplunkService;

import com.example.training1.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.training1.springbootdemo.repository.UserRepository;

@SpringBootApplication
public class SpringBootDemoApplication {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

//	@Autowired
//	private SplunkService splunkService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

//	@Override
//	public void run(String... args) throws Exception {
//		User user = new User(1, "Nandini");
//		userRepository.save(user);
//
//		splunkService.testSplunk();
//
////		userService.readCsv();
////		userService.printList();
//
////		userService.set("first", userService.returnOne(), 2);
//	}

}
