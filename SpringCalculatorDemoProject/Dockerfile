# Use a base image with OpenJDK 17
FROM openjdk:17-jdk-alpine
 
# Set the working directory inside the container
WORKDIR /app
 
# Copy the WAR file into the container at /app
COPY /target/SpringCalculatorDemoProject-0.0.1-SNAPSHOT.jar /app/springcalculatordemoproject.jar
 
# Expose the port that the application will run on
EXPOSE 8080
 
# Define environment variables
ENV SPRING_DATASOURCE_URL=jdbc:mysql://db:3307/calculator?allowPublicKeyRetrieval=true
ENV SPRING_DATASOURCE_USERNAME=root
ENV SPRING_DATASOURCE_PASSWORD=root

# Specify the command to run on container startup
CMD ["java", "-jar", "springcalculatordemoproject.jar"]

