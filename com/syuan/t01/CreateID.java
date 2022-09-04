package com.syuan.t01;

//import java.util.Arrays;

public class CreateID {	
	public int[] id = new int[11];
	public String county = "";
	public String gender = ""; 
	
	//隨機產生一個大寫英文字母
	public char randomEng() {
		//隨機產生一個65~90之間的數字
		int randomNum = (int)(Math.random() * 26) + 65;
		//將數字轉成英文
		char eng = (char)randomNum;
//		System.out.println(eng);
		
		return eng;
	}
	
	//將randomEng傳回的英文轉換成兩個數字
	public void changEngToNum(char eng) {
		char myEng = eng;
		int num1 = 0;
		int num2 = 0;
//		String s1 = "";Integer.toString(num1);
//		String s2 = "";Integer.toString(num2);
			
		switch (myEng) {
			case 'A':
				num1 = 1;
				num2 = 0;
				county = "台北市";
				break;
				
			case 'B':
				num1 = 1;
				num2 = 1;
				county = "台中市";
				break;
				
			case 'C':
				num1 = 1;
				num2 = 2;
				county = "基隆市";
				break;

			case 'D':
				num1 = 1;
				num2 = 3;
				county = "台南市";
				break;
				
			case 'E':
				num1 = 1;
				num2 = 4;
				county = "高雄市";
				break;
				
			case 'F':
				num1 = 1;
				num2 = 5;
				county = "新北市";
				break;
				
			case 'G':
				num1 = 1;
				num2 = 6;
				county = "宜蘭縣";
				break;
				
			case 'H':
				num1 = 1;
				num2 = 7;
				county = "桃園市";
				break;
				
			case 'I':
				num1 = 3;
				num2 = 4;
				county = "嘉義市";
				break;
				
			case 'J':
				num1 = 1;
				num2 = 8;
				county = "新竹縣";
				break;
				
			case 'K':
				num1 = 1;
				num2 = 9;
				county = "苗栗縣";
				break;
				
			case 'L':
				num1 = 2;
				num2 = 0;
				county = "台中縣";
				break;
				
			case 'M':
				num1 = 2;
				num2 = 1;
				county = "南投縣";
				break;
				
			case 'N':
				num1 = 2;
				num2 = 2;
				county = "彰化縣";
				break;
				
			case 'O':
				num1 = 3;
				num2 = 5;
				county = "新竹市";
				break;
				
			case 'P':
				num1 = 2;
				num2 = 3;
				county = "雲林縣";
				break;
				
			case 'Q':
				num1 = 2;
				num2 = 4;
				county = "嘉義縣";
				break;
				
			case 'R':
				num1 = 2;
				num2 = 5;
				county = "台南縣";
				break;
				
			case 'S':
				num1 = 2;
				num2 = 6;
				county = "高雄縣";
				break;
				
			case 'T':
				num1 = 2;
				num2 = 7;
				county = "屏東縣";
				break;
				
			case 'U':
				num1 = 2;
				num2 = 8;
				county = "花蓮縣";
				break;
				
			case 'V':
				num1 = 2;
				num2 = 9;
				county = "台東縣";
				break;
				
			case 'W':
				num1 = 3;
				num2 = 2;
				county = "金門縣";
				break;
				
			case 'X':
				num1 = 3;
				num2 = 0;
				county = "澎湖縣";
				break;
				
			case 'Y':
				num1 = 3;
				num2 = 1;
				county = "陽明山";
				break;
				
			case 'Z':
				num1 = 3;
				num2 = 3;
				county = "連江縣";
				break;
				
			}
			
			id[0] = num1;
			id[1] = num2;
//			s1 = Integer.toString(num1);
//			s2 = Integer.toString(num2);
//			System.out.print(s1 + s2);
		}
	
	//隨機產生1, 2, 8 ,9之間的一個數字
	public int randomNum3() {
		int[] num1 = {1, 2, 8, 9};
		//隨機產生一個0~3之間的數字
		int r = (int)(Math.random() * 4);
		id[2] = num1[r];
		
		switch (id[2]) {
		case 1:
			gender = "本國男性";
			break;
			
		case 2:
			gender = "本國女性";
			break;
			
		case 8:
			gender = "外國男性";
			break;
			
		case 9:
			gender = "外國女性";
			break;
			
		}
		
		return num1[r];
	}
	
	//隨機產生7個數字
	
	public void randomNum4To10() {
		for (int i = 0; i < 7; i++) {
			//隨機產生0-9之間的數字, 存進陣列
			id[i+3] = (int)(Math.random() * 10);
			 
			System.out.print(id[i+3]);
		}
	}
	
	//產生第9個數字(檢查碼)
	public void checkNum() {
		int num = 9;
		int sum = 0;
		int checkNum = 0;
		for (int i = 1; i < 10; i++) {
			sum += id[i] * num;
//			System.out.println(id[i] + "*" + num + "=" + sum);
			num--;
		}
		sum += id[0];
//		System.out.println(sum);
		
		checkNum = 10-sum % 10;
		
		if(checkNum > 0 && checkNum < 10){
			id[10] = checkNum;
			
		} else {
			id[10] = 0;
			
		}
		
		System.out.println(id[10]);
//		System.out.println(Arrays.toString(id));
		
	}

	//產生隨機身分證字號
	public void createIDNums() {
		
		//產生第1位英文
		char eng = randomEng();
		System.out.print(eng);
		//將英文轉換為數字(計算檢查碼用)
		changEngToNum(eng);
		//產生第1個數字
		System.out.print(randomNum3());
		//產生第2-8位數字
		randomNum4To10();
		//產生第9個數字(檢查碼)
		checkNum();
		
		System.out.println("這是 " + gender + " 的身分證字號, 其出生戶籍/申請地在 " + county);
	}
	
	public static void main(String[] args) {
		
		CreateID createID = new CreateID();
		createID.createIDNums();
	
	}
}
