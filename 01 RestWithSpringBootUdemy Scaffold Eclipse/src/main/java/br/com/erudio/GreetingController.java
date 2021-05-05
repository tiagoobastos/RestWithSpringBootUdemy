package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
//	@RequestMapping("/tiago") //teste
//	public Jogo retornajogo(@RequestParam(value="id", defaultValue="0") String id) {
//		switch  (id){
//		case "1":
//			return new Jogo("1","Returnal", "PS5");
//		case "2":		
//			return new Jogo("2","Spider Man Miles Morales", "PS5");
//		case "3":
//			return new Jogo("3","Cyberpunk", "PS4");
//		default:
//			return new Jogo("0", "Jogo N/D", "Sistema N/D");
//		}		
//		
//	}
}
