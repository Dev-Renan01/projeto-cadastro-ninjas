package dev.java10x.CadastroDeNinjas.ninja.serviceN;

import dev.java10x.CadastroDeNinjas.ninja.modelN.NinjaModel;
import dev.java10x.CadastroDeNinjas.ninja.repositoryN.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;

     public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //LISTAR
     public List<NinjaModel> getAll(){
         return ninjaRepository.findAll();
    }

    //CRIAR
    public NinjaModel save(NinjaModel ninjaModel){
         return ninjaRepository.save(ninjaModel);
    }

    //DELETAR
    public void delete(Long id){
         ninjaRepository.deleteById(id);
    }
}
