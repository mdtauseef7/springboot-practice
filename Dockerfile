# Step 1: Use a base image with JDK
FROM openjdk:17-jdk-slim AS build

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the JAR file into the container
COPY target/AddressService-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Expose the port the app will run on
EXPOSE 8081

#set profile for DB connection
ENV SPRING_PROFILES_ACTIVE=docker

# Step 5: Run the Spring Boot app when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
