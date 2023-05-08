package com.yedam.variable;

public class varialbe02 {
	public static void main(String[] args) {
		
		// 2진수 사용
		int var1 = 0b1011; // -> b : binary(2진수)
		int var2 = 0206; // 8진수
		int var3 = 365;	// 10진수
		int var4 = 0xB3; // 16진수
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		
		// 정수타입의 범위
		// byte -> -127 ~ 127
		// byte의 범위를 초과한 값을 넣어보자
		// 오류로 인한 주석처리 byte bVar1 = 300;
		byte bVar2 = 3;
		System.out.println(bVar2);
		
		// Long 
		// JAVA는 기본적으로 정수형 변수를 int로 인식한다. 
		// int로 표현 할 수 있는 범위안이면 괜찮지만 그 이상으로 가면 오류가 발생한다. 
		// 때문에 long을 사용하기 위해선 숫자뒤에 'L'을 붙여줘야지 오류가 발생하지 않는다.
		// int의 범위 : -2,147,483,648 ~ 2,147,483,647
		long lVar1 = 20000000;
		long lVar2 = 200000000000000L;
		
		// Char 
		char c1 = 'a';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		System.out.println("=======Char=====");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		// escape 문자
		// 문자열 String
		String name = "홍길동";
		String job = "프로그래머";
		
		// \t : tab1만큼 띄워라
		// \n : enter 
		// \\ : 특수한 문자 사용(\) -> \자체를 사용하기 위해 사용 
		// \" : 특수한 문자 사용(") -> \"내용\" 출력 -> "내용" 
		// \" 부터 다음 \"까지 
		
		System.out.println(name + "\n" + job);
		System.out.println("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다");
		System.out.println("봄\\여름\\가을\\겨울");
		
		// 실수 타입 
		// float, double 
		// 차이점 1. 정밀도(double이 더 높음) 
		// 		2. 기본값(default)값은 double이기 때문에 flaot은 변수값 뒤에 f를 붙여야한다.
		
		// float 
		float fVar = 3.14f;
		
		double dVar1 = 3.14;
		
		float fVar2 = 0.12345632423232f;
		double dVar2 = 0.23923942932932;
		
		System.out.println("fVar2 : " + fVar2);
		System.out.println("dVar2 : " + dVar2);
		// float는 표시할 수 있는 범위값 이상의 소수점 자리는 버리고 표시한다. 
		// 버리는건 아니고 부동소수점 이후 다시 
		
		// 실수 타입에서의 e의 사용 
		// e=10, 뒤의 수는 10의 지수를 표현한다.
		float fVar3 = 3e-3f; // 3 * (0.001)
		double dVar3 = 3e6; //  3 * (10의 6승)
		System.out.println("fVar :" + fVar3);
		System.out.println("dVar :" + dVar3);
		
		// 논리 타입(Boolean)
		boolean stop = true;
		if(stop) {
			System.out.println("멈춥니다.");
		} else {
			System.out.println("달립니다.");
		}
	}
}
