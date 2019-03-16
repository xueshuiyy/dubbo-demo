package com.troila.cmp.utils;

import org.springframework.context.ApplicationContext;

/**
 * <p>[功能描述]：获取spring容器中ServiceBean的工具类</p>
 */
public class BeanUtil {

	private static ApplicationContext applicationContext;

	public static void setApplicationContext(ApplicationContext context) {
		applicationContext = context;
	}

	/**
	 *
	 * @param beanName
	 * @return
	 */
	public static Object getBean(String beanName, Object... obj) {
		return applicationContext.getBean(beanName, obj);
	}

	/**
	 *
	 * @param beanName
	 * @return
	 */
	public static <T> T getBean(String beanName, Class<T> beanType,
			Object... obj) {
		return beanType.cast(applicationContext.getBean(beanName, obj));
	}

}
