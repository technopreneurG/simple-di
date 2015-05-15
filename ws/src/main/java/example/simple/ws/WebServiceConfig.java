package example.simple.ws;

import javax.inject.Inject;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.ResourceConfig;
import org.jvnet.hk2.guice.bridge.api.GuiceBridge;
import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge;

public class WebServiceConfig extends ResourceConfig {

	@Inject
	public WebServiceConfig(ServiceLocator serviceLocator) {
		packages("example.simple.ws");

		GuiceBridge.getGuiceBridge().initializeGuiceBridge(serviceLocator);

		GuiceIntoHK2Bridge gBridge = serviceLocator
				.getService(GuiceIntoHK2Bridge.class);

		gBridge.bridgeGuiceInjector(WebServiceContextListener.injector);
	}
}
