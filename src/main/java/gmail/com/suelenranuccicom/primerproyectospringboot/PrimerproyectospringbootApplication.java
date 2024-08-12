package gmail.com.suelenranuccicom.primerproyectospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "gmail.com.suelenranuccicom")

public class PrimerproyectospringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerproyectospringbootApplication.class, args);
	}

}
