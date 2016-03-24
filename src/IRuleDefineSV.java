import java.sql.Date;

/**
 * 
 * Copyright: Copyright (c) 2015 Asiainfo
 * 
 * @ClassName: IRuleDefineSV.java
 * @Description: ���������ӿ�
 * 
 * @version: v1.0.0
 * @author: gengxy
 * @date: 2015��11��3�� ����2:21:21
 * 
 *        Modification History: Date Author Version Description
 *        ------------------------------------------------------------
 *        2015��11��3�� gengxy v1.1.0 �޸�ԭ��
 */
public interface IRuleDefineSV {

	/**
	 * 
	 * @Function: IRuleDefineSV::addRule
	 * @Description: ���ݹ������ƺ���������һ������
	 * @param ruleNumber
	 *            ������
	 * @param ruleName
	 *            ��������
	 * @param description
	 *            ����
	 * @return �����Ƿ�ɹ�
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��3�� ����2:37:55
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��3�� gengxy v1.1.0 �޸�ԭ��
	 */
	public boolean addRule(String ruleName, String description, Date effDate,
			Date invalidDate) throws Exception;

	/**
	 * 
	 * @Function: IRuleDefineSV::delRule
	 * @Description: ���ݹ�����ɾ�����򣬼����øù���״̬������
	 * @param ruleId
	 *            ������
	 * @return ɾ���Ƿ�ɹ�
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��3�� ����3:27:06
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��3�� gengxy v1.1.0 �޸�ԭ��
	 */
	public boolean delRule(String ruleId) throws Exception;

	/**
	 * 
	 * @Function: IRuleDefineSV::delRules
	 * @Description: ���ݹ����Ž���Ӧ�Ĺ�������Ϊ������
	 * @param ruleIdArr
	 *            ����������
	 * @return ɾ���Ƿ�ɹ�
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��3�� ����2:44:57
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��3�� gengxy v1.1.0 �޸�ԭ��
	 */
	public boolean delRules(String[] ruleIdArr) throws Exception;

	/**
	 * 
	 * @Function: IRuleDefineSV::modifyRule
	 * @Description: ���ݹ������޸�һ������
	 * @param ruleId
	 *            Ҫ�޸Ĺ���Ĺ�����
	 * @param newRuleName
	 *            �µĹ�������
	 * @param newDescription
	 *            �µĹ�������
	 * @return �޸��Ƿ�ɹ�
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��3�� ����2:56:12
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��3�� gengxy v1.1.0 �޸�ԭ��
	 */
	public boolean modifyRule(long ruleId, String newRuleName,
			String newDescription, Date effDate, Date invalidDate)
			throws Exception;

	/**
	 * 
	 * @Function: IRuleDefineSV::getRules
	 * @Description: ���ݹ������Ʒ��ؿ��õĹ�������б�
	 * @param ruleName
	 *            ��������
	 * @return
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��3�� ����2:28:05
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��3�� gengxy v1.1.0 �޸�ԭ��
	 */
	public IBORuleDefineValue[] getRules(String ruleName) throws Exception;

}
