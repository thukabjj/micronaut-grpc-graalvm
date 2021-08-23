package br.com.micronaut;

import helloworld.GreeterGrpc;
import helloworld.HelloReply;
import helloworld.HelloRequest;
import io.grpc.stub.StreamObserver;
import jakarta.inject.Singleton;

@Singleton
public class GreetingEndpoint extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver){
        final HelloReply helloReply =
                HelloReply.newBuilder().setMessage("AEEEEEEEEEEEEEEE").build();
        responseObserver.onNext(helloReply);
        responseObserver.onCompleted();
    }

}
