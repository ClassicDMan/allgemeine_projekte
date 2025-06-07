package com.hyand.learning.artikel_server.service.aussensicht;

import com.hyand.learning.artikel_server.model.dto.ArtikelDTO;

import java.util.Optional;

public interface IArtikelService {
    Optional<ArtikelDTO> findById(Long id);
    public Long save(ArtikelDTO artikel);

}
