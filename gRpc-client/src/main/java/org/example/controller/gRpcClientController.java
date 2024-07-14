package org.example.controller;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.Service.gRpcService;
import org.example.RpcServiceGrpc;
import org.example.Test;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("gRpc")
public class gRpcClientController {


    @Autowired
    private gRpcService gRpcService;

    @GrpcClient("grpc-server")
    private RpcServiceGrpc.RpcServiceBlockingStub stub;


    @GetMapping("/simple")
    public String query(String query){
        return gRpcService.query(query);
    }

    @GetMapping("/clientStream")
    public String q(String query){
        String[] strArray = {"apple", "banana", "cherry", "date"};

        ArrayList<String> querys = new ArrayList<>(Arrays.asList(strArray));
        gRpcService.ClientStream(querys);
        return "ok";
    }

    @GetMapping("/serverStream")
    public String serverStream(String query){
        gRpcService.ServerStream(query);
        return "ok";
    }


    @GetMapping("/doubleStream")
    public String doubleStream(){
        gRpcService.doubleStream();
        return "ok";
    }




}
