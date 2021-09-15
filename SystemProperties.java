package com.incubtasks;
import java.util.*;
public class SystemProperties {
	public static void main(String[] args) {
		{
			Properties property=System.getProperties();
			property.list(System.out);
		}
	}

}
