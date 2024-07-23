package adonai.CadastroUsuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UsuarioApp {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioApp.class, args);
	}

}
