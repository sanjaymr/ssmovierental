package org.ss.projects.movierental.service;

import java.util.List;

public interface GenericDAO<E, K> {
	void add(E entity);

	void update(E entity);

	void remove(E entity);

	List<E> list();

	E find(K key);

}
