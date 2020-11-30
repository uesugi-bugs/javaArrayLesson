import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.print("単語を入れてね>");
		String word=new Scanner(System.in).next();
		//文字数をもとにchar配列を作成(配列変数名chars)
		char[] chars = new char[word.length()];
		for(int i=0;i<chars.length;i++){
			//配列にお尻の文字から詰めていく処理
			chars[chars.length-i-1] = word.charAt(i);
		}
		System.out.println(Arrays.toString(chars));
	}
}
