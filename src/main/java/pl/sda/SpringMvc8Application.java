package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.model.CustomerEntity;
import pl.sda.repository.CustomerRepository;

@SpringBootApplication
public class SpringMvc8Application implements ApplicationRunner {

    @Autowired
    private CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringMvc8Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        if (customerRepository.findAll().isEmpty()) {
            createCustomer("Adam", "Nowak", 20);
            createCustomer("Monika", "Kowalska", 21);
            createCustomer("Justyna", "Nowa", 20);
            createCustomer("Anna", "Bagińska", 25);
            createCustomer("Marcin", "Mrozik", 42);
        }
    }

    private void createCustomer(String firstName, String lastName, Integer age) {
        CustomerEntity customerEntity = CustomerEntity.builder()
                .fistName(firstName)
                .lastName(lastName)
                .age(age).build();
        customerRepository.save(customerEntity);
    }
}
