# Build Stage
FROM eclipse-temurin:17-jdk AS build
WORKDIR /app
COPY . .
RUN RUN mvn clean package

# Runtime Stage
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/Aarava_Finance-0.0.1-SNAPSHOT.jar Aarava_Finance.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Aarava_Finance.jar"]