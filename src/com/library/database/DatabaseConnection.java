package com.library.database;

import com.mysql.jdbc.Statement;

public interface DatabaseConnection {
	
	Statement doConnection();

}
