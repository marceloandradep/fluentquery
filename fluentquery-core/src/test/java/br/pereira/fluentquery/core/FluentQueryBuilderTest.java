package br.pereira.fluentquery.core;

import br.pereira.fluentquery.test.domain.Person;

public class FluentQueryBuilderTest extends Repository {
	
	/**
	A select statement is a string which consists of the following clauses:
		- a SELECT clause, which determines the type of the objects or values to be selected;
		- a FROM clause, which provides declarations that designate the domain to which the expressions specified in the other clauses of the query apply;
		- an optional WHERE clause, which may be used to restrict the results that are returned by the query;
		- an optional GROUP BY clause, which allows query results to be aggregated in terms of groups;
		- an optional HAVING clause, which allows filtering over aggregated groups;
		- an optional ORDER BY clause, which may be used to order the results that are returned by the query.
		
	In BNF syntax, a select statement is defined as:
		select_statement ::= select_clause from_clause [where_clause] [groupby_clause] [having_clause] [orderby_clause]

	A select statement must always have a SELECT and a FROM clause. The square brackets [] indicate that the other clauses are optional.
	*/
	public void complete_select_statement() {
		Person p;
		
		String jpql = select(p = from(Person.class))
			.where(p.getName()).equalsTo("Bob")
			.groupBy(p.getName())
			.having(count(p)).greaterThan(1)
			.orderBy(p.getSalary())
			.jpql(p);
	}
	
	public void select_statement_with_from() {
		Person p;
		
		String jpql = select(p = from(Person.class))
				.jpql(p);
	}
	
	public void select_statement_with_from_and_where() {
		Person p;
		
		String jpql = select(p = from(Person.class))
				.where(p.getName()).equalsTo("Bob")
				.jpql(p);
	}
	
	public void select_statement_with_from_and_group_by() {
		Person p;
		
		String jpql = select(p = from(Person.class))
				.groupBy(p.getName())
				.jpql(p);
	}
	
	public void select_statement_with_from_and_order_by() {
		Person p;
		
		String jpql = select(p = from(Person.class))
				.orderBy(p.getName())
				.jpql(p);
	}
	
	public void select_statement_with_from_where_and_group_by() {
		Person p;
		
		String jpql = select(p = from(Person.class))
				.where(p.getName()).equalsTo("Bob")
				.groupBy(p.getName())
				.jpql(p);
	}
	
	public void select_statement_with_from_where_group_by_and_having() {
		Person p;
		
		String jpql = select(p = from(Person.class))
				.where(p.getName()).equalsTo("Bob")
				.groupBy(p.getName()).having(count(p)).greaterThan(1)
				.jpql(p);
	}
	
	public void select_statement_with_from_where_and_order_by() {
		Person p;
		
		String jpql = select(p = from(Person.class))
				.where(p.getName()).equalsTo("Bob")
				.orderBy(p.getName())
				.jpql(p);
	}
	
	public void select_statement_with_from_group_by_and_order_by() {
		Person p;
		
		String jpql = select(p = from(Person.class))
				.groupBy(p.getClass())
				.orderBy(p.getName())
				.jpql(p);
	}
	
	public void select_statement_with_from_group_by_having_and_order_by() {
		Person p;
		
		String jpql = select(p = from(Person.class))
				.groupBy(p.getClass()).having(count(p)).greaterThan(1)
				.orderBy(p.getName())
				.jpql(p);
	}
	
	/**
	The FROM clause of a query defines the domain of the query by declaring identification variables. 
	An identification variable is an identifier declared in the FROM clause of a query. 
	The domain of the query may be constrained by path expressions. 
	Identification variables designate instances of a particular entity abstract schema type. 
	The FROM clause can contain multiple identification variable declarations separated by a comma (,).
		- from_clause ::= FROM identification_variable_declaration {, {identification_variable_declaration | collection_member_declaration}}*
		- identification_variable_declaration ::= range_variable_declaration { join | fetch_join }*
		- range_variable_declaration ::= abstract_schema_name [AS] identification_variable
		- join ::= join_spec join_association_path_expression [AS] identification_variable
		- fetch_join ::= join_spec FETCH join_association_path_expression
		- join_association_path_expression ::= join_collection_valued_path_expression | join_single_valued_association_path_expression
		- join_spec ::= [ LEFT [OUTER] | INNER ] JOIN
		- collection_member_declaration ::= IN (collection_valued_path_expression) [AS] identification_variable
	*/
	public void from_clause_with_one_identification_variable_declaration() {
		
	}

}
