<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-mapping PUBLIC 
    "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
    "http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd">
    
    <hibernate-mapping>
    	<class name="com.pratik.domain.lucky_draw" table="coupendraw1">
    		<id name="coupenNumber" column="coupenno" type="string">
    		 <generator class="uuid"/>
    		</id>
    	<property name="customerName" column="custName"></property>
    	<property name="billAmount" column="bill_amount"></property>

    	</class>
    </hibernate-mapping>
