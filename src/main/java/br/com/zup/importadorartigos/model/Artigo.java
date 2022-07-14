package br.com.zup.importadorartigos.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Artigo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String title;
    private String author;

    @Deprecated
    public Artigo() {
    }

    public Artigo(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //Getters ...

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
