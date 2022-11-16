package verify.exam18;

public class ShopService {
	private ShopService() {}
	
	private static ShopService service = new ShopService();
	
	public static ShopService getInstance(){
		return service;
	}
}
