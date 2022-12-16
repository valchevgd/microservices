package com.valchevgd.productservice.service;

import com.valchevgd.productservice.dto.ProductRequest;
import com.valchevgd.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    void create(ProductRequest productRequest);

    List<ProductResponse> getAll();
}
