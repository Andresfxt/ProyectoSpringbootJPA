package proyecto_apirest_jpa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import proyecto_apirest_jpa.dto.ClienteDto;
import proyecto_apirest_jpa.model.Cliente;
import proyecto_apirest_jpa.model.Usuario;
import proyecto_apirest_jpa.service.ClienteService;
import proyecto_apirest_jpa.service.UsuarioTestService;

@RestController
public class ClienteController
{
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private UsuarioTestService usuarioTestService;

    @PostMapping("/api/createCliente")
    public Cliente createCliente(@RequestBody ClienteDto clienteDTO)
    {
        if (clienteDTO == null) {
            throw new IllegalArgumentException("ClienteDTO no puede ser nulo");
        }

        if (clienteDTO.getUsuario() == null) {
            throw new IllegalArgumentException("UsuarioDTO dentro de ClienteDTO no puede ser nulo");
        }

        Usuario usuarioDTO = clienteDTO.getUsuario();
        Usuario usuario = new Usuario();

        // Verificar que email y password no sean nulos
        if (usuarioDTO.getEmail() == null || usuarioDTO.getPassword() == null) {
            throw new IllegalArgumentException("Email o Password no pueden ser nulos");
        }

        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setPassword(usuarioDTO.getPassword());
        usuario = usuarioTestService.saveUsuario(usuario);

        // Luego, crear un Cliente asociado al Usuario
        Cliente cliente = new Cliente();
        cliente.setNombres(clienteDTO.getNombres());
        cliente.setPrimerApellido(clienteDTO.getPrimerApellido());
        cliente.setSegundoApellido(clienteDTO.getSegundoApellido());
        cliente.setNroDocumento(clienteDTO.getNroDocumento());
        cliente.setTelefono(clienteDTO.getTelefono());
        cliente.setUsuario(usuario);

        return clienteService.saveCliente(cliente);
    }



}
