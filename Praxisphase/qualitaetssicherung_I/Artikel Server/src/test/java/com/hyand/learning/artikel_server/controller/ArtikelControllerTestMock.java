package com.hyand.learning.artikel_server.controller;

import com.hyand.learning.artikel_server.controller.ArtikelController;
import com.hyand.learning.artikel_server.exceptions.ArtikelNotFoundException;
import com.hyand.learning.artikel_server.exceptions.ArtikelTextTooLongException;
import com.hyand.learning.artikel_server.model.dto.ArtikelDTO;
import com.hyand.learning.artikel_server.service.aussensicht.IArtikelService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class ArtikelControllerTestMock {

    @Mock
    private IArtikelService artikelService;

    @InjectMocks
    private ArtikelController artikelController;

    @Test
    void testCreateArticle_Success() {
        // Arrange
        ArtikelDTO artikel = new ArtikelDTO();
        artikel.setTitle("Kurz");
        artikel.setContent("Inhalt");

        // Act
        ResponseEntity<String> response = artikelController.createArticle(artikel);

        // Assert
        assertEquals(200, response.getStatusCodeValue());
        assertEquals("Artikel erstellt", response.getBody());
        verify(artikelService, times(1)).save(artikel);
    }

    @Test
    void testCreateArticle_TextTooLong_ShouldThrowException() {
        // Arrange
        ArtikelDTO artikel = new ArtikelDTO();
        // Titel + Inhalt > 500 Zeichen
        String longText = "a".repeat(501);
        artikel.setTitle(longText);
        artikel.setContent("");

        // Act & Assert
        ArtikelTextTooLongException thrown = assertThrows(ArtikelTextTooLongException.class, () -> {
            artikelController.createArticle(artikel);
        });
        assertEquals("Titel und Inhalt dürfen zusammen höchstens 500 Zeichen haben.", thrown.getMessage());
        verify(artikelService, never()).save(any());
    }

    @Test
    void testGetArticle_Found() {
        // Arrange
        ArtikelDTO artikel = new ArtikelDTO();
        artikel.setTitle("Test");
        artikel.setContent("Inhalt");
        Long id = 1L;
        when(artikelService.findById(id)).thenReturn(Optional.of(artikel));

        // Act
        ResponseEntity<ArtikelDTO> response = artikelController.getArticle(id);

        // Assert
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(artikel, response.getBody());
        verify(artikelService, times(1)).findById(id);
    }

    @Test
    void testGetArticle_NotFound_ShouldThrowException() {
        // Arrange
        Long id = 99L;
        when(artikelService.findById(id)).thenReturn(Optional.empty());

        // Act & Assert
        ArtikelNotFoundException thrown = assertThrows(ArtikelNotFoundException.class, () -> {
            artikelController.getArticle(id);
        });
        assertEquals("Artikel mit ID 99 wurde nicht gefunden.", thrown.getMessage());
        verify(artikelService, times(1)).findById(id);
    }
}
