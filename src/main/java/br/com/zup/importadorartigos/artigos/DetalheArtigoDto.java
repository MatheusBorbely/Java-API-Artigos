package br.com.zup.importadorartigos.artigos;

import br.com.zup.importadorartigos.model.Artigo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DetalheArtigoDto {

    public String title;
    public String url;
    public String author;

    @JsonProperty("num_comments")
    public int numComments;

    @JsonProperty("story_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public int storyId;

    @JsonProperty("story_title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String storyTitle;

    @JsonProperty("story_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String storyUrl;

    @JsonProperty("parent_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public int parentId;

    @JsonProperty("created_at")
    public int createdAt;

    @Deprecated
    public DetalheArtigoDto() {
    }

    public DetalheArtigoDto(String title, String url, String author, int numComments, int storyId, String storyTitle, String storyUrl, int parentId, int createdAt) {
        this.title = title;
        this.url = url;
        this.author = author;
        this.numComments = numComments;
        this.storyId = storyId;
        this.storyTitle = storyTitle;
        this.storyUrl = storyUrl;
        this.parentId = parentId;
        this.createdAt = createdAt;
    }

    public Artigo build(){
        if(title == null && storyTitle == null) return null;

       return new Artigo(this.title != null ? this.title : this.storyTitle,
                this.author
        );

    }
}