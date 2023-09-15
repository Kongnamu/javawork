package objectarray.dogs;

public class DogArray {

	public static void main(String[] args) {
		// Dog 인스턴스 4개를 생성해서 배열에 저장하고 
		// 정보를 출력하세요
		
		Dog[] kind = new Dog[4];
		
		// 객체 생성(저장)
		kind[0] = new Dog("백구", "비숑");
		kind[1] = new Dog("깜둥", "불독");
		kind[2] = new Dog("룽지", "푸들");
		kind[3] = new Dog("구름", "말티즈");
		
		for(int i=0; i<kind.length; i++) {
			System.out.println(kind[i].getName() + ", "
			 + kind[i].getType());
        }
		
		System.out.println("==================================");
		
		// 향상된 for문
		for(Dog dog : kind) {
		System.out.println(dog.getName() + "," + dog.getType());
		}
		
		

	}

}
