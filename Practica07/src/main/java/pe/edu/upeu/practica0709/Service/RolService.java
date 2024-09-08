package pe.edu.upeu.practica0709.Service;

import java.util.List;



import java.util.Optional;

import pe.edu.upeu.practica0709.entity.Rol;

public interface RolService {
	Rol create(Rol r);
	Rol update(Rol r);
	void delete(Long id);
	Optional<Rol> read(Long id);
	List<Rol> readAll();
}

