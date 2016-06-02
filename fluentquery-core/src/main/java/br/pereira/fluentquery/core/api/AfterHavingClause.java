package br.pereira.fluentquery.core.api;

public interface AfterHavingClause<T> {
	
	public AfterHavingComparison greaterThan(T value);

}
