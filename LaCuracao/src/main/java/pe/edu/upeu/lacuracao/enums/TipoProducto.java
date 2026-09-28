package pe.edu.upeu.lacuracao.enums;

import lombok.Getter;

@Getter
public enum TipoProducto {
    LAVADO8("Lavado"),
    REFRIGERACION("Refrigeracion"),
    COCINA("Cocina");


    String descripcion;
    TipoProducto(String descripcion){
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
