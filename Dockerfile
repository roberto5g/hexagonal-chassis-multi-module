FROM openjdk:17-alpine
ARG JAR_VERSION
WORKDIR /opt/app
COPY board-application/target/board-application-${JAR_VERSION}.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
