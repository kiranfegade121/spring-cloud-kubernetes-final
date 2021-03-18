FROM openjdk:8-jdk-alpine
LABEL MAINTAINER="amit@gmail.com" version=1.0 description="Currency Exchange Service"
WORKDIR /usr/app
COPY target/*.jar  app.jar 
EXPOSE 8082
CMD ["java", "-jar", "app.jar"]

