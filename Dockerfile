FROM maven:3-openjdk-8
WORKDIR /build
ADD . .
RUN ["mvn" ,"package"]