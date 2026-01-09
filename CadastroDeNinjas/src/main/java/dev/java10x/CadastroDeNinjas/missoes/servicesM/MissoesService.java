package dev.java10x.CadastroDeNinjas.missoes.servicesM;

import dev.java10x.CadastroDeNinjas.missoes.modelM.MissoesModel;
import dev.java10x.CadastroDeNinjas.missoes.repositoryM.MissoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    private final MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> getAll() {
        return missoesRepository.findAll();
    }

    public MissoesModel save(MissoesModel missao) {
        return missoesRepository.save(missao);
    }

    public void delete(Long id) {
        missoesRepository.deleteById(id);
    }

    public List<MissoesModel> buscarPorDificuldade(String dificuldadeTexto) {
        DificuldadeMissao dificuldade = DificuldadeMissao.valueOf(dificuldadeTexto.toUpperCase());
        return missoesRepository.findByDificuldade(dificuldade);
    }

    public List<MissoesModel> buscarPorStatus(String statusTexto) {
        StatusMissao status = StatusMissao.valueOf(statusTexto.toUpperCase());
        return missoesRepository.findByStatus(status);
    }
}