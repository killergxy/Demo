import java.sql.Timestamp;

/**
 * Copyright: Copyright (c) 2015 Asiainfo
 * 
 * @ClassName: IRuleFactorRelationSV.java
 * @Description: 规则因子关系配置服务类
 * 
 * @version: v1.0.0
 * @author: gengxy
 * @date: 2015年11月3日 下午3:35:21
 * 
 *        Modification History: Date Author Version Description
 *        ------------------------------------------------------------
 *        2015年11月3日 gengxy v1.1.0 修改原因
 */
public interface IRuleFactorRelationSV {
	/**
	 * 
	 * @Function: IRuleFactorRelationSV::addRuleFactorRelation
	 * @Description: 根据规则编号和因子编号增加一条规则因子关系
	 * @param ruleId
	 *            规则编号
	 * @param factorId
	 *            因子编号
	 * @return 是否增加成功
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月3日 下午3:37:51
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月3日 gengxy v1.1.0 修改原因
	 */
	public boolean addRuleFactorRelation(long ruleId, long factorId,
			Timestamp effDate, Timestamp expDate) throws Exception;

	/**
	 * 
	 * @Function: IRuleFactorRelationSV::delRuleFactorRelation
	 * @Description: 根据关系编号删除规则因子关系
	 * @param relationId
	 *            关系编号
	 * @return
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月3日 下午3:39:31
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月3日 gengxy v1.1.0 修改原因
	 */
	public boolean delRuleFactorRelation(long relationId) throws Exception;

	/**
	 * 
	 * @Function: IRuleFactorRelationSV::delRuleFactorRelations
	 * @Description: 根据关系编号数组批量删除规则关系
	 * @param relationIdArr
	 *            关系编号数组
	 * @return 删除是否成功
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月3日 下午3:40:47
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月3日 gengxy v1.1.0 修改原因
	 */
	public boolean delRuleFactorRelations(long[] relationIdArr)
			throws Exception;

	/**
	 * 
	 * @Function: IRuleFactorRelationSV::modifyRuleFactorRelation
	 * @Description: 根据关系编号修改规则因子关系
	 * @param relationId
	 *            要修改的规则编号
	 * @param newRuleId
	 *            新规则编号
	 * @param newFactorId
	 *            新因子编号
	 * @param newEffDate
	 *            新生效时间
	 * @param newExpDate
	 *            新失效时间
	 * @return
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月3日 下午3:42:42
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月3日 gengxy v1.1.0 修改原因
	 */
	public boolean modifyRuleFactorRelation(long relationId, long newRuleId,
			long newFactorId, Timestamp newEffDate, Timestamp newExpDate)
			throws Exception;

	/**
	 * 
	 * @Function: IRuleFactorRelationSV::getRuleFactorRelations
	 * @Description: 根据规则编号和因子编号查询规则因子关系（如果因子编号或因子编号为空，则认为此查询条件不存在）
	 * @param ruleId
	 * @param factorId
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月5日 下午5:59:22
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月5日 gengxy v1.1.0 修改原因
	 */
	public IBORuleFactorRelationValue[] getRuleFactorRelations(long ruleId,
			long factorId) throws Exception;

	/**
	 * 
	 * @Function: IRuleFactorRelationSV::getFactorIds
	 * @Description: 根据规则编号查询该规则编号对应的所有因子编号
	 * @param ruleId
	 *            规则编号
	 * @return 因子编号列表
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月5日 下午12:00:03
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月5日 gengxy v1.1.0 修改原因
	 */
	public long[] getFactorIds(long ruleId) throws Exception;
}
