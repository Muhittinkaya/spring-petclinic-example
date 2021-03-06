package kaya.springexample.springpetclinicexample.bootstrap;

import kaya.springexample.springpetclinicexample.model.Owner;
import kaya.springexample.springpetclinicexample.model.Vet;
import kaya.springexample.springpetclinicexample.services.OwnerService;
import kaya.springexample.springpetclinicexample.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Barrack");
        owner1.setLastName("Obama");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Bill");
        owner2.setLastName("Clinton");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Donald");
        vet1.setLastName("Trump");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("George");
        vet2.setLastName("Bush");

        vetService.save(vet2);

        System.out.println("Loaded vets...");


    }
}
