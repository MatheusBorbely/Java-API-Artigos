package br.com.zup.importadorartigos.service.impl;

import br.com.zup.importadorartigos.artigos.ArtigosDto;
import br.com.zup.importadorartigos.model.Artigo;
import br.com.zup.importadorartigos.model.response.ArtigoResponse;
import br.com.zup.importadorartigos.repository.ArtigoRepository;
import br.com.zup.importadorartigos.service.ArtigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtigoServiceImpl implements ArtigoService {

    @Autowired
    private ArtigoRepository artigoRepository;

    @Override
    public List<Artigo> importar(String nameAuthor) {

        List<Artigo> artigos = new ArrayList<>();

        RestTemplate restTemplate = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString("https://jsonmock.hackerrank.com/api/articles")
                .queryParam("author", nameAuthor);

        ResponseEntity<ArtigosDto> exchange = restTemplate.exchange(builder.build().toUri(),
                HttpMethod.GET,
                null,
                ArtigosDto.class);

        ArtigosDto artigosDto = exchange.getBody();


        artigosDto.getData().forEach( data -> {
            Artigo artigo = data.build();
            if(artigo != null){
                artigoRepository.save(artigo);
                artigos.add(artigo);
            }
        });

        return artigos;
    }
}
