package com.springbatch.enviopromocoesemail.dominio;

public class InteresseProdutoCliente {
	// atributos
	private Cliente cliente;
	private Produto produto;
	
	// getters and setters
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}