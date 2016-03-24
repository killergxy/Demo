/**
 * @author gengxy
 * 
 */
public enum RuleType {
	/***/
	Compent("compent"), 
	ORDERITEM("orderitem"),
	FIRSTASSET("firstAssert");

	private String tableName;

	RuleType(String tableName) {
		this.tableName = tableName;
	}

	public String getAddress() {
		return tableName;
	}

}
