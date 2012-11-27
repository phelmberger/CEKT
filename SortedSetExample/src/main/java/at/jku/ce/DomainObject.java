package at.jku.ce;

import java.util.UUID;

/*
 * This class represents a domain object
 */
public class DomainObject {
	
	private String uuid=
			UUID.randomUUID().toString();
	private String name;
	private String comment;
	

	/** 
	 * Default constructor 
	 */ 
	protected DomainObject() {
		super();
	}

	/***
	 * Constructor for the domain object
	 * @param id
	 * @param comment
	 */
	protected DomainObject(String id, String comment) {
	  super();
	  this.uuid = id;
	}
	
	public String getUuId() {
		   return uuid;
	}
	
	public String getComment() {
		   return comment;
		}
	
	public void setComment(final String comment)  {
		   this.comment = comment;
	}
	
	public String getName() {
		   return name;
		}
	public void setName(final String pname) {
	   this.name = pname;
	}
		
	public String toString() { 
		   return "DomainObject [name=" + name + ", comment=" + comment 
		           + ", uuid=" + uuid + "]"; 
	} 
}
