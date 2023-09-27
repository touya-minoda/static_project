package practice;

public class PracticeSwitch {

	public static void main(String[] args) {
		int[] members = { 1, 2, 3, 4, 5, 4, 2, 3, 1, 5 };

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
