FROM openjdk:17-jdk

WORKDIR /app

COPY build/libs/*.jar gateway-server.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "gateway-server.jar"]
