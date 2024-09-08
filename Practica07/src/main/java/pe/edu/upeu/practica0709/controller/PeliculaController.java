package pe.edu.upeu.practica0709.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.practica0709.Service.PeliculaService;
import pe.edu.upeu.practica0709.entity.Pelicula;

@RestController
@RequestMapping("peliculas")
public class PeliculaController {
	@Autowired
	private PeliculaService peliculaService;

	@GetMapping
	public ResponseEntity<List<Pelicula>> readAll() {
	    try {
	        List<Pelicula> peliculas = peliculaService.readAll();
	        if (peliculas.isEmpty()) {
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        }
	        return new ResponseEntity<>(peliculas, HttpStatus.OK);
	    } catch (Exception e) {
	        // TODO: handle exception
	        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@PostMapping
	public ResponseEntity<Pelicula> crear(@Valid @RequestBody Pelicula pelicula) {
	    try {
	        Pelicula c = peliculaService.create(pelicula);
	        return new ResponseEntity<>(c, HttpStatus.CREATED);
	    } catch (Exception e) {
	        // TODO: handle exception
	        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pelicula> getPeliculaById(@PathVariable("id") Long id) {
	    try {
	        Pelicula c = peliculaService.read(id).get();
	        return new ResponseEntity<>(c, HttpStatus.CREATED);
	    } catch (Exception e) {
	        // TODO: handle exception
	        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Pelicula> delPelicula(@PathVariable("id") Long id) {
	    try {
	        peliculaService.delete(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    } catch (Exception e) {
	        // TODO: handle exception
	        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updatePelicula(@PathVariable("id") Long id, @Valid @RequestBody Pelicula pelicula) {
	    Optional<Pelicula> c = peliculaService.read(id);
	    if (c.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    } else {
	        Pelicula updatedPelicula = peliculaService.update(pelicula);
	        return new ResponseEntity<>(updatedPelicula, HttpStatus.OK);
	    }
	}

}
