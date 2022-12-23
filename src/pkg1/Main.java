package pkg1;
import java.util.*;
/*
 * 예외처리
 *  - 예외: 실행 오류
 *  - 처리: -> 오류에 대비한다는 느낌 -> if 조건문을 작성
 *  
 *  예제1) 산술 예외 상황 만들기
 *   - 사용자가 입력한 정수를 0으로 나누는 계산을 하기
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.print("하나의 정수를 입력하세용:");
			
		int b = a.nextInt();
		int result = 0;
		int c;
		System.out.println("두번째 정수를 입력하세용:");
		c = a.nextInt();
		
		if(c == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			result = b / c;
		System.out.println("사용자가 입력한 정수는 " + b + "이고," );
		System.out.println("정수 " + c + "로 나눈 결과는 " + result + "입니다." );
		}
 
		a.close();
		System.out.println("=====================================");
		/*
		 * 배열을 사용하는 경우에도 실행 오류가 발생할 수 있음~
		 * 예) 자료형[] 배열명 = new 자료형[방개수];
		 * 예) int[] arr = new int[3];
		 * -> arr[변수명]: 위험한 명령어 -> 변수의 값에 따라 오류가 발생
		 * 	-> 변수의 값 0~2인 경우 정상 실행
		 * 	 -> 다른 경우 오류 발생
		 */
		int[] arr = {10,20,40};
		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 40;
	//	arr[3] = 30;
		
		
	//	for(int i = 0; i < arr.length; i++) {
		//	System.out.println(arr[i]);
		
	//	String 클래스가 갖고 있는 charAt() 메소드 사용하기
	//	 - char: 하나의 문자, at: 전치사 -> String 클래스 내부에 있는 char 배열에서 가져옴
	//	  - "문자열".charAt(char배열의방번호 또는 인덱스);
	//	   - "abcd".charAt(0);
	//		- "abcd" 문자열은 char 배열에 다음처럼 저장되어 있습니다.
	// 	 	 -{'a','b','c','d'};
		
		char[] arr2 = {'a','b','c','d'};
	//	'a' 문자를 읽으려면 arr2[0]
		System.out.println("배열 arr2의 첫 번째 문자는 " + arr2[0]);
	//	'b' 문자를 읽으려면 arr2[1]
		System.out.println("배열 arr2의 두 번째 문자는 " + arr2[1]);
		System.out.println("배열 arr2의 세 번째 문자는 " + arr2[2]);
		System.out.println("배열 arr2의 네 번째 문자는 " + arr2[3]);
		
		System.out.println("=====================================");
		
		
		
	
	//	System.out.println("없는 방 번호인 4를 사용해서 문자를 읽어오면 " + arr[4]);
		
	//	 - charAt() 메소드의 기능: 내부적으로 갖고 있는 char 배열에 하나의 문자 반환
	// 	  - 사용자는 가져오고 싶은 문자의 위치인 인덱스를 지정해야 합니다.
	//	   - 형식) char 변수명 = "abcd".charAt(0);
	//		- "값": 컴파일 시에 String 클래스를 사용해서 힙 메모리에 객체를 생성
	//		 - new String("abcd")
		
		
		//charAt() 메소드를 사용하기: 없는 방 번호인 4를 사용하기
		//value = "abcd".charAt(4);
		//System.out.println("없는 방 번호인 4를 사용해서 문자를 꺼내오면 " + value);
		
		/*
		 * 실행 오류가 발생하면 프로그램이 강제 종료
		 *  - 비정상적인 종료
		 * 	 - 프로그램이 멈춘 상태
		 * 	  - 다시 실행하기 위해서는 다시 실행을 해야 함.
		 * 	   - 예외처리를 하면 실행 오류가 발생해도 다시 다른 명령어를 실행
		 *      - 개발자가 실행 흐름을 다시 생성
		 *      
		 * 1) 예외처리의 기본 문법
		 *  - 형식: try{}
		 *   - 내부적으로 if조건문이 생성됩니다.
		 */
		try {
			//주의사항: { }를 무조건 해야 함. -> 기본적으로 여러 명령어를 실행(집합 구조)
			//실행 오류가 발생할 가능성이 있는 명령어를 작성
			int result3 = 5 / 0;
			//프로그램이 실행될 때 자바에서 예외가 발생한 것을 알아차린 후
			//실행 흐름을 catch{} 내부로 강제 이동
		}catch(java.lang.ArithmeticException e1) {
			//try{} 내부에서 실행 오류가 발생하는 경우, 이동할 지점을 작성
			//catch{} 형식
			//- catch(예외종류를 선언) {명령어;}
			// - 예외종류는 옴총 많아서 주로 Exception 클래스를 사용
			//	- 이유: 모든 실행 오류의 부모클래스이기 때문에
			//	- 예외종류 중 하나: ArithmeticException(5/0)
			
			//변수 e에는 예외 관련 정보가 저장
			String msg = e1.getMessage();
			System.out.println("예외 관련 정보는 " + msg);
			
			//printStackTrace() 메소드를 사용하면 메소드 호출 관련 내용 모두 볼 수 있음.
			// - 시작 main() -> 다른 메소드 호출
			e1.printStackTrace();
			
			
		}
		
//		없는 방 번호(인덱스)인 4를 사용해서 실행 오류가 발생하는지를 확인하기
			int index2 = 4;
			if(index2 >= 0 && index2 < arr2.length) {
				System.out.println("방 번호는 0 이상이고 " + arr2.length + " 보다 하나 적음");
				System.out.println(arr2[index2]);
			}else {
				System.out.println("사용할 수 없는 방 번호 입니다.");
			}
			
		
		String d = "abcd";
		String e = new String("abcd");
		System.out.println(d);
		System.out.println(e);
	
	//charAt() 메소드 사용해서 "abcd" 문자열에서 첫 번째 문자인 a를 가져오기
		char value = "abcd".charAt(0);
		System.out.println("abcd 문자열에서 첫 번째 문자를 꺼내오면 " + value);
		
		value = "abcd".charAt(1);
		System.out.println("abcd 문자열에서 두 번째 문자를 꺼내오면 " + value);
		
		value = "abcd".charAt(2);
		System.out.println("abcd 문자열에서 세 번째 문자를 꺼내오면 " + value);
	
		value = "abcd".charAt(3);
		System.out.println("abcd 문자열에서 네 번째 문자를 꺼내오면 " + value);
	
		System.out.println("==================================");
		
	}
		
		
		
	}
