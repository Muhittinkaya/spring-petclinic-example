package kaya.springexample.springpetclinicexample.bootstrap;

import kaya.springexample.springpetclinicexample.model.Owner;
import kaya.springexample.springpetclinicexample.model.Vet;
import kaya.springexample.springpetclinicexample.services.OwnerService;
import kaya.springexample.springpetclinicexample.services.VetService;
import kaya.springexample.springpetclinicexample.services.map.OwnerServiceMap;
import kaya.springexample.springpetclinicexample.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Barrack");
        owner1.setLastName("Obama");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Bill");
        owner1.setLastName("Clinton");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Donald");
        vet1.setLastName("Trump");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("George");
        vet1.setLastName("Bush");

        vetService.save(vet2);

        System.out.println("Loaded vets...");


    }
}
