package Numetry.in;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import Numetry.in.Employee;

@SpringBootApplication
public class PdfApplication implements CommandLineRunner{
	
    @Autowired  EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(PdfApplication.class, args);
	}


		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			
			if (repository.count() == 0) {
	            // save a list of Employees
	            repository.saveAll(Arrays.asList(
	                    new Employee("Donald", "Grant", "Accounts", "650.507.9833"),
	                    new Employee( "Douglas", "Nolan", "Admin", "650.507.9844"),
	                    new Employee("Jennifer", "Whalen", "Finance", "515.123.4444"),
	                    new Employee("Michael", "Hartstein", "Security", "515.123.5555"),
	                    new Employee("Pat", "Fay", "Technology", "603.123.6666"),
	                    new Employee("Jack", "Dawson", "Infra", "550.907.9933"),
	                    new Employee("Susan", "Mavrik", "Science", "515.123.7777")));
	        }
	 
			
		}

}
