package pe.edu.upeu.practica0709.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.practica0709.Dao.AccesoDao;
import pe.edu.upeu.practica0709.Service.AccesoService;
import pe.edu.upeu.practica0709.entity.Acceso;

@Service
public class AccesoServiceImpl implements AccesoService {

    @Autowired
    private AccesoDao accesoDao;

    @Override
    public Acceso create(Acceso a) {
        return accesoDao.create(a);
    }

    @Override
    public Acceso update(Acceso a) {
        return accesoDao.update(a);
    }

    @Override
    public void delete(Long id) {
        accesoDao.delete(id);
    }

    @Override
    public Optional<Acceso> read(Long id) {
        return accesoDao.read(id);
    }

    @Override
    public List<Acceso> readAll() {
        return accesoDao.readAll();
    }
}

