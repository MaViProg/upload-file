FROM java:8


ADD . /src

WORKDIR /src

RUN ./mvnw package -DskipTests

EXPOSE 8888

ENTRYPOINT ["java","-jar","/upload-file.jar"]