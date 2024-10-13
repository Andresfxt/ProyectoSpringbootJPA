package proyecto_apirest_jpa.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

@Entity
@Table(name = "reservas")

public class Reserva
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_reserva")
    private Long  idReserva;





    @ManyToOne
    @JoinColumn(name = "id_servicio",referencedColumnName = "id_servicio")
    private Servicio servicio;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "hora", nullable = false)
    private String hora;


    // Relación con la tabla Persona

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")

    private Persona persona;

    public Reserva() {
    }

    public Reserva(Long idReserva, Servicio servicio, LocalDate fecha, String hora, Persona persona) {
        this.idReserva = idReserva;
        this.servicio = servicio;
        this.fecha = fecha;
        this.hora = hora;
        this.persona = persona;
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
