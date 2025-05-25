package br.com.petz.cliente_ptez.pet.application.service;

import java.util.List;
import java.util.UUID;

import br.com.petz.cliente_ptez.pet.domain.Pet;

public interface PetRepository {
	Pet salvaPet(Pet pet);
	List<Pet> buscaPetsDoClienteComId(UUID idCliente);
	Pet buscaPetPeloId(UUID idPet);


}
