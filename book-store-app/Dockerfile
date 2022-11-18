FROM gradle:7.5-alpine

RUN gradle clean build -x test

EXPOSE 8080

COPY build/libs/*.jar /app/book-store-app.jar

ENTRYPOINT ["java","-jar","/app/book-store-app.jar"]