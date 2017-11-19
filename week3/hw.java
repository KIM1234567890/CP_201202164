package week3;

import java.util.Scanner;

public class hw {
	
	public static void main(String[] args) {
		

		System.out.println("============과제1 시작============");
		
		Scanner sc = new Scanner(System.in);
		
		int rand, num, win = 0, lose = 0, dr = 0;
		String com = "", user ="";
		
		while(true) {
			
			if(win == 3) {
				System.out.println("user win");
				break;
			}
			
			else if(lose == 3) {
				System.out.println("com win");
				break;
			}
			
			else {
				System.out.println("가위 바위 보 중 입력하라");
				rand = (int)(Math.random()*10) + 1;
				num = rand % 3;
				
				if(num == 0)
					com = "보";
				else if(num == 1)
					com = "가위";
				else
					com = "바위";			
				
				user = sc.nextLine();
				System.out.println("너는 " + user);
				System.out.println("컴퓨터는 " + com);
				
				if( (com.equals("보")&&user.equals("보")) ||
						(com.equals("바위")&&user.equals("바위")) ||
						(com.equals("가위")&&user.equals("가위"))) {
					System.out.println("무승부");
					dr++;
				}
				
				else if( (com.equals("보")&&user.equals("가위")) ||
						(com.equals("바위")&&user.equals("보")) ||
						(com.equals("가위")&&user.equals("바위"))) {
					System.out.println("니가 이김");
					win++;;
				}
				
				else if( (com.equals("보")&&user.equals("바위")) ||
						(com.equals("바위")&&user.equals("가위")) ||
						(com.equals("가위")&&user.equals("보"))) {
					System.out.println("니가 짐");
					lose++;
				}
				
				else 
					System.out.println("잘못 입력");
				
				System.out.println(win+""+"승 "+""+lose+"패 "+ ""+dr+""+"무 ");			
			}			
		}
		
		System.out.println("============과제1 끝============");		
		System.out.println("============과제2 시작============");
		
		//1900 01 01 은 월요일, %4 == 0 && %100 != 0 && %400 ==0 윤년
		
		//int an = 1900;
		//int mon = 1;
		//int day = 1;

		int anint = 0, monint = 0, dayint = 0;
		
		while(true) {
			
			System.out.print("년: ");
			anint = sc.nextInt();	
			
			if(anint < 1900) {
				System.out.println("년의 값은 1900이상의 값을 입력해 주세요");
			}
			
			else {
				System.out.println("입력하신 년도는 " + "" + anint + "년 입니다");
				break;
			}
		}
		
		while(true) {
			
			System.out.print("월: ");
			monint= sc.nextInt();
			
			if((monint < 1) || (monint > 12)) {
				System.out.println("월의 값은 1이상 12이하의 값으로 입력하여 주세요");
				continue;
			}
			
			else {
				System.out.println("입력하신 달은 " + "" + monint + "" + "월 입니다");
				break;
			}
		}
				
		while(true) {			
						
			System.out.print("일: ");
			dayint = sc.nextInt();
			
			if(monint == 2) {
						
				
				if((anint % 4 == 0)&&(anint % 100 != 0)||(anint % 400 == 0)) {
					//1-29
					
					
					if((dayint < 1) || (dayint > 29)) {
						System.out.println("윤년입니다 1에서 29사이의 수 입력하여주세요");
					}
					else {
						System.out.println("입력하신 일은 " + "" +  dayint + "" + "입니다");
						break;
					}
				}
				
				else {
					if((dayint < 1) || (dayint > 28)) {
						System.out.println("윤년이 아닙니다 1에서 28사이의 수 입력하세요");
					}
					else {
						System.out.println("입력하신 일은 " + "" +  dayint + "" + "입니다");
						break;
					}
					//1-28
				}
			} // 2월 종료		
			
			else if((monint == 4) || (monint == 6) || (monint == 9) || (monint == 11)) {
				
				if((dayint < 1) || (dayint > 30)) {
					System.out.println("1에서 30사이의 수 입력하세요");
				}
				
				else {
					System.out.println("입력하신 일은 " + "" +  dayint + "" + "입니다");
					break;
				}
			}
			
			else {
				if((dayint < 1) || (dayint > 31)) {
					System.out.println("1에서 31사이의 수 입력하세요");
				}
				
				else {
					System.out.println("입력하신 일은 " + "" +  dayint + "" + "입니다");
					break;
				}
			}
		}
		
		int th = 0;
		
		for(int ann = 1900; ann < anint; ann++) {
					
			if((ann % 4 == 0)&&(ann % 100 != 0)||(ann % 400 == 0))
				th += 366;
			else
				th += 365;
		}
		
		for(int monn = 1; monn < monint; monn++) {
			
			if(monn == 2) {
				
				if((anint % 4 == 0)&&(anint % 100 != 0)||(anint % 400 == 0)) {
					th += 29;
				}
				
				else 
					th += 28;
			}
							
			
			else if((monn == 4)||(monn == 6)||(monn == 9)||(monn == 11)) 
				th += 30;			
		
			else 
				th += 31;
		}
		
		int dat = th + dayint - 1;
		
		System.out.print("1900년 1월 1일은 월요일이며, 그 날로 부터 " + "" + dat + "일이 지났다. 따라서 " + anint + "년 " + "" + monint + "" +"월  " + "" + dayint + "일은 ");
		
		int dow = dat & 7;
		
		switch(dow) {
		
		case 0:
			System.out.println("월요일이다");
			break;
		
		case 1:
			System.out.println("화요일이다");
			break;
			
		case 2:
			System.out.println("수요일이다");
			break;
			
		case 3:
			System.out.println("목요일이다");
			break;
			
		case 4:
			System.out.println("금요일이다");
			break;
			
		case 5:
			System.out.println("토요일이다");
			break;
			
		case 6:
			System.out.println("일요일이다");
			break;
					
		}
				
		System.out.println("============과제2 끝============");
		
		
	}
}
