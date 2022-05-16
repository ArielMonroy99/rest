package bo.edu.ucb.ingsoft.rest.delivery.dto.api;

import java.util.Objects;

public class ClientApiDto {
    private Integer clienteId;
    private String nombre;
    private String nit;
    private String telefono;

    public ClientApiDto(Integer clienteId, String nombre, String nit, String telefono) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
    }

    public ClientApiDto(){}

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientApiDto that = (ClientApiDto) o;
        return Objects.equals(clienteId, that.clienteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clienteId);
    }
}
