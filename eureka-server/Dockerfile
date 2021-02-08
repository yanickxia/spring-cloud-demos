FROM demo-build:latest

FROM openjdk:8-jre
WORKDIR /app
COPY --from=0 /build/eureka-server/target/eureka-server-1.0-SNAPSHOT.jar .
CMD java $JAVA_OPTS -jar eureka-server-1.0-SNAPSHOT.jar