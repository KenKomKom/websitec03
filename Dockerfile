FROM gradle:jdk21-alpine

WORKDIR /app
RUN ls -al
COPY ./WebsiteC03-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java","-jar","WebsiteC03-0.0.1-SNAPSHOT.jar"]