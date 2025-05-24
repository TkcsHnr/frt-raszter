# Stage 1: Build the app using OpenJDK 11 with Maven wrapper
FROM openjdk:11-jdk AS build
WORKDIR /app

# Copy project files
COPY pom.xml .
COPY src ./src
COPY mvnw .
COPY .mvn .mvn

# Make Maven wrapper executable and build the project (skip tests for speed)
RUN chmod +x ./mvnw
RUN ./mvnw clean package -DskipTests

# Stage 2: Run the app
FROM openjdk:11-jre
VOLUME /tmp
WORKDIR /app

# Copy the built jar from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
