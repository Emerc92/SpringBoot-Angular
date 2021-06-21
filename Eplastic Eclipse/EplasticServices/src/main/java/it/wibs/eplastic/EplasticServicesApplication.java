package it.wibs.eplastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EplasticServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EplasticServicesApplication.class, args);
		
		/*try {
			OrderServices.getInstance().callListOrder();
		}catch(Exception e) {
			e.printStackTrace();
		}*/
	}

}
