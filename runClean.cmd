mvn clean package


call mvn clean install

::mvnw spring-boot:run  -X
java -jar target\app.jar --spring.profiles.active=dev --logging.level.root=DEBUG
