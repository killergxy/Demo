import java.sql.Date;

/**
 * 
 * Copyright: Copyright (c) 2015 Asiainfo
 * 
 * @ClassName: IRuleDefineSV.java
 * @Description: 规则定义服务接口
 * 
 * @version: v1.0.0
 * @author: gengxy
 * @date: 2015年11月3日 下午2:21:21
 * 
 *        Modification History: Date Author Version Description
 *        ------------------------------------------------------------
 *        2015年11月3日 gengxy v1.1.0 修改原因
 */
public interface IRuleDefineSV {

	/**
	 * 
	 * @Function: IRuleDefineSV::addRule
	 * @Description: 根据规则名称和描述增加一条规则
	 * @param ruleNumber
	 *            规则编号
	 * @param ruleName
	 *            规则名称
	 * @param description
	 *            描述
	 * @return 增加是否成功
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月3日 下午2:37:55
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月3日 gengxy v1.1.0 修改原因
	 */
	public boolean addRule(String ruleName, String description, Date effDate,
			Date invalidDate) throws Exception;

	/**
	 * 
	 * @Function: IRuleDefineSV::delRule
	 * @Description: 根据规则编号删除规则，即设置该规则状态不可用
	 * @param ruleId
	 *            规则编号
	 * @return 删除是否成功
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月3日 下午3:27:06
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月3日 gengxy v1.1.0 修改原因
	 */
	public boolean delRule(String ruleId) throws Exception;

	/**
	 * 
	 * @Function: IRuleDefineSV::delRules
	 * @Description: 根据规则编号将对应的规则设置为不可用
	 * @param ruleIdArr
	 *            规则编号数组
	 * @return 删除是否成功
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月3日 下午2:44:57
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月3日 gengxy v1.1.0 修改原因
	 */
	public boolean delRules(String[] ruleIdArr) throws Exception;

	/**
	 * 
	 * @Function: IRuleDefineSV::modifyRule
	 * @Description: 根据规则编号修改一条规则
	 * @param ruleId
	 *            要修改规则的规则编号
	 * @param newRuleName
	 *            新的规则名称
	 * @param newDescription
	 *            新的规则描述
	 * @return 修改是否成功
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月3日 下午2:56:12
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月3日 gengxy v1.1.0 修改原因
	 */
	public boolean modifyRule(long ruleId, String newRuleName,
			String newDescription, Date effDate, Date invalidDate)
			throws Exception;

	/**
	 * 
	 * @Function: IRuleDefineSV::getRules
	 * @Description: 根据规则名称返回可用的规则对象列表
	 * @param ruleName
	 *            规则名称
	 * @return
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月3日 下午2:28:05
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月3日 gengxy v1.1.0 修改原因
	 */
	public IBORuleDefineValue[] getRules(String ruleName) throws Exception;

}
