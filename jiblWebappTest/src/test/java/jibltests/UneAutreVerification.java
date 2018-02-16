package jibltests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Vérifié: avec junit, version 4.12, Pour qu'une méthode soit exécutée ene tant que test, il faut et il suffit:
 * 
 *  i - que la classe à laquelle elle appartient, ait un nom se terminant par la chaîne de caractères "Test".
 *  ii - qu'elle soit annotée @Test , cf. {@see org.junit.Test}
 *  
 *  
 * @author ezy
 *
 */
public class UneAutreVerification {

	private final String sayMyName = this.getClass().getName();
	
	@Before
	public void avantChaqueTest() {
		System.out.println("Avant chaque test " + "[" + this.sayMyName + "]");
	}
	
	@After
	public void apresChaqueTest() {
		System.out.println("Après chaque test " + "[" + this.sayMyName + "]");
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
	@Test
	public void testQuiEchoueToujours() {
//		System.out.println("Ceci est un test de "  + "[" + this.sayMyName + "]");
		System.out.println("Ceci est un [testQuiEchoueToujours] de "  + "[" + this.sayMyName + "]");
		assertEquals(3, 1 + 1);
//		fail("Ceci est un test qui échoue volontairement. la méthode fail sert surtout pour répertorier les tests non impélmentés, dans les rapports de tests."  + "[" + this.sayMyName + "]");
	}
	
	/**
	 * ---
	 */
//	@Test
	public void autreTestQuiEchoueToujours() {
//		System.out.println("Ceci est un test de "  + "[" + this.sayMyName + "]");
		System.out.println("Ceci est un [autreTestQuiEchoueToujours] de "  + "[" + this.sayMyName + "]");
		fail("la méthode fail sert surtout pour répertorier les tests non impélmentés, dans les rapports de tests."  + "[autreTestQuiEchoueToujours][" + this.sayMyName + "]");
	}


}
