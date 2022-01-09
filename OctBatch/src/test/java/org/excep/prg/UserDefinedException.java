package org.excep.prg;

public class UserDefinedException extends Throwable {

	@Override
	public String getMessage() {
		
		return "Employee not in the specfic Dept";
	}

}
