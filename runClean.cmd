@echo off
call mvnw clean package
call mvnw spring-boot:run  -X
::java -jar target\app.jar --spring.profiles.active=dev --logging.level.root=DEBUG

