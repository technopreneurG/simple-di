package example.simple.data.dummystatic;

import com.google.inject.AbstractModule;

import example.simple.data.interfaces.DataAccess;

public class StaticDataModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(DataAccess.class).to(StaticDataAccess.class);
	}

}
