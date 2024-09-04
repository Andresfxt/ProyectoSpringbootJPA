package proyecto_apirest_jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto_apirest_jpa.model.Cliente;
import proyecto_apirest_jpa.repository.ClienteRepository;

@Service
public class ClienteService
{
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente)
    {
        return clienteRepository.save(cliente);
    }
}
