package test;

import writer.IWriter;

public class Test {
	private IWriter writer;
	private String myName;

	public void setWriter(IWriter writer) {
		this.writer = writer;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public void run() {
		String s = "This is my test, " + myName;
		writer.writer(s);
	}
}
