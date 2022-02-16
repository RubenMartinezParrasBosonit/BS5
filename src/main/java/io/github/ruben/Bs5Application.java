package io.github.ruben;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
public class Bs5Application {

	public static void main(String[] args) {
		SpringApplication.run(Bs5Application.class, args);
	}
	@PostConstruct
	private void loggDemo(){
		log.trace("A TRACE Message");
		log.debug("A DEBUG Message");
		log.info("An INFO Message");
		log.warn("A WARN Message");
		log.error("An ERROR Message");
	}

}
