package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.web.domain.Customer;
import guru.springframework.msscbrewery.web.domain.Customer.CustomerBuilder;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import guru.springframework.msscbrewery.web.model.CustomerDto.CustomerDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-03T20:52:41-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.29 (Microsoft)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto customerToCustomerDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDtoBuilder customerDto = CustomerDto.builder();

        customerDto.idCustomer( customer.getIdCustomer() );
        customerDto.nameCustomer( customer.getNameCustomer() );

        return customerDto.build();
    }

    @Override
    public Customer customerDtoToCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        CustomerBuilder customer = Customer.builder();

        customer.idCustomer( customerDto.getIdCustomer() );
        customer.nameCustomer( customerDto.getNameCustomer() );

        return customer.build();
    }
}
