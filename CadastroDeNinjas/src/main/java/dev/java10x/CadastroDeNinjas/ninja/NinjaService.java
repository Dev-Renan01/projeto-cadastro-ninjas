package dev.java10x.CadastroDeNinjas.ninja;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
