package ru.geekbrains.winter.market.carts.integrations;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.geekbrains.winter.market.api.ProductDto;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ProductServiceIntegration {
    //3*
    @Value("${core-url}")
    private String url;
    //3*

    private final RestTemplate restTemplate;

    public Optional<ProductDto> getProductById(Long id) {
        //3*
        return Optional.ofNullable(restTemplate.getForObject(url + id, ProductDto.class));
    }
}
