package com.bootjpa.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


/* Makes the Alien as the entity*/

@Entity
public class Alien {
		
	/* Makes the below given names as the attributes */
	
		@Id
		private int aid;
		private String aname;
		
		public int getAid() {
			return aid;
		}
		public void setAid(int aid) {
			this.aid = aid;
		}
		public String getAname() {
			return aname;
		}
		public void setAname(String aname) {
			this.aname = aname;
		}
		@Override
		public String toString() {
			return "Alien [aid=" + aid + ", aname=" + aname + "]";
		}
		
		
		
}
