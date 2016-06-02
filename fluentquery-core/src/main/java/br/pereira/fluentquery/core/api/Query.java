package br.pereira.fluentquery.core.api;

import java.util.List;

public interface Query {
	
	public <T> List<T> list(T variable);

	public String jpql(Object variable);
	
}
