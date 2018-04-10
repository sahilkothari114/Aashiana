package com.aashiana;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aashiana.dto.Address;
import com.aashiana.dto.Booking;
import com.aashiana.dto.Duration;
import com.aashiana.dto.Facility;
import com.aashiana.dto.Hotel;
import com.aashiana.dto.PaymentStatus;
import com.aashiana.dto.Room;
import com.aashiana.dto.RoomStatus;
import com.aashiana.dto.RoomType;
import com.aashiana.dto.User;

public class aashianaTest {

	public static void main(String[] args) {
		User user = new User();
		user.setFirstName("jon");
		user.setLastName("targerion");
		user.setEmailAddress("jonsnow@ironthrone.com");
		user.setMobileNumber("9975754433");
		user.setDateOfBirth(new Date());
				
/*		//to fetch and display data from the db
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = session.get(User.class, 2);
		System.out.println(user.getFirstName()+" "+user.getLastName());
		*/
		
		
		//Testing hotel and room
		Hotel hotel = new Hotel();
		hotel.setHotelName("Name Of hotel");
		//this will add a room 
		Room rooms = new Room();
		rooms.setRoomNumber(11);
		rooms.setRoomStatus(RoomStatus.NOT_EMPTY);
		rooms.setRoomType(RoomType.SINGLE);
		rooms.setHotel(hotel); 		//for the mapping
		//this will add a room 
		Room rooms2 = new Room();
		rooms2.setRoomNumber(4);
		rooms2.setRoomStatus(RoomStatus.EMPTY);
		rooms2.setRoomType(RoomType.SINGLE);
		rooms2.setHotel(hotel);
		hotel.getroomList().add(rooms);  //for the mapping
		hotel.getroomList().add(rooms2);
		
		hotel.setRating(3);
		
		Address address = new Address();
		address.setStreet("street name");
		address.setCity("ahmedabad");
		address.setPincode("pincode");
		hotel.setAddress(address);
		
		Facility facility = new Facility();
		facility.setFacilityName("AC");
		Facility facility1 = new Facility();
		facility1.setFacilityName("Heater");
		Facility facility2 = new Facility();
		facility2.setFacilityName("sauna");
		hotel.getFacilityList().add(facility);
		hotel.getFacilityList().add(facility1);
		hotel.getFacilityList().add(facility2);
		facility.getHotelList().add(hotel);
		facility1.getHotelList().add(hotel);
		facility2.getHotelList().add(hotel);
		
		


		Booking booking  = new Booking();
		booking.getBookedRoomList().add(rooms);
		booking.setAmount(5000);
		booking.setPaymentStatus(PaymentStatus.PAID);		
		booking.setUser(user);
		booking.setBookingTime(new Date());
			
/*		Duration duration=new Duration();
	
		duration.setFrom(new Date());
		duration.setTo(new Date());
	    booking.setDuration(duration);
		booking.setDurationFrom(new Date());
		booking.setDurationTo(new Date()); */
		
		rooms.setBooking(booking);
		user.setBooking(booking);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			
			session.save(hotel);
			session.save(rooms);
			session.save(rooms2);
			session.save(facility);
			session.save(facility1);
			session.save(facility2);
			session.save(user);
			session.save(booking);
			

			session.getTransaction().commit();
		}catch(Exception e){
			session.getTransaction().rollback();
		}
		finally {
			session.close();
		}
			
		}

	}


