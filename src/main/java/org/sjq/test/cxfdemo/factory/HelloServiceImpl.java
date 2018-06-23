package org.sjq.test.cxfdemo.factory;

public class HelloServiceImpl implements IHelloService {

	@Override
	public String sayHello(String name) {
		return "服务端：hello"+name;
	}

}
