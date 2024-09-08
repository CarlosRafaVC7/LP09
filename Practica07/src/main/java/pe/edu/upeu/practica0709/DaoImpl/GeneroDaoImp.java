package pe.edu.upeu.practica0709.DaoImpl;
import java.util.List;




import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.practica0709.Dao.GeneroDao;
import pe.edu.upeu.practica0709.Repository.GeneroRepository;
import pe.edu.upeu.practica0709.entity.Genero;
@Component

public class GeneroDaoImp implements GeneroDao {

    @Autowired
    private GeneroRepository generoRepository;
    
    @Override
    public Genero create(Genero g) {
        return generoRepository.save(g);
    }

    @Override
    public Genero update(Genero g) {
        return generoRepository.save(g);
    }

    @Override
    public void delete(Long id) {
        generoRepository.deleteById(id);
    }

    @Override
    public Optional<Genero> read(Long id) {
        return generoRepository.findById(id);
    }

    @Override
    public List<Genero> readAll() {
        return generoRepository.findAll();
    }
}

