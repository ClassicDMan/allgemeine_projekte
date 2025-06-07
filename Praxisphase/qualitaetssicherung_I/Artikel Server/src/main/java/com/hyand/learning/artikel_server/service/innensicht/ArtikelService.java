package com.hyand.learning.artikel_server.service.innensicht;

import com.hyand.learning.artikel_server.model.dto.ArtikelDTO;
import com.hyand.learning.artikel_server.service.aussensicht.IArtikelService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class ArtikelService implements IArtikelService {


    private final Map<Long, ArtikelDTO> artikelMap = new HashMap<>();
    private long nextId = 1;

    @Override
    public Optional<ArtikelDTO> findById(Long id) {
        return Optional.ofNullable(artikelMap.get(id));
    }

    public Long save(ArtikelDTO artikel) {
        long id = nextId++;
        artikelMap.put(id, artikel);
        return id;
    }
}
