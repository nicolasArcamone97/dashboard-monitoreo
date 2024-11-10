FROM  openjdk:17-jdk
ARG JAR_FILE=target/dash_monitoreo-0.0.1.jar
COPY ${JAR_FILE} dash_monitoreo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/dash_monitoreo.jar"]

