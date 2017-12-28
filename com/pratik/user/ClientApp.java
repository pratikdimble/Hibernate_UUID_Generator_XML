package com.pratik.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pratik.domain.lucky_draw;
import com.pratik.utility.HibernateUtil;

public class ClientApp {

	public static void main(String[] args) 
	{
		Session ses = null;
		lucky_draw coupen = null;
		Transaction tx = null;

		ses = HibernateUtil.getSession();
				
		coupen=new lucky_draw();
	//	coupen.setCoupenNumber("Bajaj002");
		coupen.setCustomerName("Rohit");
		coupen.setBillAmount(80000);


		try {
			tx = ses.beginTransaction();
			ses.save(coupen);
			tx.commit();
			System.out.println("object is saved");
			//System.out.println("\n\t***Generated ID Value::: "+id);
		} catch (Exception e) {
			tx.rollback();

		}
		ses.close();

		System.out.print("\n\t\t ==PROGRAMME BY PRATIK DIMBLE==\n\n\n");

		

	}

}
