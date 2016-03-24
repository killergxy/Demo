public class OrdPaymentResultBean {
	private long payOrdId;

	private boolean payResult;

	private String failReason;

	public long getPayOrdId() {
		return payOrdId;
	}

	public void setPayOrdId(long payOrdId) {
		this.payOrdId = payOrdId;
	}

	public boolean isPayResult() {
		return payResult;
	}

	public void setPayResult(boolean payResult) {
		this.payResult = payResult;
	}

	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

}
