FROM openjdk:17
WORKDIR /app
COPY . /app
CMD ["java", "-jar", "./build/libs/DockerLearnDemo-1.0-SNAPSHOT.jar"]
