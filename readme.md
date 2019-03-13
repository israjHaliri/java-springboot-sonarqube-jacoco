## Needed stacks
    + maven 3
    + java8
    + sonarqube

## Tech stacks
    + maven 3
    + java8
    + sonarqube
    + jacoco

## To get started follow this checklist:
    + docker-compose up
    + mvn clean verify && mvn sonar:sonar -Dsonar.host.url=http://localhost:9092
    + use mvn sonar:sonar -Dsonar.host.url=http://localhost:9092 -Dsonar.login=sonar -Dsonar.password=sonar if provide usernam and password
