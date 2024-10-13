package proyecto_apirest_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto_apirest_jpa.model.Servicio;

public interface ServicioRepository extends JpaRepository<Servicio,Long>
{
}
