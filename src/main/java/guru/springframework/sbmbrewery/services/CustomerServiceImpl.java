package guru.springframework.sbmbrewery.services;

import guru.springframework.sbmbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID uuid) {
        return CustomerDto.builder()
                .uuid(UUID.randomUUID())
                .customerName("name")
                .build();
    }
}
