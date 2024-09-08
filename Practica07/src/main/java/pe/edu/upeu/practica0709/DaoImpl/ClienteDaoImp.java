package pe.edu.upeu.practica0709.DaoImpl;
import java.util.List;




import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.practica0709.Dao.ClienteDao;
import pe.edu.upeu.practica0709.Repository.ClienteRepository;
import pe.edu.upeu.practica0709.entity.Cliente;
@Component

public class ClienteDaoImp implements ClienteDao {

    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public Cliente create(Cliente c) {
        return clienteRepository.save(c);
    }

    @Override
    public Cliente update(Cliente c) {
        return clienteRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Optional<Cliente> read(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> readAll() {
        return clienteRepository.findAll();
    }
}

