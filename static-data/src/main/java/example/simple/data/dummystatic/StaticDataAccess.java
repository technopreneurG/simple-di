package example.simple.data.dummystatic;

import java.util.List;

import example.simple.data.interfaces.Data;
import example.simple.data.interfaces.DataAccess;

public class StaticDataAccess implements DataAccess {

	public Data getData(int id) {
		return UserDataStore.getInstance().getSamples().get(id);
	}

	public List<Data> getAllData() {
		return UserDataStore.getInstance().getSamples();
	}

}
