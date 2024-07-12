FROM openjdk:17-jdk
COPY ./target/cluod-build-test-0.0.1-SNAPSHOT.jar /
ENTRYPOINT exec java -jar /cluod-build-test-0.0.1-SNAPSHOT.jar
EXPOSE 8080