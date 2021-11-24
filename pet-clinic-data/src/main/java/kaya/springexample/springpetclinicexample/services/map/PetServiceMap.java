package kaya.springexample.springpetclinicexample.services.map;

import kaya.springexample.springpetclinicexample.model.Pet;
import kaya.springexample.springpetclinicexample.services.PetService;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.finById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
