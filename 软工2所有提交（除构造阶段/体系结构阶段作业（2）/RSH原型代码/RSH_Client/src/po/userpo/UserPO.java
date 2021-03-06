package userpo;
import java.io.Serializable;

public class UserPO implements Serializable{
	String id;
	String password;
	String nickName;
	String imageAddress;
	int level;
	MemberType menberType;
	String name;
	Sexuality sexuality;
	String phone;
	String eMail;
	int credit;
	public UserPO(String id,String password, String nickName, String imageAddress, int level, MemberType menberType, String name,
			Sexuality sexuality, String phone, String eMail, int credit) {
		this.id = id;
		this.password = password;
		this.nickName = nickName;
		this.imageAddress = imageAddress;
		this.level = level;
		this.menberType = menberType;
		this.name = name;
		this.sexuality = sexuality;
		this.phone = phone;
		this.eMail = eMail;
		this.credit = credit;
	}
	public String getId() {
		return id;
	}
	public String getPassword(){
		return password;
	}
	public String getNickName() {
		return nickName;
	}
	public String getImageAddress() {
		return imageAddress;
	}
	public int getLevel() {
		return level;
	}
	public MemberType getMenberType() {
		return menberType;
	}
	public String getName() {
		return name;
	}
	public Sexuality getSexuality() {
		return sexuality;
	}
	public String getPhone() {
		return phone;
	}
	public String geteMail() {
		return eMail;
	}
	public int getCredit() {
		return credit;
	}
}
