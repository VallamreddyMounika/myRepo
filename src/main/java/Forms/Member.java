package Forms;

public class Member {
	
	private String uName,uPass,uMail,uPhone;

	public Member() {
		super();
	}

	public Member(String uName, String uPass, String uMail, String uPhone) {
		super();
		this.uName = uName;
		this.uPass = uPass;
		this.uMail = uMail;
		this.uPhone = uPhone;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPass() {
		return uPass;
	}

	public void setuPass(String uPass) {
		this.uPass = uPass;
	}

	public String getuMail() {
		return uMail;
	}

	public void setuMail(String uMail) {
		this.uMail = uMail;
	}

	public String getuPhone() {
		return uPhone;
	}

	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}

}
