package org.example.controller;


import net.devh.boot.grpc.server.service.GrpcService;
import io.grpc.stub.StreamObserver;
import org.example.RpcServiceGrpc;
import org.example.Test;
import org.example.Test.Resp;
import org.example.Test.Req;


@GrpcService
public class gRpcController extends RpcServiceGrpc.RpcServiceImplBase{

    @Override
    public void simpleRpc(Test.Req request,
                          StreamObserver<Test.Resp> responseObserver) {

        String query = request.getQuery();

        Test.Resp resp = Test.Resp.newBuilder().setResult(query + "的回答是： unknown").build();

        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Req> clientStream(
            StreamObserver<Resp> responseObserver) {
        return new StreamObserver<Req>() {
            @Override
            public void onNext(Req req) {
                // 客户端收到
                System.out.println("服务端收到: " + req.getQuery());

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(Resp.newBuilder().setResult("服务端全部收到: ").build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void serverStream(Req request,
                             StreamObserver<Resp> responseObserver) {
        String query = request.getQuery();


        String[] results = {"Ash", "Chenggou", "FJF", "苦瓜大王"};

        for(String result : results){
            responseObserver.onNext(Resp.newBuilder().setResult(result).build());

        }

        responseObserver.onCompleted();


    }

    @Override
    public StreamObserver<Test.Req> doubleStream(
            StreamObserver<Resp> responseObserver) {
        StreamObserver<Req> reqStreamObserver = new StreamObserver<Req>() {

            @Override
            public void onNext(Req req) {
                String query = req.getQuery();
                responseObserver.onNext(Resp.newBuilder().setResult("服务端收到了: " + query).build());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };


        return reqStreamObserver;
    }




}
