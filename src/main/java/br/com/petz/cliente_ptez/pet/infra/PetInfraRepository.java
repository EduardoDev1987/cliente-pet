package br.com.petz.cliente_ptez.pet.infra;

import org.springframework.stereotype.Repository;

import br.com.petz.cliente_ptez.pet.application.service.PetRepository;
import br.com.petz.cliente_ptez.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PetInfraRepository implements PetRepository {
	private final PetSpringDataJPARepository petSpringDataJPARepository; 
	
	@Override
	public Pet salvaPet(Pet pet) {
    log.info("[inicia] PetInfraRepository - SalvaPet");
    petSpringDataJPARepository.save(pet);
    log.info("[finaliza] PetInfraRepository - SalvaPet");
	return pet;
	}

}
