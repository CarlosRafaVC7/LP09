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
import pe.edu.upeu.practica0709.Service.RentaService;
import pe.edu.upeu.practica0709.entity.Renta;

@RestController
@RequestMapping("rentas")
public class RentaController {
	@Autowired
	private RentaService rentaService;

	@GetMapping
	public ResponseEntity<List<Renta>> readAll(){
	    try {
	        List<Renta> Empleados = rentaService.readAll();
	        if(Empleados.isEmpty()) {
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        }
	        return new ResponseEntity<>(Empleados, HttpStatus.OK);
	    } catch (Exception e) {
	        // TODO: handle exception
	        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@PostMapping
	public ResponseEntity<Renta> crear(@Valid @RequestBody Renta emp){
	    try {
	        Renta c = rentaService.create(emp);
	        return new ResponseEntity<>(c, HttpStatus.CREATED);
	    } catch (Exception e) {
	        // TODO: handle exception
	        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@GetMapping("/{id}")
	public ResponseEntity<Renta> getRentaId(@PathVariable("id") Long id){
	    try {
	        Renta c = rentaService.read(id).get();
	        return new ResponseEntity<>(c, HttpStatus.CREATED);
	    } catch (Exception e) {
	        // TODO: handle exception
	        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Renta> delRenta(@PathVariable("id") Long id){
	    try {
	        rentaService.delete(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    } catch (Exception e) {
	        // TODO: handle exception
	        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateRenta(@PathVariable("id") Long id, @Valid @RequestBody Renta emp){

	    Optional<Renta> c = rentaService.read(id);
	    if (c.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    } else {
	        Renta updatedEmpleado = rentaService.update(emp);
	        return new ResponseEntity<>(updatedEmpleado, HttpStatus.OK);
	    }        
	}

}
