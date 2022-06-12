# syntax=docker/dockerfile:1

FROM openjdk:16-alpine3.13

WORKDIR /home/nidhal/Bureau/Dossier_Nidhal/Scolaire/Efrei/M1/S8/DevOps/tp1/DevOps_TP1

COPY mvnw pom.xml ./
RUN ./mvnw clean install

COPY src ./src

EXPOSE 8081

CMD ["./mvnw", "quarkus:dev"]