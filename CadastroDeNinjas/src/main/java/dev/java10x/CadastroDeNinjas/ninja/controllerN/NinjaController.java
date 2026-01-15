package dev.java10x.CadastroDeNinjas.ninja.controllerN;

import dev.java10x.CadastroDeNinjas.ninja.modelN.NinjaModel;
import dev.java10x.CadastroDeNinjas.ninja.serviceN.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
    @RequestMapping("/ninja")
    public class NinjaController {

        @Autowired
        private NinjaService ninjaService;

        @GetMapping(value = "/listartodos")
        @ResponseStatus(HttpStatus.OK)
        public List<NinjaModel> listartodos(){
            return ninjaService.listarTodos();
        }

        @GetMapping(value = "/listarid")
        @ResponseStatus(HttpStatus.OK)
        public Optional<NinjaModel> listarId(Long id){
            return ninjaService.listarId(id);
        }

        @PostMapping(value = "/salvar")
        @ResponseStatus(HttpStatus.OK)
        public NinjaModel salvar(NinjaModel ninja){
            return ninjaService.salvar(ninja);
        }

        @PutMapping(value = "/atualizar")
        @ResponseStatus(HttpStatus.OK)
        public NinjaModel atualizar(@RequestBody NinjaModel ninja){
            return ninjaService.atualizar(ninja);
        }

        @PutMapping(value = "/deletarid")
        @ResponseStatus(HttpStatus.OK)
        public void deletarId(Long id){
            ninjaService.deletarId(id);
        }
    }
