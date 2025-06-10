package dev.java10x.CadastroDeNinjas.ninja;

 import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/ninja")
    public class NinjaController {

        private final NinjaService ninjaService;

        public NinjaController(NinjaService ninjaService){
            this.ninjaService = ninjaService;
        }


        @GetMapping
        public String boasVindas(){
            return "Olá, seja bem vindo ao meu projeto!";

        }

        //GET
        @GetMapping("/listar")
        public List<NinjaModel> getAll(){
            return ninjaService.getAll();
        }

        //POST
        @PostMapping("/criar")
        public NinjaModel create(@RequestBody NinjaModel ninjaModel){
            return ninjaService.save(ninjaModel);
        }

        //DELETE
        @DeleteMapping("/deletar")
        public void delete(Long id){
            ninjaService.delete(id);
        }


    }
