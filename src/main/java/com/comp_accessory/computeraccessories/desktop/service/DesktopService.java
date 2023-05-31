package com.comp_accessory.computeraccessories.desktop.service;

import com.comp_accessory.computeraccessories.desktop.repository.DesktopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DesktopService {
    private final DesktopRepository desktopRepository;


}
