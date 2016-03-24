import java.sql.Timestamp;

/**
 * Copyright: Copyright (c) 2015 Asiainfo
 * 
 * @ClassName: IRuleFactorRelationSV.java
 * @Description: �������ӹ�ϵ���÷�����
 * 
 * @version: v1.0.0
 * @author: gengxy
 * @date: 2015��11��3�� ����3:35:21
 * 
 *        Modification History: Date Author Version Description
 *        ------------------------------------------------------------
 *        2015��11��3�� gengxy v1.1.0 �޸�ԭ��
 */
public interface IRuleFactorRelationSV {
	/**
	 * 
	 * @Function: IRuleFactorRelationSV::addRuleFactorRelation
	 * @Description: ���ݹ����ź����ӱ������һ���������ӹ�ϵ
	 * @param ruleId
	 *            ������
	 * @param factorId
	 *            ���ӱ��
	 * @return �Ƿ����ӳɹ�
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��3�� ����3:37:51
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��3�� gengxy v1.1.0 �޸�ԭ��
	 */
	public boolean addRuleFactorRelation(long ruleId, long factorId,
			Timestamp effDate, Timestamp expDate) throws Exception;

	/**
	 * 
	 * @Function: IRuleFactorRelationSV::delRuleFactorRelation
	 * @Description: ���ݹ�ϵ���ɾ���������ӹ�ϵ
	 * @param relationId
	 *            ��ϵ���
	 * @return
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��3�� ����3:39:31
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��3�� gengxy v1.1.0 �޸�ԭ��
	 */
	public boolean delRuleFactorRelation(long relationId) throws Exception;

	/**
	 * 
	 * @Function: IRuleFactorRelationSV::delRuleFactorRelations
	 * @Description: ���ݹ�ϵ�����������ɾ�������ϵ
	 * @param relationIdArr
	 *            ��ϵ�������
	 * @return ɾ���Ƿ�ɹ�
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��3�� ����3:40:47
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��3�� gengxy v1.1.0 �޸�ԭ��
	 */
	public boolean delRuleFactorRelations(long[] relationIdArr)
			throws Exception;

	/**
	 * 
	 * @Function: IRuleFactorRelationSV::modifyRuleFactorRelation
	 * @Description: ���ݹ�ϵ����޸Ĺ������ӹ�ϵ
	 * @param relationId
	 *            Ҫ�޸ĵĹ�����
	 * @param newRuleId
	 *            �¹�����
	 * @param newFactorId
	 *            �����ӱ��
	 * @param newEffDate
	 *            ����Чʱ��
	 * @param newExpDate
	 *            ��ʧЧʱ��
	 * @return
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��3�� ����3:42:42
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��3�� gengxy v1.1.0 �޸�ԭ��
	 */
	public boolean modifyRuleFactorRelation(long relationId, long newRuleId,
			long newFactorId, Timestamp newEffDate, Timestamp newExpDate)
			throws Exception;

	/**
	 * 
	 * @Function: IRuleFactorRelationSV::getRuleFactorRelations
	 * @Description: ���ݹ����ź����ӱ�Ų�ѯ�������ӹ�ϵ��������ӱ�Ż����ӱ��Ϊ�գ�����Ϊ�˲�ѯ���������ڣ�
	 * @param ruleId
	 * @param factorId
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��5�� ����5:59:22
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��5�� gengxy v1.1.0 �޸�ԭ��
	 */
	public IBORuleFactorRelationValue[] getRuleFactorRelations(long ruleId,
			long factorId) throws Exception;

	/**
	 * 
	 * @Function: IRuleFactorRelationSV::getFactorIds
	 * @Description: ���ݹ����Ų�ѯ�ù����Ŷ�Ӧ���������ӱ��
	 * @param ruleId
	 *            ������
	 * @return ���ӱ���б�
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��5�� ����12:00:03
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��5�� gengxy v1.1.0 �޸�ԭ��
	 */
	public long[] getFactorIds(long ruleId) throws Exception;
}
