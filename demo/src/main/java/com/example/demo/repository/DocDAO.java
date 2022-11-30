package com.example.demo.repository;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Doc;

@Repository
public class DocDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public Doc updateEmployee(Doc doc) {

		System.out.println("updateEmployee() invoked");
		Session session = null;
		Transaction transaction = null;
//		Doc isEmployeeupated = false;
		try {
			System.out.println("try block");
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Query query = session.createNamedQuery("DOC.updateEmployeeByEmpId");
			query.setParameter("NAME", doc.getEmpName());
			query.setParameter("COURSE", doc.getEmpCourse());
			query.setParameter("GENDER", doc.getEmpGender());
			query.setParameter("MAIL", doc.getEmpMail());
			query.setParameter("PHONE", doc.getEmpPhone());
			query.setParameter("DATE", doc.getEmpDate());
			query.setParameter("ADDRESS", doc.getEmpAddress());
			query.setParameter("DOCNAME", doc.getDocName());
			query.setParameter("DOCTYPE", doc.getDocType());
			query.setParameter("FILE", doc.getData());

			query.executeUpdate();
			transaction.commit();
//			isEmployeeupated = true;
//			return doc;
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
		return doc;
	
	
	}

}
