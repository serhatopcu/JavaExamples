/**
 * 
 */
package org.javaturk.oop.ch09.covariant;

import org.javaturk.oop.ch09.factories.factory3.Manager;

/**
 * @author akin
 *
 */
public class HRForManagers extends HR{
	
	@Override
	public Manager getAnEmployee(){  // Covariant return type
		return new Manager(2, "Fatma", 3, "Production", "Production");
	}
}
