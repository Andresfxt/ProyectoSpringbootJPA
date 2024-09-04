package proyecto_apirest_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto_apirest_jpa.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long>
{

}
