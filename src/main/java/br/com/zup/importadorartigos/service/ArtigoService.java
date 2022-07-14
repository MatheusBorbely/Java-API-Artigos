package br.com.zup.importadorartigos.service;

import br.com.zup.importadorartigos.model.Artigo;
import br.com.zup.importadorartigos.model.response.ArtigoResponse;

import java.util.List;

public interface ArtigoService {

    public List<Artigo> importar(String nameAuthor);
}
