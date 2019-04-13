FROM openjdk:8-jdk-slim

ADD target/kube-funbox.jar /

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/kube-funbox.jar"]
