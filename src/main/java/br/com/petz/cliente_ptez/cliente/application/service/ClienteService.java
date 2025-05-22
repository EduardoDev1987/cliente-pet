package br.com.petz.cliente_ptez.cliente.application.service;

import br.com.petz.cliente_ptez.cliente.application.api.ClienteRequest;
import br.com.petz.cliente_ptez.cliente.application.api.ClienteResponse;

public interface ClienteService {
	
	ClienteResponse criaCliente(ClienteRequest clienteRequest);

	
}
