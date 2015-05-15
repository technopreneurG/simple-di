package example.simple.ws;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

import example.simple.data.dummystatic.StaticDataModule;

public class WebServiceContextListener extends GuiceServletContextListener {

	public static Injector injector;

	@Override
	protected Injector getInjector() {
		injector = Guice.createInjector(new ServletModule() {
			@Override
			protected void configureServlets() {
				install(new StaticDataModule());
			}
		});

		return injector;
	}
}