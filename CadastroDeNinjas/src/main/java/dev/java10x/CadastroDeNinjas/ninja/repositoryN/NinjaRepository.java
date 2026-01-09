package dev.java10x.CadastroDeNinjas.ninja.repositoryN;

import dev.java10x.CadastroDeNinjas.ninja.modelN.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends JpaRepository<NinjaModel,Long> {
}
