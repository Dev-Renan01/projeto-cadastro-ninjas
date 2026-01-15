package dev.java10x.CadastroDeNinjas.ninja.serviceN;

import dev.java10x.CadastroDeNinjas.ninja.modelN.NinjaModel;
import dev.java10x.CadastroDeNinjas.ninja.repositoryN.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

    public List<NinjaModel> listarTodos(){
        return ninjaRepository.findAll();
    }

    public Optional<NinjaModel> listarId(Long id){
        return ninjaRepository.findById(id);
    }

    public NinjaModel salvar(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    public NinjaModel atualizar(NinjaModel ninja){
        if (ninja.getId() == null){
            throw new RuntimeException("Informe um ID!");
        }

        if(!ninjaRepository.existsById(ninja.getId())){
            throw new RuntimeException("Id não existente, tente outro ID");
        }

        return ninjaRepository.save(ninja);
    }

    public void deletarId(Long id){
        if (id == null){
            throw new RuntimeException("Informe um ID!");
        }

        if(!ninjaRepository.existsById(id)){
            throw new RuntimeException("Id não existente, tente outro ID");
        }
        ninjaRepository.deleteById(id);
    }
}