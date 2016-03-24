package factor;

public class DirectoryFactorParser  implements IFactorParser{

	@Override
	public Object getValue(IBOFactorValue boFactorValue) {
		return boFactorValue.getValueObj();
	}

}
