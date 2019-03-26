package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublicaEstoqueWS {
	public static void main(String[] args) {
		EstoqueWS implementacaoWS = new EstoqueWS();
		String URL = "http://localhost:8085/estoquews";

		System.out.println("EstoqueWS rodando: " + URL);
		//http://localhost:8085/estoquews?wsdl
		// associando URL com a implementacao
		Endpoint.publish(URL, implementacaoWS);

	}
}
