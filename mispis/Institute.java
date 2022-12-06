import java.util.ArrayList;

public class Institute {

	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String name;
	public String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void open(){

	}
	public void close(){

	}

	public Integer showRating(){
		return 50;
	}

}