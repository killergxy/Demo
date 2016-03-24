/**
 * Copyright: Copyright (c) 2015 Asiainfo
 * 
 * @ClassName: IRuleApplySV_2.java
 * @Description: ����Ĺ�������
 * 
 * @version: v1.0.0
 * @author: gengxy
 * @date: 2015��11��10�� ����2:15:41
 * 
 *        Modification History: Date Author Version Description
 *        ------------------------------------------------------------
 *        2015��11��10�� gengxy v1.1.0 �޸�ԭ��
 */
public interface IRuleApplySV_2<T> {
	/**
	 * 
	 * @Function: IRuleApplySV_2::getId
	 * @Description: ���ݹ����ź͹����ϵ�����ȡ��Ӧ�ı��
	 * @param ruleId ������
	 * @param ruleRelations �����ϵ
	 * @return ��Ӧ�ı��
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��10�� ����2:19:27 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2015��11��10��     gengxy           v1.1.0             �޸�ԭ��
	 */
	public T getId(String ruleId, IRuleRelation<T>[] ruleRelations) throws Exception;
}
