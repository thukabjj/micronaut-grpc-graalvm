package br.com.micronaut.configuration;

import helloworld.GreeterGrpc;
import io.grpc.ManagedChannel;
import io.micronaut.context.annotation.Factory;
import io.micronaut.grpc.annotation.GrpcChannel;
import jakarta.inject.Singleton;

@Factory
public class Clients {
    @Singleton
    public GreeterGrpc.GreeterBlockingStub getStub(@GrpcChannel("greeter")
                                           ManagedChannel channel) {
        return GreeterGrpc.newBlockingStub(channel);
    }
}
