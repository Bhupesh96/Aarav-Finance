# Build Stage
FROM maven:3.8.4-openjdk-17 AS build
COPY . .
RUN mvn clean package

# Runtime Stage
FROM openjdk:17-jdk-slim
COPY --from=build /target/Aarava_Finance-0.0.1-SNAPSHOT.jar Aarava_Finance.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Aarava_Finance.jar"]