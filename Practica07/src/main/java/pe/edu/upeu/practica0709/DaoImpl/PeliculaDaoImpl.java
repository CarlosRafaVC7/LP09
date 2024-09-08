package pe.edu.upeu.practica0709.DaoImpl;
import java.util.List;




import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.practica0709.Dao.PeliculaDao;
import pe.edu.upeu.practica0709.Repository.PeliculaRepository;
import pe.edu.upeu.practica0709.entity.Pelicula;
@Component

public class PeliculaDaoImpl implements PeliculaDao {

    @Autowired
    private PeliculaRepository peliculaRepository;
    
    @Override
    public Pelicula create(Pelicula p) {
        return peliculaRepository.save(p);
    }

    @Override
    public Pelicula update(Pelicula p) {
        return peliculaRepository.save(p);
    }

    @Override
    public void delete(Long id) {
        peliculaRepository.deleteById(id);
    }

    @Override
    public Optional<Pelicula> read(Long id) {
        return peliculaRepository.findById(id);
    }

    @Override
    public List<Pelicula> readAll() {
        return peliculaRepository.findAll();
    }
}

