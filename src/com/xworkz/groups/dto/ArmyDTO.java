package com.xworkz.groups.dto;

public class ArmyDTO {

	private String name, type;

	public ArmyDTO(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {

		return "ArmyDTO [name=" + name + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		return 2;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof ArmyDTO) {
				ArmyDTO casted = (ArmyDTO) obj;

				if (name.equals(casted.getName()) && type.equals(casted.getType())) {
					return true;
				}

			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}