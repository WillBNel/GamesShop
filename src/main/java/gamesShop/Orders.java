package gamesShop;

public class Orders {
	
	private int order_id;
	private int customer_id;
	private int prodcut_id;
	private String date_placed;
	
	public Orders(int order_id, int customer_id, int prodcut_id, String date_placed) {
		super();
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.prodcut_id = prodcut_id;
		this.date_placed = date_placed;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getProdcut_id() {
		return prodcut_id;
	}

	public void setProdcut_id(int prodcut_id) {
		this.prodcut_id = prodcut_id;
	}

	public String getDate_placed() {
		return date_placed;
	}

	public void setDate_placed(String date_placed) {
		this.date_placed = date_placed;
	}
	
	

	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", customer_id=" + customer_id + ", prodcut_id=" + prodcut_id
				+ ", date_placed=" + date_placed + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customer_id;
		result = prime * result + ((date_placed == null) ? 0 : date_placed.hashCode());
		result = prime * result + order_id;
		result = prime * result + prodcut_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		if (customer_id != other.customer_id)
			return false;
		if (date_placed == null) {
			if (other.date_placed != null)
				return false;
		} else if (!date_placed.equals(other.date_placed))
			return false;
		if (order_id != other.order_id)
			return false;
		if (prodcut_id != other.prodcut_id)
			return false;
		return true;
	}
	
	
	}
	
