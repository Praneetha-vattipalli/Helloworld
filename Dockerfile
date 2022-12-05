FROM dargiri/builder-openjdk17


ARG JAR_FILE="target/*.jar"

COPY ${JAR_FILE} hello-service.jar
ENTRYPOINT ["java","-jar", "hello-service.jar"]
EXPOSE 8080