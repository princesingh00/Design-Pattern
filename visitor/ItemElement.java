package com.bridgeit.designPattern.visitor;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
