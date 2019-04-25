package com.suidian.www.demo2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/*	@Component���������һ���࣬������ཻ��Spring����
 * 	����ע�⣨�������ƣ�
 * 		@Controller: web��
 * 		@Service: service��
 * 		@Repository: dao��
 * 
 * 	Bean���÷�Χ��ע��
 * 	@Scope�����÷�Χ
 * 		*singleton:Ĭ�ϵ���
 * 		*prototype:����
 * 		request
 * 		session
 * 		globalsession
 * */

// ���ཻ��spring
@Component(value="user")
public class UserImp implements User{

	// ��ͨ����ע��
	@Value("С��")
	private String name;
	
	/*	������������
	 * 		��ʽһ�� @Autowired: ���ö������͵����Ե�ֵ�����ǰ��������������ע��
	 * 							һ��ϰ�߰��������������ע�룬������@Autowriedע���@Qualifierһ��ʹ����ɰ�����������ע��
	 * 		��ʽ����@Resource:
	 * 
	 * */
	// ������������
	@Resource(name="customer")
	private Customer customer;
	
	@Override
	public void save() {
		System.out.println(name + "�Ŀͻ��ǣ�" + customer);
		
	}
	
}
