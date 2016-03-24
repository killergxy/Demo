import java.util.List;


public interface IExceptionConfigSV {
	/**
	 * 根据环节编码获取该环节对应异常原因列表
	 * @param nodeCode 环节编码 
	 * @return 异常原因列表
	 */
	public List<ExceptionReason> getExCodeListByNodeCode(long nodeCode);
	
	/**
	 * 根据异常编码返回该异常对应的失败执行策略列表
	 * @param exceptionCode 异常编码
	 * @return 失败执行策略列表
	 */
	public List<FailExecStrategy> getFailExecStrategysByExCode(long exceptionCode);
}
