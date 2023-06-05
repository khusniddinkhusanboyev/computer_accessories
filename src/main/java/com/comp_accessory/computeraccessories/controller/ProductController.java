package com.comp_accessory.computeraccessories.controller;

import com.comp_accessory.computeraccessories.dto.ProductDTO;
import com.comp_accessory.computeraccessories.entity.Product;
import com.comp_accessory.computeraccessories.service.ProductExtraService;
import com.comp_accessory.computeraccessories.service.ProductService;
import com.comp_accessory.computeraccessories.util.ResponseApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;
    private final ProductExtraService productExtraService;

    @PostMapping("/add-product")
    public ResponseEntity<?> addProduct(@RequestBody Product product) {

        productExtraService.addDetail(product.getProductExtraDetails());
        var addProduct = productService.addProduct(product);


        return ResponseEntity.ok(new ResponseApi(true, "Product saved", addProduct));

    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok().body(products);
    }

  /*  @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id)
    {
     //   Product product = productService.getProductById(id);
       // return ResponseEntity.ok().body(product);
    }*/

    @GetMapping("/{typesId}")
    public ResponseEntity<?> getByTypeId(@PathVariable("typeId") Integer typeId) {
        List<Product> products = productService.getProductsByType(typeId);
        return ResponseEntity.ok().body(products);
    }

}
