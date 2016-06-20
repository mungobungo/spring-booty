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
# Configuration management
# Service registration and discovery
# Routing and load balancing
# Fault tolerance (Circuit breakers!)
# Monitoring
# Concurrent API aggregation and Transformation


Spring environment
# Properties
# Profiles

