package proyecto_apirest_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto_apirest_jpa.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva,Long>
{
}
