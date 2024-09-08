package pe.edu.upeu.practica0709.DaoImpl;
import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.practica0709.Dao.RentaDao;
import pe.edu.upeu.practica0709.Repository.RentaRepository;
import pe.edu.upeu.practica0709.entity.Renta;
@Component

public class RentaDaoImp implements RentaDao {

    @Autowired
    private RentaRepository rentaRepository;
    
    @Override
    public Renta create(Renta r) {
        return rentaRepository.save(r);
    }

    @Override
    public Renta update(Renta r) {
        return rentaRepository.save(r);
    }

    @Override
    public void delete(Long id) {
        rentaRepository.deleteById(id);
    }

    @Override
    public Optional<Renta> read(Long id) {
        return rentaRepository.findById(id);
    }

    @Override
    public List<Renta> readAll() {
        return rentaRepository.findAll();
    }
}

