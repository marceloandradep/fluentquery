package br.pereira.fluentquery.core.api;

public interface AfterWhereComparison extends Query, AfterHavingComparison {
	
	public AfterGroupByClause groupBy(Object property);

}
