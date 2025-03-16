package java.database.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//  =======================================================================  JDBC(Java Database Connectivity)  ================================================================================================================

// JDBC -> It is an API(Application Programming Interface) to communicate between client/java applications to a database and store the data in a database(MySQL/RDBMS).

// Steps for DB connection:-
// (1) load & register driver -> Class.forName("com.mysql.cj.jdbc.Driver"); here parameter/argument is depend on mysql version --> need to download and add mysql.connector.jar file otherwise throw error
// (2) Create Connection -> Connection con = DriverManager.getConnection("url", 'username', 'password') --> where Url for MySQL is -> jdbc:mysql://localhost:3306/db.name username and password by default is "root"
// (3) Create Statement -> PreparedStatement ps = con.prepareStatement("sql query");
// (4) Execute SQL statement -> (1) ps.excuteQuery(); -> select query return ResultSet (if ResultSet contains any value that means successfully result get values otherwise values not retrieve)
//                              (2) ps.executeUpdate(); -> insert, update, delete query return int (if int is positive then successfully update otherwise not updated)
// (5) Process the result -> To check the result by if/else statement or other technique
// (6) Close the connection -> con.close(); or ps.close(); --> we can also close connection by PreparedStatement close() method or Connection close() method

// PreRequeries software and files for connection:-
// (1) installed JDK
// (2) installed any IDE(i.e. eclipse etc..) (must downloaded and added mysql-connector.jar file in respected project)
// (3) installed MySQL-8 

public class JDBCIntroduction {
	public static void main(String[] args) throws Exception {

		String name = "Devraj";
		String email = "dev@321gmail.com";
		String password = "Dev@321";
		String gender = "male";
		String city = "Mumbai"; // User values from client this values we are storing in Database

		Class.forName("com.mysql.cj.jdbc.Driver"); // Load driver class by external jar file path -> Step (1)
		System.out.println("Driver Class loaded successfully -> Step 1 Done");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root"); // Create-Connection
//         By urlPath of installed database and its username and password, If the password or syntax is wrong it will show the exception and its return Connection -> Step (2) 																					
		System.out.println("Successfully database connected -> Step 2 Done");

//		PreparedStatement ps = con
//				.prepareStatement("insert into register values('dev','dev@gmail.com', 'dev123', 'male', 'Indore')"); // Create-Statement and directly set/put the inserting value
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)"); // Create-Statement
//         By prepareStatement() method or we can also use some different methods like createStatement(), and some similar methods to create a statement and pass SQL query in parameter/argument it will return prepareSatetment -> Step (3)	
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, gender);
		ps.setString(5, city); // By using positional Parameter and set their position by setString() method

		int i = ps.executeUpdate(); // Execute prepared Statement Sql Query
// 		   By using the executeUpdate() method if the statement is like an update in the database it will return an int value and 
//         By using the executeQuery() method if the statement is like to get or retrieve any data from the database it will return resultSet -> Step (4)

		if (i > 0) { // process the result i.e. check the result output and verify it --> Step (5)
			System.out.println("Successfully insert the register table entry");
		} else {
			System.out.println("Fail to insert the register table entry");
		}

		ps.close(); // Close the connection by using close() method from prepared Statement but
//		con.close(); // we can Close the connection by using close() method also -> Step (6)
	}
}

// This sample JDBC-Connection project is separately created in the jdbcConnectionProject named project.
