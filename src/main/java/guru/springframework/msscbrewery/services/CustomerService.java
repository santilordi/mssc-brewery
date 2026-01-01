package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerService {

    public CustomerDto getCustomerById(UUID idCustomer){
        return CustomerDto.builder()
                .idCustomer(UUID.randomUUID())
                .nameCustomer("Santiago Lordi")
                .build();
    }

    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .idCustomer(UUID.randomUUID())
                .nameCustomer("Santiago Lordi")
                .build();
    }

    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //TODO
    }

    public void deleteById(UUID customerId) {
        log.debug("Deleting customer...");
    }
}
