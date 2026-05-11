mvn clean package


call mvnw clean install

mvnw spring-boot:run  -X
::java -jar target\app.jar --spring.profiles.active=dev --logging.level.root=DEBUG
