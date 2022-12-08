FROM openjdk:8-jdk-alpine
EXPOSE 4200
ADD C:/Users/lenovo/.jenkins/workspace/DevopsProject/target/DevOpsProject-0.0.1-SNAPSHOT.jar devopsProject.jar
ENTRYPOINT ["java","-jar","/devopsProject.jar"]