import java.sql.Date;

import factor.IBOFactorValue;

/**
 * 
 * Copyright: Copyright (c) 2015 Asiainfo
 * 
 * @ClassName: IFactorSV.java
 * @Description: ���ӷ���ӿ�
 * 
 * @version: v1.0.0
 * @author: admin
 * @date: 2015��11��3�� ����3:00:57
 * 
 *        Modification History: Date Author Version Description
 *        ------------------------------------------------------------
 *        2015��11��3�� admin v1.1.0 �޸�ԭ��
 */
public interface IFactorSV {

	/**
	 * @Function: IFactorSV::addFactor
	 * @Description: �����������ƣ�ȡֵ��ʽ��ȡֵ������ЧʱЧʱ������һ������
	 * @param factorName ��������
	 * @param valueWay ȡֵ��ʽ
	 * @param valueObject ȡֵ����
	 * @param effDate ��Чʱ��
	 * @param invalidDate ʧЧʱ��
	 * @return �Ƿ����ӳɹ�
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��5�� ����5:07:49 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2015��11��5��     gengxy           v1.1.0             �޸�ԭ��
	 */
	public boolean addFactor(String factorName, String valueWay,
			String valueObject,Date effDate, Date expDate) throws Exception;

	/**
	 * 
	 * @Function: IFactorSV::delFactor
	 * @Description: �������ӱ��ɾ�����ӣ����������Ӳ�����
	 * @param factorId ���ӱ��
	 * @return ɾ���Ƿ�ɹ�
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��3�� ����3:13:36
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��3�� admin v1.1.0 �޸�ԭ��
	 */
	public boolean delFactor(long factorId) throws Exception;

	/**
	 * 
	 * @Function: IFactorSV::delFactor
	 * @Description: �������ӱ���б�����ɾ�����ӣ�����������״̬Ϊ������
	 * @param factorIdArr  ���ӱ������
	 * @return ɾ�������Ƿ�ɹ�
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��3�� ����3:11:14
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��3�� admin v1.1.0 �޸�ԭ��
	 */
	public boolean delFactors(long[] factorIdArr) throws Exception;

	/**
	 * 
	 * @Function: IFactorSV::modifyFactor
	 * @Description: �������ӱ���޸�����
	 * @param factorId Ҫ�޸ĵ����ӱ��
	 * @param newFactorName �µ���������
	 * @param newValueWay �µ�ȡֵ��ʽ
	 * @param newValueObject �µ�ȡֵ����
	 * @param effDate ��Чʱ��
	 * @param expDate ʧЧʱ��
	 * @return �Ƿ��޸ĳɹ�
	 * @author: gengxy
	 * @date: 2015��11��3�� ����3:19:07
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��3�� gengxy v1.1.0 �޸�ԭ��
	 */
	public boolean modifyFactor(long factorId, String newFactorName,
			String newValueWay, String newValueObject,Date effDate,Date expDate) throws Exception;

	/**
	 * 
	 * @Function: IFactorSV::getFactor
	 * @Description: �������ӱ�Ų�ѯ���Ӷ���
	 * @param factorId  ���ӱ��
	 * @return һ�����Ӽ�¼����
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��5�� ����3:10:12
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��5�� gengxy v1.1.0 �޸�ԭ��
	 */
	public IBOFactorValue getFactor(long factorId) throws Exception;
	
	/**
	 * 
	 * @Function: IFactorSV::getFactors
	 * @Description: �����������Ʋ�ѯ��Ӧ������
	 * @param factorName ��������
	 * @return ���Ӷ�������
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��3�� ����3:03:01
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��3�� gengxy v1.1.0 �޸�ԭ��
	 */
	public IBOFactorValue[] getFactors(String factorName) throws Exception;

}
