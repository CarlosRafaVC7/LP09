package pe.edu.upeu.practica0709.Service;
import java.util.List;



import java.util.Optional;

import pe.edu.upeu.practica0709.entity.Cliente;
public interface ClienteService {
    Cliente create(Cliente c);
    Cliente update(Cliente c);
    void delete(Long id);
    Optional<Cliente> read(Long id);
    List<Cliente> readAll();
}

