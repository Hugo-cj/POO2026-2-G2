package pe.edu.upeu.lacuracao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.upeu.lacuracao.enums.TipoProducto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Producto {
    private Long idProducto;
    private String nombre;
    private TipoProducto tipoProducto;
    private Double pu;
    private Double utilidad;
    private Double stock;
    private Categoria idCategoria;
    private Marca idMarca;
    private UnidMedida idUnidad;
}
