package com.ssi.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssi.entities.Vehicle;

@Component
public class VehicleDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveVehicle(Vehicle vehicle){
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(vehicle);
		transaction.commit();
		session.close();
	}
	public void updateVehicle(Vehicle vehicle){
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(vehicle);
		transaction.commit();
		session.close();
	}
	public List<String> getAllRegnos(String email){
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Vehicle.class);
		Criterion crt=Restrictions.eq("transporter.email", email);
		criteria.add(crt);
		List<Vehicle> vlist=criteria.list();
		List<String> regnos=new ArrayList<String>();
		for(Vehicle v:vlist){
			regnos.add(v.getRegno());
		}
		return regnos;
	}
}
