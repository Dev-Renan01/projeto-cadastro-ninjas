package dev.java10x.CadastroDeNinjas.missoes.controllerM;

import dev.java10x.CadastroDeNinjas.missoes.repositoryM.MissoesRepository;
import dev.java10x.CadastroDeNinjas.missoes.servicesM.MissoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/missoes")
public class MissoesController {

    @Autowired
    private MissoesService missoesService;








}