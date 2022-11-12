package sec13.exam01_class_access.package2;

import sec13.exam01_class_access.package1.publicB;

public class CallClass {
	//defaultA a;
	//A가 default 접근제한자기 때문에 package2에선 호출 불가능
	publicB b;
	//B는 public 접근제한자기 때문에 사용가능 (import는 당연히 해야됨!)
}
