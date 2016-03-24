package factor;

public class ReflectFactorParser implements IFactorParser {

	@Override
	public Object getValue(IBOFactorValue boFactorValue) {
		IFactorValue factorValue = null;
		try {
			factorValue = (IFactorValue)Class.forName(boFactorValue.getValueWay()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return factorValue.getValue();
	}
}
