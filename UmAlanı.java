package Proje2.data_proje2;

public class UmAlanı {

	String name;
	String city;
	int year;

	UmAlanı(String name,String city, int year){
		this.name = name;
		this.city = city;
		this.year = year;

	}

	@Override
	public String toString() {
		return "{" +
			"name='" + name + '\'' +
			", city='" + city + '\'' +
			", year=" + year +
			'}';
	}
}
