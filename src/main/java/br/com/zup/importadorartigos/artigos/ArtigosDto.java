package br.com.zup.importadorartigos.artigos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ArtigosDto {

    public int page;

    @JsonProperty("per_page")
    public int perPage;

    public int total;

    @JsonProperty("total_pages")
    public int totalPages;

    public List<DetalheArtigoDto> data;

    @Deprecated
    public ArtigosDto() {
    }

    public ArtigosDto(int page, int perPage, int total, int totalPages, List<DetalheArtigoDto> data) {
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
        this.data = data;
    }

    public List<DetalheArtigoDto> getData() {
        return data;
    }
}