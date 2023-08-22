package challengeCh6;

/*ShopService obj1 = ShopService.getInstance();
ShopService obj2 = ShopService.getInstance();

if(obj1 = = obj2) {
  System.out.println("같은 ShopService 객체입니다.");
} else {
  System.out.println("다른 ShopService 객체입니다.");
}

위 예제코드가 실행되면 "같은 ShopService 객체입니다."라는 메시지가 출력되도록,
싱글톤 패턴을 사용해서 ShopService 클래스를 작성해보세요.

*/

public class ShopService {

  //싱글톤 패턴
  private static ShopService shopService = new ShopService();

  private ShopService() {}

  public static ShopService getInstance() {
    return shopService;
  }




}
