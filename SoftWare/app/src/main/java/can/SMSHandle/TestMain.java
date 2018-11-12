package com.patternStudy;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		boolean needDeliverySMS = true;
		boolean needTicketSMS = true;
		
		boolean isDeliverySMS = false;
		boolean isTicketSMS = false;
		String SMSText;
		
		Scanner scanner = new Scanner(System.in);
		//SMSText = scanner.next();
		
		/*��ȥ�Ķ������ɻ�*/
//		SMSText = "�ѳ�Ʊ������������HU7597�Ͼ�»�ڻ���T2-���ݳ��ֻ��� 10��5��10:20-10��5��11:50�Ե���,Ʊ"
//				+ "��:880-2171407321����������ǰ2Сʱ������ֵ��������Ҫ��ʾ���뾯���Ի�е���ϡ�����ȡ����Ϊ��"
//				+ "����թ��Ϊ���˸ļ�Σ��ƷЯ�����˼��������������http://d.qunar.com/1S4qZQ  �������⣬��"
//				+ "���http://d.qunar.com/I2zgSI#  ��T�˶���ȥ�Ķ�����";
		/*��Я�������ɻ�*/
//		SMSText = "��Я�������ѳ�Ʊ������4487720167�����ź��� MF8212 �����Ӷ�����T3-���ݳ��ֻ��� 9��8��13:40"
//				+ "-9��8��18:25 ��껣�Ʊ��731-5731937155������ǰ2Сʱ������ֵ����"; 
		/*���Ϻ����ɻ�*/
//		SMSText = "���Ϻ����𾴵��ÿͣ����Ļ�Ʊ����2018-05-24֧���ɹ���6��30�� CZ3445���ྭ�òգ�����(CAN)18"
//				+ ":10-�Ϻ�����(SHA)20:25����ǰ�������Ϻ���̨,��ǰ45������ɰ����˻��������˻��˶����ǣ�Ʊ��784"
//				+ "2349888768. ף����;��졣�Ϻ�APP�Ƴ���λԤѡ���񣬴� t.cn/RfjgZHh ����ܰ��ʾ�����Ķ�������ʾ��Ϣ�������������� m.csair.com/b/?Aw4fycj ������׼�Ϻ��ٷ��ͷ��绰95";
		/*�����š��ɻ�*/
		SMSText = "�����ŵ�������Ԥ����2017-10-06 17:40���人��ӻ���T3��վ¥-�Ϻ��ֶ�����T1��վ¥�Ķ���MU5372�����ѳɹ���Ʊ���˻���Ʊ�ţ��º���(781-5723543466),����(781-5723543467)"
				+ "��Ϊ�������������ǰ2Сʱ�����������˻������������������µ����ŵ�������10107888����ף����;��죡Ϊ��֤���ĲƲ���ȫ���뾯���Էɻ����ϡ�����ȡ�������ݵ�թƭ���ţ���o)��";
		/*���������ѡ��ɻ�*/
//		SMSText = "���������ѡ�10-03 14:00�������D2��-10-03 15:05����������ȫ�տպ���NH027������1256508639143(���չ�˾�����ţ�1808262003121b96fb6)��"
//				+ "�ɹ���HOU/YETING,SHAO/CHANGYING,LI/WENXIN Ʊ��205-2781287224/205-2781287226/205-2781287225����� tb.cn/wfd0ssw �鿴"
//				+ "�г���ϸ��Ϣ������ǰ����3Сʱ������������ǻ�������Ҫ���ѡ�����թƭ���������յ��κ��˸�ǩ������䶯���Ż�绰������ϵ���Һ�ʵ�����ҷ���绰��0571-8"
//				+ "8139900�� ��������绰��9510208 , �����û��벦�� 86-0571-56888688��";
		
		
		if (needDeliverySMS || needTicketSMS) {
			SMSMatch test = new SMSMatch(SMSText);
			isDeliverySMS = test.getIsDeliverySMS();
			isTicketSMS = test.getIsTicketSMS();
			if (needDeliverySMS && isDeliverySMS) {
				System.out.println("��Ҫ�������ݶ��Źؼ��֣�");
				System.out.println(test.getKeyContent());
			}
			if (needTicketSMS && isTicketSMS) {
				System.out.println("��Ҫ�������Ʊ���Źؼ��֣�");
				System.out.println(test.getKeyContent());			
			}
		} else {
			System.out.println("δ�������ŷ�������");
		}
	}
}