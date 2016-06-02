package br.pereira.fluentquery.core.api;

import java.util.Collection;

public interface SelectStatement {
	
	public <T> T from(Class<T> entity);
	
	public <T> T join(Collection<T> oneToManyRelationship);
	
}
