package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	public UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Patrick", " Mahomes", "QB","439.24"));
		this.userRepository.save(new User("Josh", "Allen", "QB","435.48"));
		this.userRepository.save(new User("Kyler", "Murray", "QB","415.91"));
		this.userRepository.save(new User("Christian", "McCaffrey", "RB","407.77"));
		this.userRepository.save(new User("Russell", "Wilson", "QB","402.13"));
		this.userRepository.save(new User("Dak", "Prescott", "QB","401.87"));
		this.userRepository.save(new User("Lamar", "Jackson", "QB","394.86"));
		this.userRepository.save(new User("Justin", "Herbert", "QB","384.57"));
		this.userRepository.save(new User("Aaron", "Rodgers", "QB","369.08"));
		this.userRepository.save(new User("Ryan", "Tannehill", "QB","353.97"));		
	}

}
