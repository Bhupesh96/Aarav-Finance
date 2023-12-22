# Build Stage
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package

# Runtime Stage
FROM openjdk:17-jre-slim
WORKDIR /app
COPY --from=build /app/target/your-app-name.jar your-app-name.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "your-app-name.jar"]