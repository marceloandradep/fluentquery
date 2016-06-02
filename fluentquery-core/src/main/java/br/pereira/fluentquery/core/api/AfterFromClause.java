package br.pereira.fluentquery.core.api;

public interface AfterFromClause extends Query, AfterWhereComparison, AfterHavingComparison {
	
	public <T> AfterWhereClause<T> where(T obj);

}
