package proyecto_apirest_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto_apirest_jpa.dto.ClienteDto;
import proyecto_apirest_jpa.model.Cliente;
import proyecto_apirest_jpa.model.Usuario;
import proyecto_apirest_jpa.service.ClienteService;
import proyecto_apirest_jpa.service.UsuarioService;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController
{
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private UsuarioService usuarioService;

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
        usuario = usuarioService.saveUsuario(usuario);

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

    @GetMapping("/api/getclientes")
    public List<Cliente> getAllClientes(){
        return clienteService.getAllClientes();
    }

    @GetMapping("/api/cliente/{id}")
    public Optional<Cliente> getOneCliente(@PathVariable Long id)
    {
        return clienteService.findOneById(id);
    }

    @PutMapping("/api/clienteUpdate")
    public Cliente update(@RequestBody ClienteDto clienteDTO)
    {
        Usuario usuarioDTO = clienteDTO.getUsuario();
        //Usuario usuario = new Usuario();
        Optional<Cliente> optionalCliente=clienteService.findOneById(clienteDTO.getIdCliente());
        Optional<Usuario> optionalUsuario=usuarioService.findOneById(clienteDTO.getIdCliente());
        Cliente cliente = optionalCliente.get();
        Usuario usuario=optionalUsuario.get();
        cliente.setNombres(clienteDTO.getNombres());
        cliente.setPrimerApellido(clienteDTO.getPrimerApellido());
        cliente.setSegundoApellido(clienteDTO.getSegundoApellido());
        cliente.setNroDocumento(clienteDTO.getNroDocumento());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setPassword(usuarioDTO.getPassword());
        cliente.setUsuario(usuario);




        return clienteService.saveCliente(cliente);
    }

    @DeleteMapping("/api/cliente/{id}")
    public void delete(@PathVariable Long id)
    {
        clienteService.deleteById(id);
    }





}
