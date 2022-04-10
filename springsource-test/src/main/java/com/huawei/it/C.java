package com.huawei.it;

public class C extends D{
	/**
	  * 构造器私有
	  *
	  **/
	private C(){
		super();
		System.out.println("执行C的构造方法");
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> aClass = Class.forName("com.huawei.it.C");
		Object o = aClass.newInstance();
		System.out.println(o);
	}
}
