For Spring Cloud Server config we need the following dependencies

1) Spring config server
2) Eureka server
3) Dev tools [optional]
4) Actuator [optional]

Build path --> Link source --> local git folder

Add the following property value in the server application.properties file
spring.cloud.config.server.git.uri --> give the uri to local git

Rename the application.properties in the client spring config to bootstrap.properties