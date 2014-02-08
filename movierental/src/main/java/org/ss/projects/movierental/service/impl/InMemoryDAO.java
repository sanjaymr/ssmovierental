package org.ss.projects.movierental.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.ss.projects.movierental.service.GenericDAO;

public class InMemoryDAO<E, K> implements GenericDAO<E, K> {

	List<E> entities = new ArrayList<E>();

	@Override
	public void add(E entity) {
		entities.add(entity);
	}

	@Override
	public void update(E entity) {
		throw new UnsupportedOperationException(
				"Update not supported in dummy in memory impl");
	}

	@Override
	public void remove(E entity) {
		entities.remove(entity);
	}

	@Override
	public List<E> list() {
		return entities;
	}

	@Override
	public E find(K key) {
		if (entities.isEmpty()) {
			return null;
		}
		return entities.get(0);
	}

}
