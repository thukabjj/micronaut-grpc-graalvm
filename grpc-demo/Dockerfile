FROM ghcr.io/graalvm/graalvm-ce:java11-21.2.0 AS graalvm
RUN gu install native-image

COPY . /home/app/complete
WORKDIR /home/app/complete
RUN native-image --verbose -H:Class=br.com.micronaut.Application  --static --no-server -cp build/libs/grpc-demo-*-all.jar
EXPOSE 8080

FROM scratch

COPY --from=graalvm /home/app/complete .
ENTRYPOINT ["./grpc-demo -Xmn20m"]