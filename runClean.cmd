@echo off
call mvnw clean package
java -jar target\app.jar --spring.profiles.active=dev --logging.level.root=DEBUG

