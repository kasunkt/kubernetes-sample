FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:resolve

#COPY src ./src

#CMD ["./mvnw", "spring-boot:run"]

COPY ./target/java-project-1.0-SNAPSHOT.jar /app

CMD ["java", "-jar","java-project-1.0-SNAPSHOT.jar"]

#export dockr image to oci fomat
#docker buildx build --tag samplejava:oci --output type=oci,dest=./samplejava.tar .