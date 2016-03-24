import com.ql.util.express.ExpressRunner;
import com.ql.util.express.IExpressContext;

public class RuleApplySVImpl implements IRuleApplySV_1 {

	@Override
	public boolean isExpressMatch(long ruleNumber, String express)
			throws Exception {
		IExpressContext<String, Object> expressContext = getFactorsContextByRuleNumber(ruleNumber);

		ExpressRunner runner = new ExpressRunner();
		Boolean b = (Boolean) runner.execute(express, expressContext, null,
				false, false);
		return b;
	}

	// ���ݹ����Ż�ȡ��Ӧ<�������ƣ�����ȡֵ>�������ģ����ͱ��ʽ����ƥ��
	private IExpressContext<String, Object> getFactorsContextByRuleNumber(
			long ruleNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLevelOneAssetExpressMatch(String express) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isComponentExpressMatch(String express) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isOrderItemExpressMath(long ruleNum, String express) {
		// TODO Auto-generated method stub
		return false;
	}

}
