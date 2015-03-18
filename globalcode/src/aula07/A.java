/**
 * 
 */
package aula07;

/**
 * @author jfsilva
 * 06/03/2015
 */

/** Legal unchecked Exceptions **/
class A {

	void m1(){// checked
		throw new ClassNotFoundException();
	}
	void m2(){// runtime
		throw new ArithmeticException();
	}
	void m3(){// runtime
		throw new ClassCastException();
	}
	void m4(){//runtime
		throw new IllegalArgumentException();
	}
	void m5(){// ckecked
		throw new CloneNotSupportedException();
	}
	void m6(){// checked
		throw new NoSuchFieldException();
	}
}
