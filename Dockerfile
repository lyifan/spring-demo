FROM amazoncorretto:21
EXPOSE 8080
COPY target/demo-0.0.1-SNAPSHOT.jar /demo-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/demo-0.0.1-SNAPSHOT.jar"]