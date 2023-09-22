package funcinterface.lamdaint;

public class MyNumber2Test {

	public static void main(String[] args) {

		MyNumber2 myNum;
		
		//getMax() 람다식으로 구현
		/*myNum = (x, y) -> {
			return (x >= y) ? x : y;
		};*/
		
		//return 생략 가능
		myNum = (x, y) -> (x >= y) ? x : y;
		
		//getMax() 호출
		System.out.println("더 큰수는 " + myNum.getMax(11, 5));
		
	}

}
