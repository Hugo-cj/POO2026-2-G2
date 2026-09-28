package pe.edu.upeu.lacuracao.service;

import pe.edu.upeu.lacuracao.dto.ComboBoxOption;
import pe.edu.upeu.lacuracao.model.Producto;

import java.util.List;

public interface IProductoService extends ICrudGenericoService<Producto, Long>{
    List<ComboBoxOption> listarTipoProducto();
}