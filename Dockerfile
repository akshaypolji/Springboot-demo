FROM openjdk:20-ea-19-oracle
LABEL authors="akshaypolji"

# Set the working directory inside the container
WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/demo-0.0.1-SNAPSHOT.jar"]