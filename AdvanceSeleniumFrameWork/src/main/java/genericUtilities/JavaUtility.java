package genericUtilities;

import java.util.Random;
/**
 * 
 * @author dmoha
 *
 */

public class JavaUtility {
	/**
	 * This Method is used to generate random number in the given range
	 * @param range
	 * @return
	 */
public int generaterandomnumber(int range) {
	Random r=new Random();
	return r.nextInt(range);
	
}
}
