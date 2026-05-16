package br.com.sistema.model;

import java.io.Serializable;
import java.util.Objects;

public class ClientesId implements Serializable {
    private Double cdCliente;
    private Double cdFilial;

    public ClientesId() {}

    public ClientesId(Double cdCliente, Double cdFilial) {
        this.cdCliente = cdCliente;
        this.cdFilial = cdFilial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientesId)) return false;
        ClientesId that = (ClientesId) o;
        return Objects.equals(cdCliente, that.cdCliente) &&
               Objects.equals(cdFilial, that.cdFilial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdCliente, cdFilial);
    }
}
