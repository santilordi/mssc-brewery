package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {

    public CustomerDto getCustomerById(UUID idCustomer){
        return CustomerDto.builder()
                .idCustomer(UUID.randomUUID())
                .nameCustomer("Santiago Lordi")
                .build();
    }
}
