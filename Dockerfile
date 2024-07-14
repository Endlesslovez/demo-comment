FROM openjdk:17
WORKDIR /var/jenkins_home/workspace/Learning-Jenkins
COPY . /var/jenkins_home/workspace/Learning-Jenkins
CMD ["java", "-jar", "./build/libs/DockerLearnDemo-1.0-SNAPSHOT.jar"]
