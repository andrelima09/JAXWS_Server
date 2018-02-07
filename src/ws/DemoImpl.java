package ws;

import javax.jws.*;


@WebService(endpointInterface = "ws.Demo")
public class DemoImpl implements Demo {

	@Override
	public String helloworld() {
		return "Hello World!";
	}

	@Override
	public String hi(String fullName) {
		return "Hello " + fullName;
	}

}
