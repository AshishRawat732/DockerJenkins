FROM openjdk:18

ADD target/dockerdemo.jar  dockerdemo.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","dockerdemo.jar"]
