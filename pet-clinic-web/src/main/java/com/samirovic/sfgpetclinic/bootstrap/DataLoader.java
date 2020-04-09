package com.samirovic.sfgpetclinic.bootstrap;

import com.samirovic.sfgpetclinic.model.Owner;
import com.samirovic.sfgpetclinic.model.Vet;
import com.samirovic.sfgpetclinic.services.OwnerService;
import com.samirovic.sfgpetclinic.services.VetService;
import com.samirovic.sfgpetclinic.services.map.OwnerMapService;
import com.samirovic.sfgpetclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerMapService();
        this.vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);
    }
}
