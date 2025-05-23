package br.com.petz.cliente_ptez.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.petz.cliente_ptez.cliente.application.api.ClienteDetalhadoResponse;
import br.com.petz.cliente_ptez.cliente.application.api.ClienteListResponse;
import br.com.petz.cliente_ptez.cliente.application.api.ClienteRequest;
import br.com.petz.cliente_ptez.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);

	
}
