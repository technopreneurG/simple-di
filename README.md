# simple-di
A simple Dependency Injection example with Jersey2.x & Guice3

DI: http://www.martinfowler.com/articles/injection.html

Jersey: RESTful Web Services in Java. (https://jersey.java.net/)
Guice:  Guice (pronounced 'juice') is a lightweight dependency injection
           framework for Java 6 and above, brought to you by Google.
           (https://github.com/google/guice)




Running the example:

git clone This-Repo
$ cd simple-di
$ mvn clean install
$ cd ws
$ mvn jetty:run


From another console try:
$ curl -v -H "Accept: application/json"  -X GET "http://localhost:8080/v1/test/1"

For more fun:
$ curl -v -H X-Jersey-Tracing-Accept:whatever -H "Accept: application/json"  -X GET "http://localhost:8080/v1/test/1"
