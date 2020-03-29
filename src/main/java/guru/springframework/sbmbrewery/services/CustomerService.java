package guru.springframework.sbmbrewery.services;

import guru.springframework.sbmbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID uuid);
}
