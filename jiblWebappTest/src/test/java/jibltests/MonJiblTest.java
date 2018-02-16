package jibltests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * V�rifi�: avec junit, version 4.12, Pour qu'une m�thode soit ex�cut�e en tant que test, il faut et il suffit:
 * 
 *  i - que la classe � laquelle elle appartient, ait un nom correspondant au design pattern d�finit dans la configuration du [maven-surefire-plugin].
 *      Par d�faut, les noms des classes de tests doivent se terminer par la cha�ne de caract�res "Test".
 *  ii - qu'elle soit annot�e @Test , cf. {@see org.junit.Test}
 *  
 *  
 * @author ezy
 *
 */
public class MonJiblTest {

	private final String sayMyName = this.getClass().getName();
	@Before
	public void avantChaqueTest() {
		System.out.println("Avant chaque test " + "[" + this.sayMyName + "]");
	}
	
	@After
	public void apresChaqueTest() {
		System.out.println("Apr�s chaque test " + "[" + this.sayMyName + "]");
	}
	
	/**
	 * ---
	 */
	@Test
	public void testQuiReussitToujours() {
//		fail("Jibl not yet implemented that test case");
		System.out.println("Ceci est un [testQuiReussitToujours] de "  + "[" + this.sayMyName + "]");
		assertEquals(2, 1 + 1);
	}

	/**
	 * ---
	 */
//	@Test
	public void testQuiEchoueToujours() {
//		System.out.println("Ceci est un test de "  + "[" + this.sayMyName + "]");
		System.out.println("Ceci est un [testQuiEchoueToujours] de "  + "[" + this.sayMyName + "]");
		assertEquals(3, 1 + 1);
//		fail("Ceci est un test qui �choue volontairement. la m�thode fail sert surtout pour r�pertorier les tests non imp�lment�s, dans les rapports de tests."  + "[" + this.sayMyName + "]");
	}
	
	/**
	 * ---
	 */
//	@Test
	public void autreTestQuiEchoueToujours() {
//		System.out.println("Ceci est un test de "  + "[" + this.sayMyName + "]");
		System.out.println("Ceci est un [autreTestQuiEchoueToujours] de "  + "[" + this.sayMyName + "]");
		fail("la m�thode fail sert surtout pour r�pertorier les tests non imp�lment�s, dans les rapports de tests."  + "[autreTestQuiEchoueToujours][" + this.sayMyName + "]");
	}

}
