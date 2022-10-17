package Ciclo3.Solucion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = {"Ciclo3.Solucion.modelo"})
@SpringBootApplication
public class SolucionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolucionApplication.class, args);
	}

}
