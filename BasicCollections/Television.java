package com.capgemini.collections;

public class Television {
	private String company, type;
	private boolean enabled3D;
	private int price;

	
	public Television(String company, String type, boolean enabled3d, int price) {
		super();
		this.company = company;
		this.type = type;
		enabled3D = enabled3d;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type
				+ ", enabled3D=" + enabled3D + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
}
