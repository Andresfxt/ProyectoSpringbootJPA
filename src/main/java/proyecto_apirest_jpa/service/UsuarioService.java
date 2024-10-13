package proyecto_apirest_jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import proyecto_apirest_jpa.model.Reserva;
import proyecto_apirest_jpa.model.Usuario;
import proyecto_apirest_jpa.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService
{
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario saveUsuario(Usuario usuario )
    {
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> getAllReservas()
    {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findOneById(@PathVariable Long id)
    {
        return usuarioRepository.findById(id);
    }


    public Usuario findById(Long id)
    {
        return usuarioRepository.findById(id).orElse(null); // Devuelve null si no se encuentra
    }
    public boolean authenticate(String username, String password)
    {
        Usuario user = usuarioRepository.findByEmail(username);
        return user != null && user.getPassword().equals(password);
    }
}
