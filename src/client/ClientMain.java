package client;

import com.tgb.ws.HelloWorld;
import com.tgb.ws.impl.HelloWorldWs;

public class ClientMain {

	public static void main(String[] args) {
		HelloWorldWs hw = new HelloWorldWs();
		HelloWorld helloWorld = hw.getHelloWorldWsPort();
		System.out.println(helloWorld.sayHi("HelloWorld"));

	}
}