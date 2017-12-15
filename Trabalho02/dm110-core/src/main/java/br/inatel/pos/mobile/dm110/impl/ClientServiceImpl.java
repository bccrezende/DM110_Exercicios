package br.inatel.pos.mobile.dm110.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.pos.mobile.dm110.api.ClientService;
import br.inatel.pos.mobile.dm110.interfaces.ClientRemote;

@RequestScoped
public class ClientServiceImpl implements ClientService{
	
	@EJB(lookup = "java:app/dm110-ejb-1.0.0-SNAPSHOT/ClientBean!br.inatel.pos.mobile.dm110.interfaces.ClientRemote")
	private ClientRemote clientBean;

	@Override
	public void addNewClient(String clientName) {
		clientBean.addNewClient(clientName, clientName);
		
	}

	@Override
	public String[] listClientNames() {
		return clientBean.listClientNames();
	}

}
