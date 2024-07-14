package org.example.Service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.example.RpcServiceGrpc;
import org.example.Test.Req;
import org.example.Test.Resp;
import org.example.Test;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class gRpcService {


    @GrpcClient("grpc-server")  // BlockingStub 同步Rpc 调用， 不支持流式数据
    private RpcServiceGrpc.RpcServiceBlockingStub BlockingStub;


    @GrpcClient("grpc-server")  // stub 异步Rpc
    private RpcServiceGrpc.RpcServiceStub stub;

    public String query(String query){

        Test.Resp resp = BlockingStub.simpleRpc(Test.Req.newBuilder().setQuery(query).build());
        return resp.getResult();
    }



    public void ClientStream(List<String> querys) {
        StreamObserver<Test.Resp> streamObserver = new StreamObserver<Test.Resp>() {
            @Override
            public void onNext(Test.Resp resp){
                System.out.println(resp.getResult());
            }

            @Override
            public void onError(Throwable var1){

            }

            @Override
            public void onCompleted(){

            }
        };
        StreamObserver<Test.Req> reqStreamObserver = stub.clientStream(streamObserver);

        for(String query : querys){
            try{
                Thread.sleep(1000);
                reqStreamObserver.onNext(Test.Req.newBuilder().setQuery(query).build());
            }catch (Exception e){

            }
        }

        reqStreamObserver.onCompleted();
    }



    public void ServerStream(String query){
        StreamObserver<Resp> streamObserver = new StreamObserver<Resp>() {
            @Override
            public void onNext(Resp resp) {
                System.out.println(resp.getResult());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }

        };
        stub.serverStream(Req.newBuilder().setQuery(query).build(), streamObserver);
        System.out.println("返回");

    }


    public void doubleStream(){
        String[] querys = {"hshhs", "qweqwe", "sdcxv"};
        StreamObserver<Resp> streamObserver = new StreamObserver<Resp>() {

            @Override
            public void onNext(Resp resp) {
                System.out.println(resp.getResult());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        };

        StreamObserver<Req> reqStreamObserver = stub.doubleStream(streamObserver);

        for(String query : querys){
            reqStreamObserver.onNext(Req.newBuilder().setQuery(query).build());
        }

        reqStreamObserver.onCompleted();
    }

}
