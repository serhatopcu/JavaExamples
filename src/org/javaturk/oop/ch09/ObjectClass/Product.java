package org.javaturk.oop.ch09.ObjectClass;

class Product {
	int no;
	String name;
	double price;

	public Product(int no, String name, double price) {
		this.no = no;
		this.name = name;
		this.price = price;
		new Object().equals(new Object());
	}

//	@Override
//	public boolean equals(Object p) {
//		Product p1 = (Product)p;
//		boolean b = false;
//		if (no == p1.no)
//			b = true;
//		return b;
//	}
	
	

//	public int hashCode() {
//		return 31*no;
//	}
//	
//	public Object clone(){
//		return new Product(no, name, price);
//	}








	@Override
	public String toString() {
		return "Product [no=" + no + ", name=" + name + ", price=" + price + "]";
	}

	/**
	 * @author akin
	 * @return
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/**
	 * @author akin
	 * @param obj
	 * @return
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
}
