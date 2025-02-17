package pe.edu.upeu.practica0709.ServiceImpl;
import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.practica0709.Dao.RolDao;
import pe.edu.upeu.practica0709.Service.RolService;
import pe.edu.upeu.practica0709.entity.Rol;

@Service
public class RolServiceImpl implements RolService {

	@Autowired
	private RolDao dao;
	
	@Override
	public Rol create(Rol r) {
		// TODO Auto-generated method stub
		return dao.create(r);
	}

	@Override
	public Rol update(Rol r) {
		// TODO Auto-generated method stub
		return dao.update(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
