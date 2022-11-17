package verify.exam20;

import java.util.Scanner;

public class BankApplicationExam {
	private static BankApplication[] accountArray = new BankApplication[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("---------------------------------");
			System.out.print("���� > ");
			
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
				System.out.println("�ý����� �����մϴ�.");
			}
		}
	}

	private static void widthDraw() {
		System.out.println("----------");
		System.out.println("����");
		System.out.println("----------");
		System.out.print("���¹�ȣ : ");
		String ano = sc.next();
		System.out.print("���ݾ� : ");
		int money = sc.nextInt();
		
		BankApplication account = findAccounnt(ano);
		if(account == null) {
			System.out.println("��� : ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("��� : ��ݵǾ����ϴ�.");
	}

	//���� �޼ҵ�
	private static void deposit() {
		System.out.println("----------");
		System.out.println("����");
		System.out.println("----------");
		System.out.print("���¹�ȣ : ");
		String ano = sc.next();
		System.out.print("���ݾ� : ");
		int money = sc.nextInt();
		
		BankApplication account = findAccounnt(ano);
		if(account == null) {
			System.out.println("��� : ���°� �����ϴ�.");
			return;
		} 
		account.setBalance(account.getBalance() + money);
		System.out.println("��� : �ԱݵǾ����ϴ�.");
			
	}
	
	//���¹�ȣ ã�� �޼ҵ�
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

	//���� ��� �޼ҵ�
	private static void accountList() {
		System.out.println("----------");
		System.out.println("���¸��");
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

	//���� ���� �޼ҵ�
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("���»���");
		System.out.println("----------");
		
		System.out.print("���¹�ȣ : ");
		String ano = sc.next();
		
		System.out.print("������ : ");
		String owner = sc.next();
		
		System.out.print("�ʱ��Աݾ� : ");
		int balance = sc.nextInt();
		
		BankApplication newAccount = new BankApplication(ano, owner, balance);
		for(int i =0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}
}
