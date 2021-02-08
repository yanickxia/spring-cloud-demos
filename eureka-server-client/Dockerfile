FROM demo-build:latest

FROM openjdk:8-jre
WORKDIR /app
COPY --from=0 /build/eureka-server-client/target/eureka-server-client-1.0-SNAPSHOT.jar .
CMD java $JAVA_OPTS -jar eureka-server-client-1.0-SNAPSHOT.jar