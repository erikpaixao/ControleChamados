package paixao.erik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class ControleChamadosApplication {
	
	@RequestMapping("/")
	public String home(){
		return "teste";
	}

	public static void main(String[] args) {
		SpringApplication.run(ControleChamadosApplication.class, args);
	}
}
