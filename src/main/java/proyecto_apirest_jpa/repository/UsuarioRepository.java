package proyecto_apirest_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto_apirest_jpa.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
