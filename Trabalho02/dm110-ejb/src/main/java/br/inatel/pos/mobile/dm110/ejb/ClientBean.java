package br.inatel.pos.mobile.dm110.ejb;

import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.pos.mobile.dm110.dao.ClientDAO;
import br.inatel.pos.mobile.dm110.entities.Client;
import br.inatel.pos.mobile.dm110.interfaces.ClientLocal;
import br.inatel.pos.mobile.dm110.interfaces.ClientRemote;


@Stateless
@Local(ClientLocal.class)
@Remote(ClientRemote.class)
public class ClientBean implements ClientLocal, ClientRemote{

	@EJB
	private ClientDAO dao;
	
	
	
	@Override
	public String[] listClientNames() {
		return dao.findAll()
				.stream()
				.map(Client::getName)
				.collect(Collectors.toList())
				.toArray(new String[0]);
	}




	@Override
	public void addNewClient(String clientName, String clientEmail) {
		Client client = new Client();
		client.setName(clientName);
		client.setEmail(clientEmail);
		dao.insert(client);
		
	}

}
