package Day06.Ex02_Encapsulation;

/**
 * 통장계좌
 * - 예금주
 * - 예금액
 * - 계좌번호
 * - 은행명
 * 
 */

public class Account {

	private int deposit;
	private String depositor;
	private String depoNumber;
	private String bank;
	
	// 기본 생성자
	public Account() {
		this(0, "예금주 없음", "00000000-00-000000", "은행없음");
	}

	// 모든 매개변수가 있는 생성자
	public Account(int deposit, String depositor, String depoNumber, String bank) {
		this.deposit = deposit;
		this.depositor = depositor;
		this.depoNumber = depoNumber;
		this.bank = bank;
	}

	// getter, setter
	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public String getDepositor() {
		return depositor;
	}

	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}

	public String getDepoNumber() {
		return depoNumber;
	}

	public void setDepoNumber(String depoNumber) {
		this.depoNumber = depoNumber;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	// toString
	@Override
	public String toString() {
		return "Account [deposit=" + deposit + ", depositor=" + depositor + ", depoNumber=" + depoNumber + ", bank="
				+ bank + "]";
	}
	
	
	
}


