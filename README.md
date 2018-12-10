# enterprise-containers-comparison

The build time of TomEE uber WAR takes 5 minutes to complete.

Startup time:

| WildFly AS 10.1.0 | WidlFly Swarm | TomEE JAX-RS    | TomEE Full Stack | Spring Boot |
| :---------------- |:-------------:|:---------------:| :---------------:|------------:|
|    10 seconds     |  18 seconds   | 3 - 4 seconds   |   3 - 4 seconds  | 10 seconds  |


Boot JAR size;

| WildFly AS 10.1.0 | WidlFly Swarm | TomEE JAX-RS    | TomEE Full Stack | Spring Boot |
| :---------------- |:-------------:|:---------------:|:----------------:| -----------:|
|     170/240 MB    |      90MB     |      32 MB      |       52 MB      |    28 MB    |


Java Heap size (MB) after Full GC:

| WildFly AS 10.1.0 | WidlFly Swarm | TomEE JAX-RS    | TomEE Full Stack | Spring Boot |
| :---------------- |:-------------:|:---------------:|:----------------:| -----------:|
|       29 MB       |     56 MB     |      23 MB      |       19 MB      |    37 MB    |



## TomEE Embedded

The container starts with CLI `java -jar tomee-embedded/target/tomee-embedded-1.0-SNAPSHOT.war`
and the startup completes within

Check the connection via `telnet localhost 8080`.

If you use `<tomee.flavor>jaxrs</tomee.flavor>`, the technology stack contains:
CDI, JPA, JTA, JSP, JSTL, Servlet, Java Mail, Bean Validation, JAX-RS

References:

[Apache TomeEE](http://tomee.apache.org/apache-tomee.html)

# WildFly Swarm








