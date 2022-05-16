package bo.edu.ucb.ingsoft.rest.delivery.dto.db;

import java.util.Date;
import java.util.Objects;

public class ClientDbDto {
    private Integer clientId;
    private String nombre;
    private String nit;
    private String telefono;
    private Integer status;
    private Integer txId;
    private String txHost;
    private Date txDate;

    public ClientDbDto()
    {}

    public ClientDbDto(Integer clientId, String nombre, String nit, String telefono, Integer status, Integer txId, String txHost, Date txDate) {
        this.clientId = clientId;
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
        this.status = status;
        this.txId = txId;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTxId() {
        return txId;
    }

    public void setTxId(Integer txId) {
        this.txId = txId;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientDbDto that = (ClientDbDto) o;
        return Objects.equals(clientId, that.clientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId);
    }
}