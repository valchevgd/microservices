package com.valchevgd.productservice.service;

import com.valchevgd.productservice.dto.ProductRequest;
import com.valchevgd.productservice.model.Product;
import com.valchevgd.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;
    @Override
    public void create(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);

        log.info("Product with id {} is created", product.getId());
    }
}
