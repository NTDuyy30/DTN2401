package com.vti.entity;

public class TypeQuestion {
	public enum TypeName {
		ESSAY, MULTIPLE_CHOICE;
	}

	private int typeID;
	private TypeName typeName;

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	public TypeName getTypeName() {
		return typeName;
	}

	public void setTypeName(TypeName typeName) {
		this.typeName = typeName;
	}

}
