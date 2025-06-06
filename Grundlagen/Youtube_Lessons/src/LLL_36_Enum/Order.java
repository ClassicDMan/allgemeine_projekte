package LLL_36_Enum;

public class Order {

	public enum OrderStatus {

		PENDING, PREPARING, COMPLETED, DELEVERING, CANCELED;

	}

	private OrderStatus status;

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public boolean isDelevirable() {

		if (getStatus() == OrderStatus.DELEVERING) {
			return true;
		}
		return false;

	}

}
