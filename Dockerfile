FROM openjdk:8

ADD target/cicdspring-0.0.1-SNAPSHOT.jar cicdspring-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","cicdspring-0.0.1-SNAPSHOT.jar"]