package com.comp_accessory.computeraccessories.bootstrap;

import com.comp_accessory.computeraccessories.service.ProductExtraService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringbootCommandLine implements CommandLineRunner {

    private final ProductExtraService productExtraService;

    public SpringbootCommandLine( ProductExtraService productExtraService) {
        this.productExtraService = productExtraService;
    }

    @Override
    public void run(String... args) throws Exception {
  /*      categoryService.addCategory(Category.builder().name("Laptop").build());
        categoryService.addCategory(Category.builder().name("Notebook").build());
        categoryService.addCategory(Category.builder().name("Monitor").build());
        categoryService.addCategory(Category.builder().name("Hard Disk").build());
*/
        ///
      //  categoryDetailsService.addDetail(ProductExtraDetails.builder().name("form_factor").category(Category.builder().id(1).name("Laptop").build()).build());



    }
}
