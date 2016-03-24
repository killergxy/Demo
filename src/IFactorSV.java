import java.sql.Date;

import factor.IBOFactorValue;

/**
 * 
 * Copyright: Copyright (c) 2015 Asiainfo
 * 
 * @ClassName: IFactorSV.java
 * @Description: 因子服务接口
 * 
 * @version: v1.0.0
 * @author: admin
 * @date: 2015年11月3日 下午3:00:57
 * 
 *        Modification History: Date Author Version Description
 *        ------------------------------------------------------------
 *        2015年11月3日 admin v1.1.0 修改原因
 */
public interface IFactorSV {

	/**
	 * @Function: IFactorSV::addFactor
	 * @Description: 根据因子名称，取值方式，取值对象，生效时效时间增加一条因子
	 * @param factorName 因子名称
	 * @param valueWay 取值方式
	 * @param valueObject 取值对象
	 * @param effDate 生效时间
	 * @param invalidDate 失效时间
	 * @return 是否增加成功
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月5日 下午5:07:49 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2015年11月5日     gengxy           v1.1.0             修改原因
	 */
	public boolean addFactor(String factorName, String valueWay,
			String valueObject,Date effDate, Date expDate) throws Exception;

	/**
	 * 
	 * @Function: IFactorSV::delFactor
	 * @Description: 根据因子编号删除因子，即设置因子不可用
	 * @param factorId 因子编号
	 * @return 删除是否成功
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月3日 下午3:13:36
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月3日 admin v1.1.0 修改原因
	 */
	public boolean delFactor(long factorId) throws Exception;

	/**
	 * 
	 * @Function: IFactorSV::delFactor
	 * @Description: 根据因子编号列表批量删除因子，即设置因子状态为不可用
	 * @param factorIdArr  因子编号数组
	 * @return 删除因子是否成功
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月3日 下午3:11:14
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月3日 admin v1.1.0 修改原因
	 */
	public boolean delFactors(long[] factorIdArr) throws Exception;

	/**
	 * 
	 * @Function: IFactorSV::modifyFactor
	 * @Description: 根据因子编号修改因子
	 * @param factorId 要修改的因子编号
	 * @param newFactorName 新的因子名称
	 * @param newValueWay 新的取值方式
	 * @param newValueObject 新的取值对象
	 * @param effDate 生效时间
	 * @param expDate 失效时间
	 * @return 是否修改成功
	 * @author: gengxy
	 * @date: 2015年11月3日 下午3:19:07
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月3日 gengxy v1.1.0 修改原因
	 */
	public boolean modifyFactor(long factorId, String newFactorName,
			String newValueWay, String newValueObject,Date effDate,Date expDate) throws Exception;

	/**
	 * 
	 * @Function: IFactorSV::getFactor
	 * @Description: 根据因子编号查询因子对象
	 * @param factorId  因子编号
	 * @return 一条因子记录对象
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月5日 下午3:10:12
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月5日 gengxy v1.1.0 修改原因
	 */
	public IBOFactorValue getFactor(long factorId) throws Exception;
	
	/**
	 * 
	 * @Function: IFactorSV::getFactors
	 * @Description: 根据因子名称查询对应的因子
	 * @param factorName 因子名称
	 * @return 因子对象数组
	 * @version: v1.0.0
	 * @author: gengxy
	 * @date: 2015年11月3日 下午3:03:01
	 * 
	 *        Modification History: Date Author Version Description
	 *        -------------------------------------------------------------
	 *        2015年11月3日 gengxy v1.1.0 修改原因
	 */
	public IBOFactorValue[] getFactors(String factorName) throws Exception;

}
