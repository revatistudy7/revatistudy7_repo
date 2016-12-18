package com.tutorials;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class User  {

		private String name;
		private String profession;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getProfession() {
			return profession;
		}
		public void setProfession(String profession) {
			this.profession = profession;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(String name, String profession) {
			super();
			this.name = name;
			this.profession = profession;
		}
		
		
}
