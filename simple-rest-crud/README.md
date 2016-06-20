Simple REST-crud, based on im-memory database H2.
After each restart data is lost.

Made on top of this stuff [spring data rest example](https://spring.io/guides/gs/accessing-data-rest/)

to make it build

```
mvn clean package
```

to make it run

```
mvn spring-boot:run
```

or just java

```
java -jar build/libs/gs-accessing-data-rest-0.1.0.jar
```

It sits on top of port 8080 and you can play with it using following queries

Guid in examples is created while inserting person to Db. So replace it with proper value

```
curl -i -X POST -H "Content-Type:application/json" -d '{  "firstName" : "Frodo",  "lastName" : "Baggins" }' http://localhost:8080/people


curl http://localhost:8080/people

curl http://localhost:8080/people/search

curl http://localhost:8080/people/search/findByLastName?name=Baggins


curl -X PUT -H "Content-Type:application/json" -d '{ "firstName": "Bilbo", "lastName": "Baggins" }' http://localhost:8080/people/8dc485ae-e609-40fd-a39e-51013ebcce32

curl -X PATCH -H "Content-Type:application/json" -d '{ "firstName": "Bilbo Jr." }' http://localhost:8080/people/8dc485ae-e609-40fd-a39e-51013ebcce32

curl -X DELETE http://localhost:8080/people/8dc485ae-e609-40fd-a39e-51013ebcce32

```

To build file with docker please do following

```
docker build -t mungobungo-spring-rest .
```

to execute docker image

```
docker run -p 8080:8080 mungobungo-spring-rest
```

If you're running it on windows machine, do not forget that docker host will have ip address something like 192.168.99.100
so to get access to service, please use url [http://192.168.99.100:8080/people/](http://192.168.99.100:8080/people/)
