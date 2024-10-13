package proyecto_apirest_jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import proyecto_apirest_jpa.model.Reserva;
import proyecto_apirest_jpa.repository.ReservaRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ReservaService
{
    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva saveReserva(Reserva reserva)
    {
        return reservaRepository.save(reserva);
    }

    public List<Reserva> getAllReservas()
    {
        return reservaRepository.findAll();
    }

    public Optional<Reserva> findOneById(@PathVariable Long id)
    {
         return reservaRepository.findById(id);
    }

    public void deleteById(Long id)
    {
       reservaRepository.deleteById(id);
    }
}
