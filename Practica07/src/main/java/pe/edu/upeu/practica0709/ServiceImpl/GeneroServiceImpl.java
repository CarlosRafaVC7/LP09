package pe.edu.upeu.practica0709.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.practica0709.Dao.GeneroDao;
import pe.edu.upeu.practica0709.Service.GeneroService;
import pe.edu.upeu.practica0709.entity.Genero;

@Service
public class GeneroServiceImpl implements GeneroService {

    @Autowired
    private GeneroDao generoDao;

    @Override
    public Genero create(Genero g) {
        return generoDao.create(g);
    }

    @Override
    public Genero update(Genero g) {
        return generoDao.update(g);
    }

    @Override
    public void delete(Long id) {
        generoDao.delete(id);
    }

    @Override
    public Optional<Genero> read(Long id) {
        return generoDao.read(id);
    }

    @Override
    public List<Genero> readAll() {
        return generoDao.readAll();
    }
}

