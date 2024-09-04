package proyecto_apirest_jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto_apirest_jpa.model.Usuario;
import proyecto_apirest_jpa.repository.UsuarioRepository;

@Service
public class UsuarioTestService
{
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario saveUsuario(Usuario usuario )
    {
        return usuarioRepository.save(usuario);
    }
}
