FROM maven:latest
WORKDIR /reflect_places_1

COPY . /reflect_places_1
COPY . /src/main/resources/application.yaml
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/reflect_places_1/target/reflect_places_1-0.0.1-SNAPSHOT.jar"]