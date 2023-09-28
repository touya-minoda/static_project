package practice;

import java.util.Arrays;
import java.util.Random;


public class PracticeSwitch {

	public static void main(String[] args) {
		
		int[] members = new Random().ints(10,0,5).toArray();
		
		System.out.println( Arrays.toString(members) );

		for (int i = 0; i < members.length; i++) {
			int num = 0;
			num = members[i];

			switch (num) {
			case 1:
				System.out.println("勇者");
				break;
			case 2:
				System.out.println("バトルマスター");
				break;
			case 3:
				System.out.println("パラディン");
				break;
			case 4:
				System.out.println("海賊");
				break;
			case 5:
				System.out.println("魔法剣士");
				break;
			default:
				System.out.println("見習い");
				break;
			}
		}
	}
}
