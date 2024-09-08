package pe.edu.upeu.practica0709.Service;
import java.util.List;



import java.util.Optional;

import pe.edu.upeu.practica0709.entity.Renta;
public interface RentaService {
    Renta create(Renta r);
    Renta update(Renta r);
    void delete(Long id);
    Optional<Renta> read(Long id);
    List<Renta> readAll();
}

