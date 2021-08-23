package br.com.micronaut;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller("/hello")
public class HelloResources {

    @Inject
    private HelloService helloService;

    @Get
    public HttpResponse<String> getHello(){
        return HttpResponse.ok(helloService.getHello());
    }
}
