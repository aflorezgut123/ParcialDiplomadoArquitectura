FROM eclipse-temurin:17.0.5_8-jre

COPY /target/ParcialKubernetesPedidos-0.0.1-SNAPSHOT.jar ./app.jar

CMD ["java","-jar","./app.jar"]