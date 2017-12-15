package br.inatel.pos.mobile.dm110.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.pos.mobile.dm110.impl.HelloServiceImpl;
import br.inatel.pos.mobile.dm110.impl.ClientServiceImpl;

@ApplicationPath("/api")
public class RestApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(HelloServiceImpl.class);
		classes.add(ClientServiceImpl.class);
		return classes;
	}

}
