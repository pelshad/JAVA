package sec11.exam02_static_final;

public class Earth {
	//��� = static final field
	//�̸��� ���� �빮�ڰ� ����
	//�ܾ� ���ս� _�� �����Ѵ�.
	//���� ���. 1.���� 2.static���
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SERFACE_AREA;
	static {
		EARTH_SERFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		// * Math.PI���� �ڹٿ��� �����ϴ� ��
		// Math class�� PI ����� �ҷ��´�.(�� �� ���� static final)
	}
}
