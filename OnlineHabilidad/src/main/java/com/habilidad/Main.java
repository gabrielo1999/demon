package com.habilidad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.habilidad.entidades.Personas;
import com.habilidad.entidades.Ranking;
import com.habilidad.entidades.Skill;

public class Main
{
	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
	
	static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	
	public static void main(String[]args) 
	{
		Personas persona1 = new Personas("gabriel");
		ingresoPersona(persona1);
		Personas persona2 = new Personas("andres");
		ingresoPersona(persona2);
		
		Ranking ranking1 = new Ranking(1);
		ingresoRanking(ranking1);
		Ranking ranking2 = new Ranking(2);
		ingresoRanking(ranking2);
		
		Skill skill = new Skill("programacion");
		ingresoSkill(skill);
		Skill skill2 = new Skill("auditar");
		ingresoSkill(skill2);
		
		
	}
	
	static void ingresoPersona(Personas persona) 
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(persona);
		session.getTransaction().commit();
		session.close();
	}
	
	static void ingresoRanking(Ranking ranking) 
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(ranking);
		session.getTransaction().commit();
		session.close();
	}
	
	static void ingresoSkill(Skill skill) 
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(skill);
		session.getTransaction().commit();
		session.close();
	}
	
	
	
	
	

}
