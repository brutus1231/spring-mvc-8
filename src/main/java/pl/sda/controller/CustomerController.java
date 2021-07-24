package pl.sda.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.model.CustomerEntity;
import pl.sda.repository.CustomerRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<CustomerEntity> findAll() {
        return customerRepository.findAll();
    }
}
