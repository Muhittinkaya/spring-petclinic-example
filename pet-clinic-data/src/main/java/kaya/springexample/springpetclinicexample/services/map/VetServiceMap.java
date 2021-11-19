package kaya.springexample.springpetclinicexample.services.map;

import kaya.springexample.springpetclinicexample.model.Vet;
import kaya.springexample.springpetclinicexample.services.CrudService;
import kaya.springexample.springpetclinicexample.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.finById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
