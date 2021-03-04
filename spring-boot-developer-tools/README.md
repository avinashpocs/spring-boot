# Spring Boot Developer Tools

* Create maven project using following command
```
mvn archetype:generate -DgroupId=com.spring.boot.developer.tools -DartifactId=spring-boot-developer-tools -Dversion=1.0.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
* Refer dependencies in [pom.xml](pom.xml)
* Refer properties in [application.yml](src/main/resources/application.yml)
* Add spring boot annotations in [App.java](src/main/java/com/spring/boot/developer/tools/App.java)
* Write sample GET API [AppController.java](src/main/java/com/spring/boot/developer/tools/controller/AppController.java)
* Run main app [App.java](src/main/java/com/spring/boot/developer/tools/App.java)
* Import postman collection to local postman - [infogain.postman_collection.json](files/infogain.postman_collection.json)
    * /api/v1/customers
* Change anything in the API, we can see application reloads automatically without manual restart

# References
* [https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html](https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html)