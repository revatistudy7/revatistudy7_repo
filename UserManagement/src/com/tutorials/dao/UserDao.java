package com.tutorials.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.tutorials.User;


public class UserDao {
	public List<User> getAllUsers() {
		List<User> userList = new ArrayList<User>();
		
		User u1 = new User(); u1.setName("name1"); u1.setProfession("prof1");
		User u2 = new User(); u2.setName("name1"); u2.setProfession("prof1");
		
		userList.add(u1);
		userList.add(u2);
		
		/*try{
			File file = new File("User.txt");
			if (!file.exists()) {
				User user = new User(1, "Manu","Teacher");
				userList = new ArrayList<User>();
				userList.add(user);
				saveUserList(userList);
			} else {
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				userList = (ArrayList<User>) ois.readObject();
				ois.close();
			}
			
		}catch(IOException e){
			e.printStackTrace();		
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		} */
		return userList;
	}
	
	private void saveUserList(List<User> userList) {
		try{
			File file = new File("Users.txt");
			FileOutputStream fos;
			
			fos = new FileOutputStream(file);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(userList);
			oos.close();
			
		} catch (FileNotFoundException  e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
