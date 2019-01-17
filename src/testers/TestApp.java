package testers;

import java.sql.Date;
import java.util.ArrayList;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.phoenixair.pojos.FlightDetails;
import com.phoenixair.pojos.FlightUser;
import com.phoenixair.pojos.Passengers;
import com.phoenixair.pojos.Transactions;     





public class TestApp {

	public static void main(String[] args) {
		
		
		Date d= new Date(1989,1,10);
		
		FlightDetails fd= new FlightDetails();
		fd.setFrom_city("mumbai");
		fd.setTo_city("delhi");
		fd.setEconomyPrice(2000.00);
		fd.setBuisnessPrice(4000.00);
		fd.setNoofBuisnessSeats(11);
		fd.setNoofEconomySeats(63);
		
		FlightDetails fd1= new FlightDetails();
		fd1.setBuisnessPrice(9000.00);
		fd1.setEconomyPrice(4000.90);
		fd1.setNoofBuisnessSeats(10);
		fd1.setNoofEconomySeats(62);
		fd1.setFrom_city("chennai");
		fd1.setTo_city("pune");
		
		
		
		
		
		
		//FlightUser f1=new FlightUser();
		FlightUser f2=new FlightUser();
		
		
		f2.setFirst_name("nils");
		f2.setLast_name("nags");
		f2.setEmail("nil@nn.com");
		f2.setPassword("nil12");
		f2.setDob(d);
		f2.setContact(90990);
		
		
        Transactions t1=new	Transactions(12345, "09", "23", 34576.00,f2);
        Transactions t2=new	Transactions(12121, "10", "23", 29000.00,f2);
        Transactions t3=new	Transactions(21334, "12", "23", 6000.00,f2);
        Transactions t4=new	Transactions(54343, "04", "23", 3000.00,f2);
        
        List<Transactions> transactions= new ArrayList<Transactions>();
        transactions.add(t1);
        transactions.add(t2);
        transactions.add(t3);
        transactions.add(t4);
        
        
		
		  Passengers p1= new Passengers ("mr", "utsav", "gunjan", 9, f2,fd);
		  Passengers p2= new Passengers( "mrs", "rachel", "mathais", 11, f2,fd1);
		  Passengers p3= new Passengers( "mr", "winston", "fernandes", 71, f2,fd);
		  Passengers p4= new Passengers( "mr", "nilay", "nagar", 72, f2,fd);
		  
		  List<Passengers> passengers=new ArrayList<Passengers>(); 
		  passengers.add(p1);
		
		  passengers.add(p2);
		  passengers.add(p3);
		 
        
        
        
        
        
       	SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		try{
		//Get Session
		sessionFactory = utils.HibernateAnnotationUtil.getSessionFactory();
		session = sessionFactory.getCurrentSession();
		System.out.println("Session created");
		//start transaction
		tx = session.beginTransaction();
		//Save the Model object
		
		session.save(f2);
		session.save(t1);
		
		session.save(t2);
		
		session.save(t3);
		
		session.save(t4);
		
			
			  session.save(p1); 
			  session.save(p2); 
			  session.save(p3);
			  session.save(p4);
			  session.save(fd);
			  session.save(fd1);
			 
		
		
		
		//Commit transaction
		tx.commit();
		
		
		}catch(Exception e){
			System.out.println("Exception occured. "+e.getMessage());
			e.printStackTrace();
		}finally{
			if(!sessionFactory.isClosed()){
				System.out.println("Closing SessionFactory");
				sessionFactory.close();
			}
		}
	}



		

	}


