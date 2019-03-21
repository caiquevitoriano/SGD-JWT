package exemplo.SGDJWT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class SgdJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgdJwtApplication.class, args);
	}

	// rota "/home"  verifica o funcionamento correto da aplicação
	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String hello() {
		return "Hello buddy!";
	}

}
