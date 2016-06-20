# spring-booty
playing with spring boot and stuff

Define: microservice
"Loosely coupled service oriented architecture with bounded contexts..."
Adrian Cockroft

minimal microservice in java

```
@RestController
class ThisWillActuallyRun {
	@RequestMapping("/")
	String home(){
		return "Hello World";
	}
}
```
