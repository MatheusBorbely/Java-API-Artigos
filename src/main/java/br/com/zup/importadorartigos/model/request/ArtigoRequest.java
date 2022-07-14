package br.com.zup.importadorartigos.model.request;

import javax.validation.constraints.NotBlank;

public class ArtigoRequest {

    @NotBlank(message = "{autor.blank}")
    private String autor;

    @Deprecated
    public ArtigoRequest() {
    }

    public String getAutor() {
        return autor;
    }
}
