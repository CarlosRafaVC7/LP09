package pe.edu.upeu.practica0709.DaoImpl;
import java.util.List;




import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.practica0709.Dao.AccesoDao;
import pe.edu.upeu.practica0709.Repository.AccesoRepository;
import pe.edu.upeu.practica0709.entity.Acceso;
@Component

public class AccesoDaoImp implements AccesoDao {

    @Autowired
    private AccesoRepository accesoRepository;
    
    @Override
    public Acceso create(Acceso a) {
        return accesoRepository.save(a);
    }

    @Override
    public Acceso update(Acceso a) {
        return accesoRepository.save(a);
    }

    @Override
    public void delete(Long id) {
        accesoRepository.deleteById(id);
    }

    @Override
    public Optional<Acceso> read(Long id) {
        return accesoRepository.findById(id);
    }

    @Override
    public List<Acceso> readAll() {
        return accesoRepository.findAll();
    }
}

