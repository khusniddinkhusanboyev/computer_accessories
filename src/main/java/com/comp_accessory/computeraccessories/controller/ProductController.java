package com.comp_accessory.computeraccessories.controller;

import com.comp_accessory.computeraccessories.dto.ProductDTO;
import com.comp_accessory.computeraccessories.entity.Product;
import com.comp_accessory.computeraccessories.service.ProductExtraService;
import com.comp_accessory.computeraccessories.service.ProductService;
import com.comp_accessory.computeraccessories.util.ProductRequest;
import com.comp_accessory.computeraccessories.util.ResponseApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<?> addProduct(@RequestBody ProductRequest productRequest) {
        if (productRequest == null){
            return ResponseEntity.ok(new ResponseApi(false , "adding product is failed" , null));
        }

        productExtraService.addDetail(productRequest.getProductExtraDetails());
        var addProduct = productService.addProduct(
                Product.builder()
                        .serialNumber(productRequest.getSerialNumber())
                        .manufacturer(productRequest.getManufacturer())
                        .price(productRequest.getPrice())
                        .quantity(productRequest.getQuantity())
                        .productExtraDetails(productRequest.getProductExtraDetails())
                        .build());
        return ResponseEntity.ok(new ResponseApi(true, "Product saved", addProduct));

    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(new ResponseApi(true , "All products" , products));
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
        return ResponseEntity.ok(products);
    }

}
