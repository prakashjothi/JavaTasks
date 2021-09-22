package org.inheritanceclass;

import org.testng.annotations.Test;

public class InheritanceTest extends Telugu{
	
	@Test
	private void callLanguage() {
		
		Telugu t = new Telugu();
		t.allLanguage();
		t.englishLanguage();
		t.tamilLanguage();
		t.teluguLanguage();
		
	}

}
