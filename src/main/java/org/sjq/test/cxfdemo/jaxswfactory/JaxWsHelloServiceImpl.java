package org.sjq.test.cxfdemo.jaxswfactory;

import javax.jws.WebService;

import org.sjq.test.cxfdemo.factory.IHelloService;

@WebService(
    name="",//默认为服务类名，即JaxWsHelloServiceImpl
    serviceName="",//默认是服务类名+Service，即JaxWsHelloServiceImplService
    targetNamespace="",//默认是包名倒写
    portName=""//默认为类名+Port，即JaxWsHelloServiceImplPort
)
public class JaxWsHelloServiceImpl implements IHelloService{

	@Override
	public String sayHello(String name) {
		return "服务端jaxws：hello"+name;
	}

}
