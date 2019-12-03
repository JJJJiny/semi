package shareOclock.Member;

public class MemberDTO {
	private String mb_img;
	private String mb_nickname;
	private String mb_pw;
	private String mb_name;
	private String mb_email;
	private String mb_group;
	private String mb_phone;
	private String check;
	public MemberDTO() {
		super();
	}
	public MemberDTO(String mb_img, String mb_nickname, String mb_pw, String mb_name, String mb_email, String mb_group,
			String mb_phone, String check) {
		super();
		this.mb_img = mb_img;
		this.mb_nickname = mb_nickname;
		this.mb_pw = mb_pw;
		this.mb_name = mb_name;
		this.mb_email = mb_email;
		this.mb_group = mb_group;
		this.mb_phone = mb_phone;
		this.check = check;
	}
	public String getMb_img() {
		return mb_img;
	}
	public void setMb_img(String mb_img) {
		this.mb_img = mb_img;
	}
	public String getMb_nickname() {
		return mb_nickname;
	}
	public void setMb_nickname(String mb_nickname) {
		this.mb_nickname = mb_nickname;
	}
	public String getMb_pw() {
		return mb_pw;
	}
	public void setMb_pw(String mb_pw) {
		this.mb_pw = mb_pw;
	}
	public String getMb_name() {
		return mb_name;
	}
	public void setMb_name(String mb_name) {
		this.mb_name = mb_name;
	}
	public String getMb_email() {
		return mb_email;
	}
	public void setMb_email(String mb_email) {
		this.mb_email = mb_email;
	}
	public String getMb_group() {
		return mb_group;
	}
	public void setMb_group(String mb_group) {
		this.mb_group = mb_group;
	}
	public String getMb_phone() {
		return mb_phone;
	}
	public void setMb_phone(String mb_phone) {
		this.mb_phone = mb_phone;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	
}
