package br.pereira.fluentquery.core;

import java.util.Collection;

import br.pereira.fluentquery.core.api.AfterFromClause;
import br.pereira.fluentquery.core.api.AggregateFunctions;
import br.pereira.fluentquery.core.api.Aggregation;
import br.pereira.fluentquery.core.api.SelectStatement;

public class Repository implements SelectStatement, AggregateFunctions {
	
	public final AfterFromClause select(Object...clauses) {
		return null;
	}

	public <T> T from(Class<T> entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T join(Collection<T> oneToManyRelationship) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Aggregation<Integer> count(Object property) {
		// TODO Auto-generated method stub
		return null;
	}

}
