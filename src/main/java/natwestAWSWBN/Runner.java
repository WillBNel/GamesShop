package natwestAWSWBN;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Runner {

	public static void main(String[] args) {
		JDBCConnection dbCon = new JDBCConnection("NatWestWBN", "Caroline3Clair2Emma!");
//		String query = "INSERT INTO customers VALUES(2, 'Jenny Jackson', 'jen.jack@gmail.com', 41, 'TW20 0EL')";
//		dbCon.exUpdate(query);

		String query = "select * from customers";

		ResultSet result = dbCon.exQuery(query);

		try {
			while (result.next()) {
				int customer_id = result.getInt("customer_id");
				String name = result.getString("name");
				String email = result.getString("email");
				int house_number = result.getInt("house_number");
				String postcode = result.getString("postcode");
				System.out.println("Customer is ID: " + customer_id + ", " + name + ", " + email + ", " + house_number
						+ ", " + postcode);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
