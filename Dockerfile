FROM openjdk:8
EXPOSE 8080
ADD target/dealerdatafeed-service.jar dealerdatafeed-service.jar
ENTRYPOINT ["java","-jar","/dealerdatafeed-service.jar"]