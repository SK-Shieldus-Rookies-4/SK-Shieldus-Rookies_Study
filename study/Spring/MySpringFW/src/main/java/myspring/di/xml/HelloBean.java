package myspring.di.xml;

import java.util.List;

public class HelloBean {
	String name;
	PrinterBean printer;
	List<String> names;

	public HelloBean() {
		System.out.println(this.getClass().getName() + " 생성자가 호출됨");
	}

	public HelloBean(String name, PrinterBean printer) {
		System.out.println(this.getClass().getName() + " Overloaded 생성자가 호출됨");
		this.name = name;
		this.printer = printer;
	}

	public List<String> getNames() {
		return this.names;
	}

	//setFirstName
	public void setNames(List<String> list) {
		this.names = list;
	}

	public void setName(String name) {
		System.out.println(this.getClass().getName() + "setName() 호출됨" + name);
		this.name = name;
	}

	public void setPrinter(PrinterBean printer) {
		System.out.println(this.getClass().getName() + "setName() 호출됨" + 
				printer.getClass().getName());
		this.printer = printer;
	}

	public String sayHello() {
		return "Hello " + name;
	}

	public void print() {
		this.printer.print(sayHello());
 	}

}
