package com.xyz.java.lamda.lesson02;

@FunctionalInterface
public interface Condition<T> {
	public boolean match(T t);
}
