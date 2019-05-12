package com.java1234.webservice;

import java.util.List;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import com.java1234.interceptor.AddHeaderInterceptor;

public class Client {

	public static void main(String[] args) {
		HelloWorldService service=new HelloWorldService();
		HelloWorld helloWorld=service.getHelloWorldPort();
		org.apache.cxf.endpoint.Client client=ClientProxy.getClient(helloWorld);
		// client.getInInterceptors().add(new LoggingInInterceptor()); // Ìí¼ÓinÀ¹½ØÆ÷ ÈÕÖ¾À¹½ØÆ÷
		client.getOutInterceptors().add(new AddHeaderInterceptor("java1234","123")); // Ìí¼Ó×Ô¶¨ÒåÀ¹½ØÆ÷
		client.getOutInterceptors().add(new LoggingOutInterceptor()); // Ìí¼ÓoutÀ¹½ØÆ÷
		//System.out.println(helloWorld.say("java1234"));
		/*User user=new User();
		user.setUserName("jack");
		user.setPassword("123456");
		List<Role> roleList=helloWorld.getRoleByUser(user);
		for(Role role:roleList){
			System.out.println(role.getId()+","+role.getRoleName());
		}*/
		MyRoleArray array=helloWorld.getRoles();
		List<MyRole> roleList=array.item;
		for(int i=0;i<roleList.size();i++){
			MyRole my=roleList.get(i);
			System.out.print(my.key+":");
			for(Role r:my.value){
				System.out.print(r.getId()+","+r.getRoleName()+" ");
			}
			System.out.println();
		}
	}
}
