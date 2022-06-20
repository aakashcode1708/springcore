package com.aakash.springcore.refTypes.assign;

public class Shopping {
private String name;
private Item item;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
}
@Override
public String toString() {
	return "Shopping [name=" + name + ", item=" + item + "]";
}

}
