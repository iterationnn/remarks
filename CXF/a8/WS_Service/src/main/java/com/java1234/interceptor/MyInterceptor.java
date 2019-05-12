package com.java1234.interceptor;

import java.util.List;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * �Զ���������
 * @author Administrator
 *
 */
public class MyInterceptor extends AbstractPhaseInterceptor<SoapMessage>{

	public MyInterceptor(){
		// �ڵ��÷���֮ǰ����������
		super(Phase.PRE_INVOKE);
	}

	/**
	 * ���ػ�ȡ��Ϣ
	 */
	public void handleMessage(SoapMessage message) throws Fault {
		List<Header> headers=message.getHeaders();
		if(headers==null || headers.size()==0){
			throw new Fault(new IllegalArgumentException("û��Header,������ʵʩ����"));
		}
		Header firstHeader=headers.get(0);
		Element ele=(Element) firstHeader.getObject();
		NodeList userIds=ele.getElementsByTagName("userName");
		NodeList userPasses=ele.getElementsByTagName("password");
		
		if(userIds.getLength()!=1){
			throw new Fault(new IllegalArgumentException("�û�����ʽ����"));
		}
		
		if(userPasses.getLength()!=1){
			throw new Fault(new IllegalArgumentException("�����ʽ����"));
		}
		
		String userId=userIds.item(0).getTextContent();
		String userPass=userPasses.item(0).getTextContent();
		
		if(!userId.equals("java1234") || ! userPass.equals("123456")){
			throw new Fault(new IllegalArgumentException("�û����������벻��ȷ"));
		}
		
	}
}
