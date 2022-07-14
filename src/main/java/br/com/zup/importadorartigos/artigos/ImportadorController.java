package br.com.zup.importadorartigos.artigos;

import br.com.zup.importadorartigos.model.Artigo;
import br.com.zup.importadorartigos.model.request.ArtigoRequest;
import br.com.zup.importadorartigos.model.response.ArtigoResponseAux;
import br.com.zup.importadorartigos.service.ArtigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

/**
 * Atenção: Na descrição existem instruções sobre o endpoint a ser criado
 */
@RestController
public class ImportadorController {

    @Autowired
    private ArtigoService artigoService;

    @PostMapping("/artigos/importador")
    public ResponseEntity<ArtigoResponseAux> importaArtigos(@RequestBody @Valid ArtigoRequest autor){

        List<Artigo> artigos = artigoService.importar(autor.getAutor());

        return ResponseEntity.ok(new ArtigoResponseAux(artigos.size(), artigos));

    }


}