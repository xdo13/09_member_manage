package com.dino.dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
		public MemberDAO() {
	}
	
		private static MemberDAO instance = new MemberDAO();
		
		
		public static MemberDAO getInstance() {
				return instance;
		}
		
		Connection Conn =null;
		
		//커넥션 풀
		
	public Connection getConnection() throws Exception{
		
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/mysql");
		Connection conn = ds.getConnection();
		return conn;
	}

}
