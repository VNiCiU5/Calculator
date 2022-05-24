package br.com.vim.calc;

public class Message {
	
	
	public static void msg(int hour) {
		
		switch (hour) {
		case 5: 
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			
		msgGoodMorning();
		
		break;
		
		
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			
		msgGoodAfternoon();
			
		break;
		
		case 18: 
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 0:
		case 1: 
		case 2:
		case 3:
		case 4:
		
		msgGoodNight();
		
		break;
			default:
				System.out.println("invalid time clock");
		break;
		}
	}
	
	public static void msgGoodMorning() {
		System.out.println("good morning ! ");
	}
	public static void msgGoodAfternoon() {
		System.out.println("good afternoon ! ");
	}
	public static void msgGoodNight() {
		System.out.println("good night ! ");
	}
}
