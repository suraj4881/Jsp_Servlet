package in.demo.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STDTAB")
public class Students {

	@Id
	@Column(name="stdId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sid;
	
	
	@Column(name="stdName",length = 20)
	private String sname;
	
	
	
	@Column(name="stdAddr",length = 20)
	private String saddress;
	
	
	@Column(name="stdAge")
	private Integer sage;
	
	
	public Students() {
		System.out.println("Hibernate uses Zero argument constructor internally");
		
	}
	
	public Integer getSid() {
		return sid;
	}
	
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String getSaddress() {
		return saddress;
	}
	
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	
	public Integer getSage() {
		return sage;
	}
	
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", sage=" + sage + "]";
	}
	
	
	
}
