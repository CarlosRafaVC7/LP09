package pe.edu.upeu.practica0709.Service;

import java.util.List;



import java.util.Optional;

import pe.edu.upeu.practica0709.entity.Usuario;

public interface UsuarioService {
	Usuario create(Usuario u);
	Usuario update(Usuario u);
	void delete(Long id);
	Optional<Usuario> read(Long id);
	List<Usuario> readAll();
}
