package br.com.micronaut;

import br.com.micronaut.configuration.Clients;
import helloworld.GreeterGrpc;
import helloworld.HelloReply;
import helloworld.HelloRequest;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;

@Factory
public class HelloService {

    @Inject
    private GreeterGrpc.GreeterBlockingStub blockingStub;

    public String getHello() {
        final HelloReply helloReply = blockingStub.sayHello(HelloRequest.newBuilder().setName("TESDT").build());
        return helloReply.getMessage();
    }
}
