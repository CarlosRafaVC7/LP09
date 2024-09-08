package pe.edu.upeu.practica0709.Repository;



import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import pe.edu.upeu.practica0709.entity.Rol;
@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{

}