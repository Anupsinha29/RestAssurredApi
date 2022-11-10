package JavaUtility;

import java.util.Random;

import org.junit.Test;

import net.bytebuddy.asm.Advice.Return;

public class RandomNum {
	@Test
//	public int Ran(int range)
//	{
//	
//Random r=new Random();
//int ran = r.nextInt(range);
//return ran;
//
//
//}
	public int ran(int range) {
		 Random ran = new Random() ;
		 int r = ran.nextInt(range);
		 return r;
		 
		 
	}
	 
}