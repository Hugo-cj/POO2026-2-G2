package pe.edu.upeu.lacuracao.repository;

import pe.edu.upeu.lacuracao.model.Categoria;

public class CategoriaRepository extends AbstractJpaRepository<Categoria, Long> {
    private long sequence = 1;

    @Override
    protected Long getId(Categoria entity) {
        return entity.getIdCategoria();
    }

    @Override
    protected void setId(Categoria entity, Long id) {
        entity.setIdCategoria(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }

    public void seedData() {
        if (findAll().isEmpty()) {
            save(new Categoria(generateId(), "Lavado"));
            save(new Categoria(generateId(), "Refrigeracion"));
            save(new Categoria(generateId(), "Cocina"));
        }
    }
}