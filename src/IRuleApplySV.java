public interface IRuleApplySV {
	/**
	 * 
	 * @Function: IRuleApplySV::getOrderItemAssetCode
	 * @Description: 根据订单项编号找到相应的业务资产编号
	 * @param orderItemId 订单项编号
	 * @return 业务资产编号
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月5日 下午2:55:49 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2015年11月5日     gengxy           v1.1.0             修改原因
	 */
	public long getOrderItemAssetCode(long orderItemId) throws Exception;
	
	/**
	 * 
	 * @Function: IRuleApplySV::getLevelOneAssetCode
	 * @Description: 根据规则编号获取一级业务资产对应的资产编号
	 * @return 一级业务资产对应的资产编号
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月5日 上午9:53:34 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2015年11月5日     gengxy           v1.1.0             修改原因
	 */
	public long getLevelOneAssetCode() throws Exception;
	
	/**
	 * 
	 * @Function: IRuleApplySV::getComponentCode
	 * @Description:  根据规则编号获取组建（个性化业务组建）对应的业务组建编号
	 * @return 组建对应的组建编号
	 * @version: v1.0.0
	 * @throws Exception
	 * @author: gengxy
	 * @date: 2015年11月5日 上午9:54:15 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2015年11月5日     gengxy           v1.1.0             修改原因
	 */
	public long getComponentCode() throws Exception;
}
