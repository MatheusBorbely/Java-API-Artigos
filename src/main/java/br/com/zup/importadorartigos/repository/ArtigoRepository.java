package br.com.zup.importadorartigos.repository;

import br.com.zup.importadorartigos.model.Artigo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ArtigoRepository extends JpaRepository<Artigo, UUID> {

}
