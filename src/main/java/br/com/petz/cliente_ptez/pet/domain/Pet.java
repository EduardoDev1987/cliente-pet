package br.com.petz.cliente_ptez.pet.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;


@Value
public class Pet {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name ="idPet", updatable = false, unique = true, nullable = false)
	private UUID idPet;
	@NotBlank
	private String nomePet;
	private Porte porte;
    @NotNull
    private TipoPet tipo;
	private String microchip;
	@NotBlank
	private String raca;
	@NotNull
	private SexoPet sexo;
	private String pelagemCor;
	@NotNull
	private LocalDate dataNascimento;
	private String rga;
	private Integer peso;
	
    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;
}
	
	