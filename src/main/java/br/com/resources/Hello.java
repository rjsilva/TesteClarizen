package br.com.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class Hello {
	
	
	@GET
	@Produces("jason")
	public String exibir(){
		
		return "url_servico_ceps=http://api-cieloti.sensedia.com/credenciamento/v1/enderecos?cep=06395510";
	}

}
