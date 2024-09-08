package pe.edu.upeu.practica0709.DaoImpl;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.practica0709.Dao.RolDao;
import pe.edu.upeu.practica0709.Repository.RolRepository;
import pe.edu.upeu.practica0709.entity.Rol;



@Component
public class RolDaoImpl implements RolDao {

	@Autowired
	private RolRepository rolRepository;
	
	@Override
	public Rol create(Rol r) {
		// TODO Auto-generated method stub
		return rolRepository.save(r);
	}

	@Override
	public Rol update(Rol r) {
		// TODO Auto-generated method stub
		return rolRepository.save(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolRepository.deleteById(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return rolRepository.findById(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rolRepository.findAll();
	}

}

