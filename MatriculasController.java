package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Matriculas;
import vallegrande.edu.pe.service.MatriculasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/juegos")
@CrossOrigin(origins = "http://localhost:4200")
public class MatriculasController {

    @Autowired
    private MatriculasService service;

    @GetMapping
    public List<Matriculas> listar() {
        return service.listar();
    }

    @PostMapping
    public Matriculas guardar(@RequestBody Matriculas juego) {

        System.out.println("🔥 RECIBIDO: " + juego.getTitulo());

        return service.guardar(juego);

    }
}