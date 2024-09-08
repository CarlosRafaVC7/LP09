package pe.edu.upeu.practica0709.Dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.practica0709.entity.Acceso;

public interface AccesoDao {
	Acceso create(Acceso a);
    Acceso update(Acceso a);
    void delete(Long id);
    Optional<Acceso> read(Long id);
    List<Acceso> readAll();
}
