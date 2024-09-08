package pe.edu.upeu.practica0709.Dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.practica0709.entity.Pelicula;

public interface PeliculaDao {
	 Pelicula create(Pelicula p);
	    Pelicula update(Pelicula p);
	    void delete(Long id);
	    Optional<Pelicula> read(Long id);
	    List<Pelicula> readAll();
}
