/**
 * 
 * Copyright: Copyright (c) 2015 Asiainfo
 * 
 * @ClassName: IRuleApplySV_NEW.java
 * @Description: 该类的功能描述
 * 
 * @version: v1.0.0
 * @author: gengxy
 * @date: 2015年11月5日 下午5:15:31
 * 
 *        Modification History: Date Author Version Description
 *        ------------------------------------------------------------
 *        2015年11月5日 gengxy v1.1.0 修改原因
 */
public interface IRuleApplySV_1 {
	/** ---------------------------方案1----------------------------------- **/
	/**
	 * 
	 * @Function: IRuleApplySV_1::isExpressMatch
	 * @Description: 根据规则编号和表达式判断该表达式是否匹配
	 * @param ruleNumber
	 *            规则编号
	 * @param express
	 *            表达式
	 * @return
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月5日 下午5:18:45
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月5日 gengxy v1.1.0 修改原因
	 */
	public boolean isExpressMatch(long ruleNumber, String express) throws Exception;

	/** ---------------------------方案1----------------------------------- **/

	/** ---------------------------方案2----------------------------------- **/
	/**
	 * @Function: IRuleApplySV_1::isLevelOneAssetMatch
	 * @Description: 一级流程的表达式是否匹配成功
	 * @param express
	 *            表达式
	 * @return 是否匹配
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月5日 下午5:21:11
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月5日 gengxy v1.1.0 修改原因
	 */
	public boolean isLevelOneAssetExpressMatch(String express)  throws Exception;

	/**
	 * 
	 * @Function: IRuleApplySV_1::isComponentMatch
	 * @Description: 业务资产组建的表达式是否匹配成功
	 * @param express
	 *            表达式
	 * @return 是否匹配
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月5日 下午5:23:03
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月5日 gengxy v1.1.0 修改原因
	 */
	public boolean isComponentExpressMatch(String express) throws Exception;

	/**
	 * 
	 * @Function: IRuleApplySV_1::isOrderItemExpressMath
	 * @Description: 该函数的功能描述
	 * @param ruleNum
	 * @param express
	 * @return
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月9日 下午3:46:07 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2015年11月9日     gengxy           v1.1.0             修改原因
	 */
	public boolean isOrderItemExpressMath(long ruleNum, String express) throws Exception;

	/** ---------------------------方案2----------------------------------- **/
}
