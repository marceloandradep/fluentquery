package br.pereira.fluentquery.samples.repository;

import java.util.List;

import br.pereira.fluentquery.core.Repository;
import br.pereira.fluentquery.core.api.Query;
import br.pereira.fluentquery.samples.domain.Person;
import br.pereira.fluentquery.samples.domain.Role;

public class PeopleRepository extends Repository {
	
	public List<Person> getPeopleByRole(Role role) {
		Person p; 
		Role r;
		
		Query query = select(p = from(Person.class), r = join(p.getRoles())).where(r).equalsTo(role);
		return query.list(p);
	}
	
}
