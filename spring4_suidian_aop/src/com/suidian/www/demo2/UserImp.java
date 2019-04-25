package com.suidian.www.demo2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/*	@Component组件：修饰一个类，将这个类交给Spring管理
 * 	衍生注解（功能类似）
 * 		@Controller: web层
 * 		@Service: service层
 * 		@Repository: dao层
 * 
 * 	Bean作用范围的注解
 * 	@Scope：作用范围
 * 		*singleton:默认单例
 * 		*prototype:多例
 * 		request
 * 		session
 * 		globalsession
 * */

// 将类交给spring
@Component(value="user")
public class UserImp implements User{

	// 普通属性注入
	@Value("小张")
	private String name;
	
	/*	对象属性输入
	 * 		方式一： @Autowired: 设置对象类型的属性的值，但是按照类型完成属性注入
	 * 							一般习惯按照名称完成属性注入，必须让@Autowried注解和@Qualifier一起使用完成按照名称属性注入
	 * 		方式二：@Resource:
	 * 
	 * */
	// 对象属性输入
	@Resource(name="customer")
	private Customer customer;
	
	@Override
	public void save() {
		System.out.println(name + "的客户是：" + customer);
		
	}
	
}
