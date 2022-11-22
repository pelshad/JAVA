package sec07.exam04_array_management;

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
