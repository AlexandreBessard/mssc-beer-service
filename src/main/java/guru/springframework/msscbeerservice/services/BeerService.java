package guru.springframework.msscbeerservice.services;

import guru.springframework.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID uuid);
}
