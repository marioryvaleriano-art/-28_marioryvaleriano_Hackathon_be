package vallegrande.edu.pe.service;

import vallegrande.edu.pe.model.Matriculas;
import vallegrande.edu.pe.repository.MatriculasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculasService {

    @Autowired
    private MatriculasRepository repo;

    public List<Matriculas> listar() {
        return repo.findAll();
    }

    public Matriculas guardar(Matriculas j) {
        return repo.save(j);
    }

    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}