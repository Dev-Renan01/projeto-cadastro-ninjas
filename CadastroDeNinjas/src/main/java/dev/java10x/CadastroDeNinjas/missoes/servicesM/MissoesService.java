package dev.java10x.CadastroDeNinjas.missoes.servicesM;

import dev.java10x.CadastroDeNinjas.missoes.modelM.MissoesModel;
import dev.java10x.CadastroDeNinjas.missoes.repositoryM.MissoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    @Autowired
    private MissoesRepository missoesRepository;


    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();
    }

    public Optional<MissoesModel> buscarPorMissoesId(Long id) {
        return missoesRepository.findById(id);
    }

    public MissoesModel salvarMissoe(MissoesModel missoes) {
        return missoesRepository.save(missoes);
    }

    public MissoesModel atualizarMissao(MissoesModel missao) {

        // Verifica se o ID da missão foi informado
        // Atualização sem ID não é permitida
        if (missao.getId() == null) {
            throw new RuntimeException("ID da missão é obrigatório para atualização");
        }

        // Verifica se existe uma missão com esse ID no banco de dados
        // Evita criar um novo registro por engano
        if (!missoesRepository.existsById(missao.getId())) {
            throw new RuntimeException("Missão não encontrada");
        }

        // Salva as alterações da missão existente no banco
        // Como o ID já existe, o JPA fará um UPDATE
        return missoesRepository.saveAndFlush(missao);
    }

    public void deletarMissao(Long id){
        if(!missoesRepository.existsById(id)){
            throw new RuntimeException("Id não encontrada");
        }
        missoesRepository.deleteById(id);
    }
}