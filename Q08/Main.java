import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.print("何回サイコロをふる>");
		int num=new Scanner(System.in).nextInt();
		//boolean配列を作成する(配列変数名はisEven)
		for(int i=0;i<isEven.length;i++){
			int dice=new Random().nextInt(6)+1;
			System.out.println(dice);
			//配列に偶数だったらtrue,奇数だったらfalseを代入
		}
		System.out.println(Arrays.toString(isEven));
	}
}
