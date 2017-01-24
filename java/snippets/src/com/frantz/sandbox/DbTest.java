package com.frantz.sandbox;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.frantz.samples.JsonUtils;



public class DbTest {

	Connection m_Connection;
	String m_user;
	String m_pwd;
	String m_DBPath = "jdbc:mysql://vizibolic.com/vizibolic";

	public DbTest(String u, String p) {
		m_user = u;
		m_pwd = p;
	}

	@Override
	protected void finalize() throws Throwable {
		try {
			if (m_Connection != null) {
				m_Connection.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void connect() throws Exception {
		m_Connection = DriverManager.getConnection(m_DBPath, m_user, m_pwd);
	}
	public void insert(String q) throws Exception
	{
		Statement st = m_Connection.createStatement();
		for(int x=0;x<5;++x)
		{
			String ins = "insert into names values(" + 100+x +",'" + "last" + x + "'" + ",'first" + x + "')";
			System.out.println(ins);
			st.execute(ins);
		}
		
			
	}
	public void printResults() throws Exception {
		Statement st = m_Connection.createStatement();
		ResultSet res = st.executeQuery("select * from names");
		System.out.println("Names");
		while (res.next()) {
			int id= res.getInt("id");
			String firstName = res.getString("first");
			String lastName = res.getString("last");
			System.out.println(id + " " + firstName + " " + lastName);
		}

	}
	
	public static void main(String[] args) {
		DbTest d = new DbTest("aaaa", "pinball");
		try {
			d.connect();
			//d.insert("test");
			d.printResults();
			
			System.out.println(JsonUtils.readJson("https://www.sbir.gov/api/solicitations.json?agency=DOD"));//?keyword=testing&agency=DOD");
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
