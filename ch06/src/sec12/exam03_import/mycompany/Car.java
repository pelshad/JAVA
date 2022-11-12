package sec12.exam03_import.mycompany;

//import sec12.exam03_import.hyundai.* 패키지의 전체 클래스 가져옴
import sec12.exam03_import.hankook.*;
import sec12.exam03_import.hyundai.Engine; // 패키지의 해당 클래스만 가져옴
import sec12.exam03_import.kumho.*;



public class Car {
	Engine engine = new Engine();
	//그냥 작성시 컴파일 에러
	//import 해야됨(지금은 hyundai의 Engine class를 사용)
	//단축키 ctrl + shift + O
	
	//만약 단축키로 해당 클래스만 가져오는게 아닌 *을 나오게 하고 싶은 경우
	/*	1. window > preference>java>codeStyle>organize imports
		2. number of imports needed for .*의 99를 1로 변경
		3. ctrl+shift+o를 클릭 */
	
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	// Tire tire3 = new Tire();
	// hankook, kumho 패키지마다 Tire Class가 있어 어느쪽 class인지 몰라서 에러
	// 해결 방법
	// 1. import sec12.exam03_import.kumho.Tire
	// 단, import시 다른 Tire class를 추가하면 안됨!
	// 2. sec12.exam03_import.kumho.Tire tire3 = 
	// new sec12.exam03_import.kumho.Tire();
	// 추가적인 import 선언이 없어도 사용가능
}
