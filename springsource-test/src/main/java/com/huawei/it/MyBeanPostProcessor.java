package com.huawei.it;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *  自定义BeanPostProcessor
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
	/**
	 * 在初始化之后执行
	 *
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization,beanName is " + beanName);
		return bean;
	}

	/**
	 *  在初始化之前执行
	 *
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("正在执行postProcessBeforeInitialization方法,beanName is " + beanName);
		return bean;
	}
}
