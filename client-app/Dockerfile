FROM gradle:7.5-alpine

RUN gradle clean build -x test

EXPOSE 8082

COPY build/libs/*.jar /app/client-app.jar

ENTRYPOINT ["java","-jar","/app/client-app.jar"]