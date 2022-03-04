package chap99.codingbat;

import static org.junit.jupiter.api.Assertions.*;

import javax.xml.transform.Source;

import org.junit.jupiter.api.Test;

class diff21Test {

	@Test
	void test() {
		assertEquals(diff21(21), 0);
		assertEquals(2, diff21(19));
		assertEquals(2, diff21(22));
	}

	public int diff21(int n) {
		int a = 3;
		
		System.out.println(a);
		
		if (n > 21) {
			return (n - 21) * 2;
		} else {
			return 21 - n;
		}
	}

}
