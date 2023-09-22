package exeptions.resource;

public class MyResourceTest3 {

	public static void main(String[] args) throws Exception {
		//try ~ with ~ resource 문 : close()를 사용하지 않음
		try(MyResource res1 = new MyResource("res1");) {
		
		
		//System.out.println(res1.read1());
		//System.out.println(res1.read2());
		
		System.out.println(Integer.parseInt(res1.read1()));
		System.out.println(Integer.parseInt(res1.read2())); // 이대로 출력시 오류 발생
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
