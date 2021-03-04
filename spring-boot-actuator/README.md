# Spring Boot 2 Actuator

* Create maven project using below command
```
mvn archetype:generate -DgroupId=com.spring.boot.actuator -DartifactId=spring-boot-actuator -Dversion=1.0.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
* Refer dependencies in [pom.xml](pom.xml)
* Add actuator properties in [application.yml](src/main/resources/application.yml)
* Add spring boot annotations to create spring boot application. Refer [App.java](src/main/java/com/spring/boot/actuator/App.java)
* Run [App.java](src/main/java/com/spring/boot/actuator/App.java)
* Open postman. Import postman collection file [infogain.postman_collection.json](files/infogain.postman_collection.json)
    * Check APIs
        * find-all-actuator-endpoints
        * actuator/health
        * actuator/info