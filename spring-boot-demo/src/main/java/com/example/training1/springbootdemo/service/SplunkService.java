//package com.example.training1.springbootdemo.service;
//
//import com.splunk.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@org.springframework.stereotype.Service
//public class SplunkService {
//
////    public Service getSplunkService() {
////        Map<String, Object> connectionArgs = new HashMap<>();
////        connectionArgs.put("host", "localhost");
////        connectionArgs.put("username", "");
////        connectionArgs.put("password", "");
////        connectionArgs.put("port", 8000);
////        connectionArgs.put("scheme", "http");
////        HttpService.setSslSecurityProtocol(SSLSecurityProtocol.TLSv1_2);
////        Service splunkService = Service.connect(connectionArgs);
////        return splunkService;
////    }
//
////    public void testSplunk() {
////        Args logArgs = new Args();
////        logArgs.put("sourcetype", "Demo SpringBoot application : UserService");
////        Receiver receiver = getSplunkService().getReceiver();
//////		receiver.log("this is demo service log");
//////		receiver.log(logArgs, "this is demo service logs with arguments");
////        receiver.log("userService", logArgs, "this is demo service logs with arguments");
////    }
//
//
//}
