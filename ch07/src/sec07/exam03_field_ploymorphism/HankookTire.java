package sec07.exam03_field_ploymorphism;

//�θ� �����ڿ� �Ű��������� �ֱ⶧���� super�����ڸ� ������ ������ ������ ����
public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ���� : " + (maxRotation - accumulatedRotation));
			return true;
		}
		System.out.println("*** " + location + "HankookTire ������ �ٵǾ����ϴ� ***");
		return false;
	}
}
