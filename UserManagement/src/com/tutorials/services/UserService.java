package com.tutorials.services;


import javax.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.tutorials.dao.UserDao;
import com.tutorials.User;

@SuppressWarnings("hiding")
@Path("/userService")
public class UserService {
	
	
	private List<User> userList = null;
	UserDao userdao = new UserDao();
	
	@GET
	@Path("/users")
	//@Produces(MediaType.APPLICATION_XML)
	//@Produces("application/xml")
	//@Produces(MediaType.APPLICATION_JSON)
	
	/*@Produces(MediaType.APPLICATION_JSON)
	public String getUsers() {
		return "user Name";
	} */
		//return userList.;
	@Produces({MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML})
	public List<User> getUsers() {
		return (userList = (ArrayList<User>) userdao.getAllUsers());
		//return userList.;
	
	} 
	
	
}
