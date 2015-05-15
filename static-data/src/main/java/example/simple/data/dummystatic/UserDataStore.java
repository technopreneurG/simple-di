package example.simple.data.dummystatic;

import java.util.ArrayList;
import java.util.List;

import example.simple.data.interfaces.Data;

public class UserDataStore {

	private static UserDataStore instance;
	private List<Data> samples;

	private UserDataStore() {
		samples = new ArrayList<Data>();
		for (int i = 0; i < 10; i++) {
			User u = new User("firstName" + i, "lastName" + i);
			samples.add(u);
		}
		instance = this;
	}

	public static UserDataStore getInstance() {
		if (instance == null) {
			new UserDataStore();
		}
		return instance;
	}

	public void printUsers() {
		for (Data d : samples) {
			User u = (User) d;
			System.out.println("fn:" + u.getFirstName() + ", ln:"
					+ u.getLastName());
		}
	}

	public List<Data> getSamples() {
		return samples;
	}
}
