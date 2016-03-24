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

	// 根据规则编号获取对应<因子名称，因子取值>的上下文，来和表达式进行匹配
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
