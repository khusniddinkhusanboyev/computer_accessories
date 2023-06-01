package com.comp_accessory.computeraccessories.desktop.service;

import com.comp_accessory.computeraccessories.desktop.dto.DesktopDTO;
import com.comp_accessory.computeraccessories.desktop.model.Desktop;
import com.comp_accessory.computeraccessories.desktop.repository.DesktopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DesktopService {
    private final DesktopRepository desktopRepository;
    public DesktopDTO add(Desktop desktop){
        desktopRepository.findAll().stream()
                .allMatch()
      Desktop savedDesktop= desktopRepository.save(desktop);

      return DesktopDTO.mapToDesktopDTO(savedDesktop);
    }



}
