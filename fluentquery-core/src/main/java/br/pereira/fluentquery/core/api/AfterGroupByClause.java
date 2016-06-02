package br.pereira.fluentquery.core.api;

public interface AfterGroupByClause extends Query, AfterHavingComparison {
	
	public <T> AfterHavingClause<T> having(Aggregation<T> function);

}
