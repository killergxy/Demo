/**
 * 
 * Copyright: Copyright (c) 2015 Asiainfo
 * 
 * @ClassName: IRuleApplySV_NEW.java
 * @Description: ����Ĺ�������
 * 
 * @version: v1.0.0
 * @author: gengxy
 * @date: 2015��11��5�� ����5:15:31
 * 
 *        Modification History: Date Author Version Description
 *        ------------------------------------------------------------
 *        2015��11��5�� gengxy v1.1.0 �޸�ԭ��
 */
public interface IRuleApplySV_1 {
	/** ---------------------------����1----------------------------------- **/
	/**
	 * 
	 * @Function: IRuleApplySV_1::isExpressMatch
	 * @Description: ���ݹ����źͱ��ʽ�жϸñ��ʽ�Ƿ�ƥ��
	 * @param ruleNumber
	 *            ������
	 * @param express
	 *            ���ʽ
	 * @return
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��5�� ����5:18:45
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��5�� gengxy v1.1.0 �޸�ԭ��
	 */
	public boolean isExpressMatch(long ruleNumber, String express) throws Exception;

	/** ---------------------------����1----------------------------------- **/

	/** ---------------------------����2----------------------------------- **/
	/**
	 * @Function: IRuleApplySV_1::isLevelOneAssetMatch
	 * @Description: һ�����̵ı��ʽ�Ƿ�ƥ��ɹ�
	 * @param express
	 *            ���ʽ
	 * @return �Ƿ�ƥ��
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��5�� ����5:21:11
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��5�� gengxy v1.1.0 �޸�ԭ��
	 */
	public boolean isLevelOneAssetExpressMatch(String express)  throws Exception;

	/**
	 * 
	 * @Function: IRuleApplySV_1::isComponentMatch
	 * @Description: ҵ���ʲ��齨�ı��ʽ�Ƿ�ƥ��ɹ�
	 * @param express
	 *            ���ʽ
	 * @return �Ƿ�ƥ��
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��5�� ����5:23:03
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015��11��5�� gengxy v1.1.0 �޸�ԭ��
	 */
	public boolean isComponentExpressMatch(String express) throws Exception;

	/**
	 * 
	 * @Function: IRuleApplySV_1::isOrderItemExpressMath
	 * @Description: �ú����Ĺ�������
	 * @param ruleNum
	 * @param express
	 * @return
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��9�� ����3:46:07 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2015��11��9��     gengxy           v1.1.0             �޸�ԭ��
	 */
	public boolean isOrderItemExpressMath(long ruleNum, String express) throws Exception;

	/** ---------------------------����2----------------------------------- **/
}
