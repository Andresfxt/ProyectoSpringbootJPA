package proyecto_apirest_jpa.dto;

import proyecto_apirest_jpa.model.Usuario;

public class ClienteDto
{
    private Long  idCliente;
    private String nombres;
    private String primerApellido;
    private String segundoApellido;
    private String nroDocumento;
    private String telefono;

    private Usuario usuario;

    public ClienteDto() {
    }

    public ClienteDto(Long idCliente, String nombres, String primerApellido, String segundoApellido, String nroDocumento, String telefono, Usuario usuario) {
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
