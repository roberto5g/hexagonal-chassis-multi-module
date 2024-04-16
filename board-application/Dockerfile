FROM openjdk:17-alpine
#ARG JAR_VERSION
WORKDIR /opt/app
COPY /home/roberto/Workspace/Java/board-service/board-application/target/board-application-0.0.1.jar app.jar
#COPY ../board-application/target/board-application-${JAR_VERSION}.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
