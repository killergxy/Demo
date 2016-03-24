public interface IRuleApplySV {
	/**
	 * 
	 * @Function: IRuleApplySV::getOrderItemAssetCode
	 * @Description: ���ݶ��������ҵ���Ӧ��ҵ���ʲ����
	 * @param orderItemId ��������
	 * @return ҵ���ʲ����
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��5�� ����2:55:49 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2015��11��5��     gengxy           v1.1.0             �޸�ԭ��
	 */
	public long getOrderItemAssetCode(long orderItemId) throws Exception;
	
	/**
	 * 
	 * @Function: IRuleApplySV::getLevelOneAssetCode
	 * @Description: ���ݹ����Ż�ȡһ��ҵ���ʲ���Ӧ���ʲ����
	 * @return һ��ҵ���ʲ���Ӧ���ʲ����
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015��11��5�� ����9:53:34 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2015��11��5��     gengxy           v1.1.0             �޸�ԭ��
	 */
	public long getLevelOneAssetCode() throws Exception;
	
	/**
	 * 
	 * @Function: IRuleApplySV::getComponentCode
	 * @Description:  ���ݹ����Ż�ȡ�齨�����Ի�ҵ���齨����Ӧ��ҵ���齨���
	 * @return �齨��Ӧ���齨���
	 * @version: v1.0.0
	 * @throws Exception
	 * @author: gengxy
	 * @date: 2015��11��5�� ����9:54:15 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2015��11��5��     gengxy           v1.1.0             �޸�ԭ��
	 */
	public long getComponentCode() throws Exception;
}
