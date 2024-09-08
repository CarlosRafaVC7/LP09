package pe.edu.upeu.practica0709.ServiceImpl;

import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.practica0709.Dao.EmpleadoDao;
import pe.edu.upeu.practica0709.Service.EmpleadoService;
import pe.edu.upeu.practica0709.entity.Empleado;


@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDao dao;
	
	@Override
	public Empleado create(Empleado e) {
		// TODO Auto-generated method stub
		return dao.create(e);
	}

	@Override
	public Empleado update(Empleado e) {
		// TODO Auto-generated method stub
		return dao.update(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Empleado> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}