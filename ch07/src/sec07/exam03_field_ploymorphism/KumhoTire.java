package sec07.exam03_field_ploymorphism;

//�θ� �����ڿ� �Ű��������� �ֱ⶧���� super�����ڸ� ������ ������ ������ ����
public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire ���� : " + (maxRotation - accumulatedRotation));
			return true;
		}
		System.out.println("*** " + location + "KumhoTire ������ �ٵǾ����ϴ� ***");
		return false;
	}
}
