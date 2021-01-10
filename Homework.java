package Homework;

public class Homework1 {
	
	public static void main(String[] args) {
//      一	
		int i = 6; //b
		int j = 12;
		int master; //a
		String cartoon;

		
		System.out.println("6 + 12 =" + (i + j));
		System.out.println("6 * 12 =" + (i * j));
		
		System.out.println("==================");
		
//		二
		int eggnum = 200;
		int dozen = 12;
		
		System.out.println("200顆雞蛋有" + eggnum / dozen + "打，加" + eggnum % dozen + "顆");
		
		System.out.println("==================");
		
//		三
		/*先設定每天、小時、分鐘是幾秒*/
		int min = 60;
		int hour = 3600;
		int day = 86400;
		
		/*算出此秒數除以天、小時、分鐘後剩幾秒*/
		int s1 = 256559;
		int d1 = s1 % day;
		int h1 = d1 % hour;
		int m1 = h1 % min;
		
		System.out.print("256559秒是" + s1 / day + "天");
		System.out.print(d1 / hour + "小時");
		System.out.print(h1 / min + "分鐘");
		System.out.println(m1 + "秒");
		
		System.out.println("==================");
		
//		四
		final double PI = 3.1415;
		double r = 5.0;
		
		double lenth =  (r * 2) * PI;
		double area = Math.pow(r , 2) * PI;
		
		System.out.printf("圓周長為%.4f%n", lenth);
		System.out.printf("圓面積為%.4f%n", area);
		
		System.out.println("==================");
		
//		五
		int PV = 1_500_000;
		double rate = 1.02;
		double sum = PV * Math.pow(rate, 10);
		
		System.out.printf("10年後總金額為%.2f%n", sum);
		
		System.out.println("==================");
		
//		六
		System.out.println(5 + 5);  //+號兩邊皆為數字，因此為數字相加
		
		System.out.println(5 + '5'); //字元5對應ASCII值為53，加上數字5 答案是58
		
		System.out.println(5 + "5"); //+號兩邊為字串與數字相連接，因此為串接相加
		
		System.out.println("==================");
		
	}
}
