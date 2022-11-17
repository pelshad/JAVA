package verify.exam20;

import java.util.Scanner;

public class BankApplicationExam {
	private static BankApplication[] accountArray = new BankApplication[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택 > ");
			
			int selNo = sc.nextInt();
			
			if(selNo == 1) {
				createAccount();
			}
			if(selNo == 2) {
				accountList();
			}
			if(selNo == 3) {
				deposit();
			}
			if(selNo == 4) {
				widthDraw();
			}
			if(selNo == 5) {
				run = false;
				System.out.println("시스템을 종료합니다.");
			}
		}
	}

	private static void widthDraw() {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("예금액 : ");
		int money = sc.nextInt();
		
		BankApplication account = findAccounnt(ano);
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과 : 출금되었습니다.");
	}

	//예금 메소드
	private static void deposit() {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("예금액 : ");
		int money = sc.nextInt();
		
		BankApplication account = findAccounnt(ano);
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		} 
		account.setBalance(account.getBalance() + money);
		System.out.println("결과 : 입금되었습니다.");
			
	}
	
	//계좌번호 찾는 메소드
	private static BankApplication findAccounnt(String ano) {
		BankApplication account = null; 
		for(int i = 0; i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}

	//계좌 목록 메소드
	private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		for(int i = 0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				System.out.println(accountArray[i].getAno()
						+ "     " +
						accountArray[i].getOwner()
						+ "     " +
						accountArray[i].getBalance());
			}
		}
		
	}

	//계좌 생성 메소드
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		
		System.out.print("계좌주 : ");
		String owner = sc.next();
		
		System.out.print("초기입금액 : ");
		int balance = sc.nextInt();
		
		BankApplication newAccount = new BankApplication(ano, owner, balance);
		for(int i =0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}
}
