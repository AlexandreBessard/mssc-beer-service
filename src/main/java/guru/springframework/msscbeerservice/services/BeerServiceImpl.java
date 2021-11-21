package guru.springframework.msscbeerservice.services;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID uuid) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("BeerName")
                .price(new BigDecimal("100.81"))
                .build();
    }
}
