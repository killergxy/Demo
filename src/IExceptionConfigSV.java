import java.util.List;


public interface IExceptionConfigSV {
	/**
	 * ���ݻ��ڱ����ȡ�û��ڶ�Ӧ�쳣ԭ���б�
	 * @param nodeCode ���ڱ��� 
	 * @return �쳣ԭ���б�
	 */
	public List<ExceptionReason> getExCodeListByNodeCode(long nodeCode);
	
	/**
	 * �����쳣���뷵�ظ��쳣��Ӧ��ʧ��ִ�в����б�
	 * @param exceptionCode �쳣����
	 * @return ʧ��ִ�в����б�
	 */
	public List<FailExecStrategy> getFailExecStrategysByExCode(long exceptionCode);
}
