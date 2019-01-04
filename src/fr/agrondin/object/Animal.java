package fr.agrondin.object;

public class Animal {
	
	private Species sp;
	private String name;
	private Gender sexe;
	private int age;
	private Sale sale;	
	private int price;
	private String country;
	
	/*
	 * ====== Getter et Setter =====
	 */
	
	public String getId() {
		return id;
	}
	public Species getSp() {
		return sp;
	}
	public String getName() {
		return name;
	}
	public Gender getSexe() {
		return sexe;
	}
	public int getAge() {
		return age;
	}
	public Sale getSale() {
		return sale;
	}
	public int getPrice() {
		return price;
	}
	public String getCountry() {
		return country;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setSp(Species sp) {
		this.sp = sp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSexe(Gender sexe) {
		this.sexe = sexe;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

	/*
	 * ===== Constructeur =====
	 */

	protected Animal( Species sp, String name, Gender sexe, int age, Sale sale, int price, String country) {
		super();
		
		this.sp = sp;
		this.name = name;
		this.sexe = sexe;
		this.age = age;
		this.sale = sale;
		this.price = price;
		this.country = country;
	}

}
