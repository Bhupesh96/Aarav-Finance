FROM eclipse-temurin:21-jdk As build
COPY . .
RUN mvn clean package

FROM baseImage.6-eclipse-temurin-11
COPY --from=build /targer/Aarava_Finance-0.0.1-SNAPSHOT.jar Aarava_Finance.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","Aarava_Finance.jar" ]