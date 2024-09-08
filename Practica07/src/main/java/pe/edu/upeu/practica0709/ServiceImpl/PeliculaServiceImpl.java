package pe.edu.upeu.practica0709.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.practica0709.Dao.PeliculaDao;
import pe.edu.upeu.practica0709.Service.PeliculaService;
import pe.edu.upeu.practica0709.entity.Pelicula;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    @Autowired
    private PeliculaDao peliculaDao;

    @Override
    public Pelicula create(Pelicula p) {
        return peliculaDao.create(p);
    }

    @Override
    public Pelicula update(Pelicula p) {
        return peliculaDao.update(p);
    }

    @Override
    public void delete(Long id) {
        peliculaDao.delete(id);
    }

    @Override
    public Optional<Pelicula> read(Long id) {
        return peliculaDao.read(id);
    }

    @Override
    public List<Pelicula> readAll() {
        return peliculaDao.readAll();
    }
}

