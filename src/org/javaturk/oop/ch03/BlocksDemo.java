package org.javaturk.oop.ch03;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class BlocksDemo {
	
	long l;
	
	// Declaration block
	{
		boolean b;
	}

	// Initialization block
	{
//		b = true;
		l = 17L;
	}

	// Definition block
	{
		int i = 6;
	}

	// Method block
	public static void main(String[] args) {
		BlocksDemo bd = new BlocksDemo();
		System.out.println(bd.l);
		
		{
			int t = 5;
			System.out.println(t);
		}

		bd.f();
	} 
	
	// Inner class block
	class InnerClass{}
	
	// Method block
	public void f(){
		
		// Local class block
		new BlocksDemo(){
			public void sop() {
				System.out.println(l);
			}
		};
	}
}
