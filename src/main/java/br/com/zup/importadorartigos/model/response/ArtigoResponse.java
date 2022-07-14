package br.com.zup.importadorartigos.model.response;

import br.com.zup.importadorartigos.model.Artigo;

import java.util.ArrayList;
import java.util.List;

public class ArtigoResponse {

    private String title;


    public ArtigoResponse(Artigo artigo) {
        this.title = artigo.getTitle();

    }

    public String getTitle() {
        return title;
    }

}
