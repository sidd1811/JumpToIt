package com.jti.phase_1;

public class AccessSpecifier {
	
	private String itemName;
	private String itemValue;
	private String itemAccessMethod;
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getItemValue() {
		return itemValue;
	}
	
	public void setItemValue(String itemValue) {
		this.itemValue = itemValue;
	}

	public String getItemAccessMethod() {
		return itemAccessMethod;
	}

	public void setItemAccessMethod(String itemAccessMethod) {
		this.itemAccessMethod = itemAccessMethod;
	}
	
	public void performAccess(String itemAccessMethod) {
		//handles all 4 cases of access
	}
	
}
