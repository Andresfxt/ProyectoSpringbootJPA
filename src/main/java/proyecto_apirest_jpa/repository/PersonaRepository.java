package proyecto_apirest_jpa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import proyecto_apirest_jpa.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona,Long>
{

}
