package pe.edu.upeu.practica0709.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.practica0709.Dao.RentaDao;
import pe.edu.upeu.practica0709.Service.RentaService;
import pe.edu.upeu.practica0709.entity.Renta;

@Service
public class RentaServiceImpl implements RentaService {

    @Autowired
    private RentaDao rentaDao;

    @Override
    public Renta create(Renta r) {
        return rentaDao.create(r);
    }

    @Override
    public Renta update(Renta r) {
        return rentaDao.update(r);
    }

    @Override
    public void delete(Long id) {
        rentaDao.delete(id);
    }

    @Override
    public Optional<Renta> read(Long id) {
        return rentaDao.read(id);
    }

    @Override
    public List<Renta> readAll() {
        return rentaDao.readAll();
    }
}

