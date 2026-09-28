package pe.edu.upeu.lacuracao.repository;

import pe.edu.upeu.lacuracao.model.Marca;

public class MarcaRepository extends AbstractJpaRepository<Marca, Long>{
    private long sequence=1;
    @Override
    protected Long getId(Marca entity) {
        return entity.getIdMarca();
    }

    @Override
    protected void setId(Marca entity, Long id) {
        entity.setIdMarca(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }

    public void seedData() {
        if (findAll().isEmpty()) {
            save(new Marca(generateId(), "Bord"));
            save(new Marca(generateId(),"Coldex"));
            save(new Marca(generateId(),"Samsung"));
            save(new Marca(generateId(),"LG"));
            save(new Marca(generateId(),"Indurama"));
            save(new Marca(generateId(),"Mabe"));
        }
    }


}