package proyecto_apirest_jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import proyecto_apirest_jpa.model.Cliente;
import proyecto_apirest_jpa.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService
{
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente)
    {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> getAllClientes()
    {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findOneById(@PathVariable Long id)
    {
        return clienteRepository.findById(id);
    }

    public void deleteById(Long id)
    {
        clienteRepository.deleteById(id);
    }


}
