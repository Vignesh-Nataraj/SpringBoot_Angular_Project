#FROM openjdk:17-distroless
#LABEL authors="vignesh"
#EXPOSE 8080
#ADD target/spring-boot-docker.jar spring-boot-docker.jar
#ENTRYPOINT ["java","-jar","spring-boot-docker.jar"]
#DEBIAN BASEED DOCKERFILE
FROM debian:bullseye-slim

# Install OpenJDK 17 with minimal packages
RUN apt-get update && apt-get install -y --no-install-recommends \
    openjdk-17-jre-headless \
    ca-certificates-java
LABEL authors="vignesh"
EXPOSE 8080
# Set environment variables
ENV JAVA_HOME /usr/lib/jvm/java-17-headless
ENV PATH $JAVA_HOME/bin:$PATH

# Create directory for application jar
WORKDIR /app

# Copy application jar
COPY target/spring-boot-docker.jar .

# Entrypoint to run the application
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]
