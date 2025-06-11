package dev.java10x.CadastroDeNinjas.missoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
        List<MissoesModel> findByDificuldade(DificuldadeMissao dificuldadeMissao);

        List<MissoesModel> findByStatus(StatusMissao statusMissao);
}
