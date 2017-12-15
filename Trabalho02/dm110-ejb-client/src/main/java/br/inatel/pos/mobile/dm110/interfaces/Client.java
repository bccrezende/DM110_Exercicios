package br.inatel.pos.mobile.dm110.interfaces;

public interface Client {
	void addNewClient(String clientName, String clientEmail);
	String[] listClientNames();
	
}
