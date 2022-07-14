package br.com.zup.importadorartigos.model.response;

import br.com.zup.importadorartigos.model.Artigo;

import java.util.ArrayList;
import java.util.List;

public class ArtigoResponseAux {

    private Integer total;
    private List<ArtigoResponse> artigos = new ArrayList<>();

    public ArtigoResponseAux(Integer total, List<Artigo> artigo) {
        this.total = total;
        artigo.forEach(art -> {
            this.artigos.add(new ArtigoResponse(art));
        });
    }

    public Integer getTotal() {
        return total;
    }

    public List<ArtigoResponse> getArtigos() {
        return artigos;
    }
}
