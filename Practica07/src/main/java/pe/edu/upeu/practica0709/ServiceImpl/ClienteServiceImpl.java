package pe.edu.upeu.practica0709.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.practica0709.Dao.ClienteDao;
import pe.edu.upeu.practica0709.Service.ClienteService;
import pe.edu.upeu.practica0709.entity.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    public Cliente create(Cliente c) {
        return clienteDao.create(c);
    }

    @Override
    public Cliente update(Cliente c) {
        return clienteDao.update(c);
    }

    @Override
    public void delete(Long id) {
        clienteDao.delete(id);
    }

    @Override
    public Optional<Cliente> read(Long id) {
        return clienteDao.read(id);
    }

    @Override
    public List<Cliente> readAll() {
        return clienteDao.readAll();
    }
}

