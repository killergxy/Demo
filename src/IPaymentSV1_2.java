/**  
 * Copyright: Copyright (c) 2016 Asiainfo
 * 
 * @ClassName: IPaymentSV1_2.java
 * @Description: TODO
 *
 * @version: TODO
 * @author: gengxy
 * @date: 2016年1月21日 上午11:39:43 
 *
 * Modification History:
 * Date         Author          Version            Description
 *------------------------------------------------------------
 * 2016年1月21日      gengxy        0.0.1-SNAPSHOT     TODO
*/
public interface IPaymentSV1_2 {
	/**
	 * @Function: IPaymentSV1_2::getPaymentInfo
	 * @Description: 获取支付信息
	 * @param busiOrderId 客户订单编号
	 * @return 支付金额
	 * @version: v1.0.0
	 * @date: 2016年1月21日 下午2:13:03 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2016年1月21日      gengxy          0.0.1-SNAPSHOT     TODO
	 */
	public Long getPaymentInfo(long busiOrderId);

	/**
	 * @Function: IPaymentSV1_2::paymentFeedback
	 * @Description: 支付结果反馈
	 * @param result 支付结果对象
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2016年1月21日 下午2:16:10 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2016年1月21日      gengxy          0.0.1-SNAPSHOT     TODO
	 */
	public void paymentFeedback(OrdPaymentResultBean result);

	/**
	 * @Function: IPaymentSV1_2::setPayingState
	 * @Description: 设置支付状态为支付中
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2016年1月21日 下午2:28:08 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2016年1月21日      gengxy          0.0.1-SNAPSHOT     新增方法
	 */
	public void setPayingState();
}
