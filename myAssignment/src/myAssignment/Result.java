package myAssignment;


public class Result implements Comparable<Result> {
	@Override
	public int compareTo(Result o) {
		// TODO Auto-generated method stub
		return this.getAmt().compareTo(o.getAmt());
	}
	String gender;
	Integer age;
	String bank;
	String td;
	Integer amt;
	public Result(String gender, Integer age, String bank, String td, Integer amt) {
		
		this.gender = gender;
		this.age = age;
		this.bank = bank;
		this.td = td;
		this.amt = amt;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getTd() {
		return td;
	}
	public void setTd(String td) {
		this.td = td;
	}
	public Integer getAmt() {
		return amt;
	}
	public void setAmt(Integer amt) {
		this.amt = amt;
	}

}