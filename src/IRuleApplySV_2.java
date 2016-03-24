/**
 * Copyright: Copyright (c) 2015 Asiainfo
 * 
 * @ClassName: IRuleApplySV_2.java
 * @Description: 该类的功能描述
 * 
 * @version: v1.0.0
 * @author: gengxy
 * @date: 2015年11月10日 下午2:15:41
 * 
 *        Modification History: Date Author Version Description
 *        ------------------------------------------------------------
 *        2015年11月10日 gengxy v1.1.0 修改原因
 */
public interface IRuleApplySV_2<T> {
	/**
	 * 
	 * @Function: IRuleApplySV_2::getId
	 * @Description: 根据规则编号和规则关系数组获取相应的编号
	 * @param ruleId 规则编号
	 * @param ruleRelations 组件关系
	 * @return 对应的编号
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月10日 下午2:19:27 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2015年11月10日     gengxy           v1.1.0             修改原因
	 */
	public T getId(String ruleId, IRuleRelation<T>[] ruleRelations) throws Exception;
}
