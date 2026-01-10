package dev.java10x.CadastroDeNinjas.missoes.repositoryM;

import dev.java10x.CadastroDeNinjas.missoes.modelM.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {}
