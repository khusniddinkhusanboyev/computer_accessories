package com.comp_accessory.computeraccessories.bootstrap;

import com.comp_accessory.computeraccessories.service.ProductExtraServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class SpringbootCommandLine implements CommandLineRunner {

    private final ProductExtraServiceImpl productExtraService;

    public SpringbootCommandLine( ProductExtraServiceImpl productExtraService) {
        this.productExtraService = productExtraService;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
