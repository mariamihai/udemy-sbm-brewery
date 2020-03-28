package guru.springframework.sbmbrewery.services;

import guru.springframework.sbmbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}
