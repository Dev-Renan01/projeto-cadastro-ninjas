package dev.java10x.CadastroDeNinjas.missoes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    private final MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    //LISTAR
    public List<MissoesModel> getAll() {
        return missoesRepository.findAll();
    }

    //CRIAR
    public MissoesModel save(MissoesModel missoesModel) {
        return missoesRepository.save(missoesModel);
    }

    //DELETE
    public void delete(Long id){
        missoesRepository.deleteById(id);
    }
}

