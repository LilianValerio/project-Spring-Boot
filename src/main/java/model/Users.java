package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.el.parser.AstListData;

public class Users {

	private Integer Id;
	private String name;
	private Date dateStart;
	public static List<Users> listUsers;
	
	static {
		carregarUsers();
	}
	
	public Users() {
		
	}
	
	public Users(Integer id, String name, Date dateStart) {
		super();
		Id = id;
		this.name = name;
		this.dateStart = dateStart;
	}
	
	private static void carregarUsers() {
		listUsers = null;
	}



	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateStart() {
		return dateStart;
	}
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((dateStart == null) ? 0 : dateStart.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (dateStart == null) {
			if (other.dateStart != null)
				return false;
		} else if (!dateStart.equals(other.dateStart))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	public static List<Users> getListUsers() {
		return listUsers;
	}



	public static void setListUsers(List<Users> listUsers) {
		Users.listUsers = listUsers;
	}





}
