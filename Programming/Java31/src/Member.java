import java.io.Serializable;

@SuppressWarnings("serial")
public class Member implements Serializable {
	
	private String name;
	
	// this prevents the value from serializing
	// could be used on user private keys and etc i think
	transient private String secret;

	public Member(String name, String secret) {
		super();
		this.name = name;
		this.secret = secret;
	}

	public Member(String name) {
		super();
		this.name = name;
		this.secret = "private";
	}

	public Member() {
		super();
		this.name = "Jeff";
		this.secret = "private";
	}
	
	@Override
	public String toString() {
		// TODO auto generated stub
		return "Member [name=" + name + ", secret=" + secret + "]";
	}
}
