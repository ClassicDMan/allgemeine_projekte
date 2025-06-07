package com.hyand.learning.artikel_server.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ArtikelDTO {

    @NotBlank(message = "Titel darf nicht leer sein")
    private String title;

    @NotNull(message = "Inhalt darf nicht null sein")
    private String content;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }


}
