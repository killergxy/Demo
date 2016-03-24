package soorder;

public interface SoOrder {
	/**
	 * @Function: SoOrder::createSoOrderObject
	 * @Description: 创建交易构建对象
	 * @param orderReviceObj  订单接受标准数据结构
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年12月23日 上午11:28:25
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年12月23日 gengxy v1.1.0 修改原因
	 */
	public SoOrder createSoOrderObject(OrderReviceObj orderReviceObj);

	/**
	 * @Function: SoOrder::save
	 * @Description: 保存交易构建的数据
	 * @param soOrder 交易构件对象
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年12月23日 上午11:16:25
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年12月23日 gengxy v1.1.0 修改原因
	 */
	public void saveSoOrder(SoOrder soOrder);
	
	/**
	 * @Function: SoOrder::saveOrderHandleRecord
	 * @Description: 保存订单操作记录
	 * @param orderHandleRecord 订单操作记录对象
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年12月23日 上午11:32:10 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2015年12月23日     gengxy           v1.1.0             修改原因
	 */
	public void saveOrderHandleRecord(OrderHandleRecord orderHandleRecord); 
}
