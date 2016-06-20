# spring-booty
playing with spring boot and stuff

based on nice presentation [Building disributed systems with Netflix OSS and Spring Cloud](http://www.meetup.com/Data-Engineers-Guild/events/219264521/)

video of presentation is here [youtube building systems with spring boot and cloud](https://www.youtube.com/watch?v=hV5TTSiFhRs&list=PL62pIycqXx-QKMyHqLem4Nh00Wnd2emwr)

Define: microservice
"Loosely coupled service oriented architecture with bounded contexts..."
Adrian Cockroft

minimal microservice in java

```java
@RestController
class ThisWillActuallyRun {
	@RequestMapping("/")
	String home(){
		return "Hello World";
	}
}
```


No microservice is an island.
We need composition of something.

challanges of distributed systems
1. Configuration management
1. Service registration and discovery
1. Routing and load balancing
1. Fault tolerance (Circuit breakers!)
1. Monitoring
1. Concurrent API aggregation and Transformation


Spring environment
1. Properties
1. Profiles

Sever config =
wrapper on top of git config

We need to setup Config server and point it to git repo
We need to setup config client and point it to config server
we need to create properties file with client name

When the client is starting, he calls to config server and retrieves its configuration.
If we want to change configuration in runtime, we need to make POST to
http://config_client_address/refresh


But its kinda boring. 
What if we can send message, that says - updata all configurations based on the value inside git repository, and let all the apps that care about those values, refresh its state and behaviour.

to make it happen we need to use cloudBus
and make call
```
curl -X POST http://localhost:8888/bus/refresh
```

All we need to setup is add pom reference in client

```
 <dependency> 
      <groupId>org.springframework.cloud</groupId> 
      <artifactId>spring-cloud-starter-bus-amqp</artifactId> 
    </dependency> 
```

and properly setup configuration for amqp connection in bootstrap.properties

```
spring.rabbitmq.addresses=192.168.99.100:32772
```

What it does

1. sending message to the app
2. app sends message to the bus
3. config server receives message
4. config server goes to git repo
5. config server reads value
6. config server publishes value to the bus
7. all clients within refresh scope that is touched by property refresh their state and re-instantiate beans related








