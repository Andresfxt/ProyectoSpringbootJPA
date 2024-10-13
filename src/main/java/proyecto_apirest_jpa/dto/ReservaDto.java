package proyecto_apirest_jpa.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservaDto
{
    private Long  idReserva;
    private LocalDate fecha;
    private String hora;
    private Long servicioId;
    private PersonaDto persona;

    public ReservaDto()
    {
    }

    public ReservaDto(Long idReserva, LocalDate fecha, String hora, Long servicioId, PersonaDto persona) {
        this.idReserva = idReserva;
        this.fecha = fecha;
        this.hora = hora;
        this.servicioId = servicioId;
        this.persona = persona;
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Long getServicioId() {
        return servicioId;
    }

    public void setServicioId(Long servicioId) {
        this.servicioId = servicioId;
    }

    public PersonaDto getPersona() {
        return persona;
    }

    public void setPersona(PersonaDto persona) {
        this.persona = persona;
    }
}
