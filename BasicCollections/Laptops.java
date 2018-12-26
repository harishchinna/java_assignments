package com.capgemini.collections;

public class Laptops {
	private String company, model, operaingSystem, processor;

	public Laptops(String company, String model, String operaingSystem,
			String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operaingSystem = operaingSystem;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Laptops [company=" + company + ", model=" + model
				+ ", operaingSystem=" + operaingSystem + ", processor="
				+ processor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Laptops other = (Laptops) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

}
