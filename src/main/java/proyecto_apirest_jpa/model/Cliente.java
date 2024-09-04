package proyecto_apirest_jpa.model;

import jakarta.persistence.*;


@Entity
@Table(name = "clientes")
public class Cliente
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente")
    private Long idCliente;

    private String nombres;
    @Column(name="primer_apellido")
    private String primerApellido;
    @Column(name="segundo_apellido")
    private String segundoApellido;
    @Column(name="nro_documento")
    private String nroDocumento;
    private String telefono;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    private Usuario usuario;

    public Cliente() {

    }

    public Cliente(Long idCliente, String nombres, String primerApellido, String segundoApellido, String nroDocumento, String telefono, Usuario usuario) {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nroDocumento = nroDocumento;
        this.telefono = telefono;
        this.usuario = usuario;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
