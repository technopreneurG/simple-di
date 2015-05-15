package example.simple.data.interfaces;

import java.util.List;

public interface DataAccess {

	public Data getData(int id);
	public List<Data> getAllData();

}
