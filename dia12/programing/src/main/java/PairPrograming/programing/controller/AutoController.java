
package PairPrograming.programing.controller;

import PairPrograming.programing.models.Auto;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/Auto")
public class AutoController {
    
    
    Auto[] cacharros = {
        new Auto(1, "Fiat", "500", 2013, 250),
        new Auto(2, "Peugeot", "206", 1999, 7000),
        new Auto(3, "Nissan", "Skyline", 2007, 5000),
        new Auto(4, "Fiat", "600", 1995, 10000)
    };
        
    
    @PostMapping("/guardar/Auto")
    public Auto guardarAuto(@RequestBody Auto cacharro){
        cacharro.setId(cacharros.length + 1);
        return cacharro;
    }
    
    
    @GetMapping("/get/all/Auto")
    public Auto[] traerTodosAutos(){
        return cacharros;
    }

    
    @GetMapping("/get/one/Auto/{id}")
    public Auto traerUnAuto(@PathVariable(name = "id") int id){
        if(((id -1) < (cacharros.length-1)) || ((id-1) < 0)){
            return new Auto(0, "", "", 0, 0);
        }
        return cacharros[id-1];
    }
    
}
