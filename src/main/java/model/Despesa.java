package model;

import java.util.Date;

public class Despesa {
	
	private Integer id;
	private String name;
	private Long valor;
	private Date dateStart;
	private String  Ativa ;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getValor() {
		return valor;
	}
	public void setValor(Long valor) {
		this.valor = valor;
	}
	public Date getDateStart() {
		return dateStart;
	}
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	public String getAtiva() {
		return Ativa;
	}
	public void setAtiva(String ativa) {
		Ativa = ativa;
	}
	
	
	

}
