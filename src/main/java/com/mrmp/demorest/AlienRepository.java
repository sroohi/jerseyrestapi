package com.mrmp.demorest;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {

	List<Alien> aliens;

	public AlienRepository() {

		aliens = new ArrayList<>();

		Alien a = new Alien();
		a.setId(100);
		a.setName("Shawn Roohi");
		a.setPoints(60);

		Alien a1 = new Alien();
		a1.setId(101);
		a1.setName("Sean Roohi");
		a1.setPoints(85);

		aliens.add(a);
		aliens.add(a1);

	}

	public List<Alien> getAliens() {
		return aliens;
	}

	public Alien getAlien(int id) {

		for (Alien a : aliens) {
			if (a.getId() == id)
				return a;
		}

		return null;

	}

	public void create(Alien a1) {
		// TODO Auto-generated method stub

		aliens.add(a1);
	}

}
