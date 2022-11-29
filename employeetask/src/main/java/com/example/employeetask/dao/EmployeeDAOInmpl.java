package com.example.employeetask.dao;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.employeetask.entity.EmployeeEntity;

@Repository
public class EmployeeDAOInmpl implements EmployeeDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean updateEmployee(EmployeeEntity employeeEntity) {
		System.out.println("updateEmployee() invoked");
		Session session = null;
		Transaction transaction = null;
		boolean isEmployeeupated = false;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Query query = session.createNamedQuery("EmployeeEntity.updateEmployeeByEmpId");
			query.setParameter("NAME", employeeEntity.getEmpName());
			query.setParameter("COURSE", employeeEntity.getEmpCourse());
			query.setParameter("GENDER", employeeEntity.getEmpGender());
			query.setParameter("MAIL", employeeEntity.getEmpMail());
			query.setParameter("PHONE", employeeEntity.getEmpPhone());
			query.setParameter("DATE", employeeEntity.getEmpDate());
			query.setParameter("ADDRESS", employeeEntity.getEmpAddress());
			query.setParameter("FILE", employeeEntity.getEmpFile());

			query.executeUpdate();
			transaction.commit();
			isEmployeeupated = true;
			return isEmployeeupated;
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session closed");

			} else {
				System.out.println("session not closed");
			}
		}
		return isEmployeeupated;
	}

}
