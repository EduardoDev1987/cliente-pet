package br.com.petz.cliente_ptez.cliente.application.repository;

import java.util.List;

import br.com.petz.cliente_ptez.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();

}
