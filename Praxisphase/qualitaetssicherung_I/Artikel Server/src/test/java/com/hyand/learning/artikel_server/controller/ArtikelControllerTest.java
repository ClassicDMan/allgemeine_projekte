package com.hyand.learning.artikel_server.controller;

/*
import com.hyand.learning.artikel_server.exceptions.ArtikelTextTooLongException;
import com.hyand.learning.artikel_server.model.dto.ArtikelDTO;
import com.hyand.learning.artikel_server.service.aussensicht.IArtikelService;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
public class ArtikelControllerTest {


    IArtikelService artikelService = mock(IArtikelService.class);
    ArtikelController controller = new ArtikelController(artikelService);

    @Test
    void testCreateArticle_success() {
        ArtikelDTO artikel = new ArtikelDTO();
        artikel.setTitle("Kurzer Titel");
        artikel.setContent("Kurzer Inhalt");

        ResponseEntity<String> response = controller.createArticle(artikel);

        assertEquals(200, response.getStatusCode().value());
        assertTrue(response.getBody() != null && response.getBody().contains("Artikel erstellt"));
    }

    @Test
    void testCreateArticle_textTooLong_throwsException() {
        ArtikelDTO artikel = new ArtikelDTO();
        artikel.setTitle("A".repeat(300));
        artikel.setContent("B".repeat(250));

        ArtikelTextTooLongException ex = assertThrows(
                ArtikelTextTooLongException.class,
                () -> controller.createArticle(artikel)
        );

        assertEquals("Titel und Inhalt dürfen zusammen höchstens 500 Zeichen haben.", ex.getMessage());
    }
}

*/


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
import org.springframework.http.HttpStatus;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class ArtikelControllerTest {

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
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Artikel erstellt", response.getBody());
        verify(artikelService, times(1)).save(artikel);
    }

    @Test
    void testCreateArticle_TextTooLong_ShouldThrowException() {
        // Arrange
        ArtikelDTO artikel = new ArtikelDTO();

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
        assertEquals(HttpStatus.OK, response.getStatusCode());
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

