import java.util.*;
import java.io.*;

public class scan {
	public static void main(String args[]){
		File food = new File("foodList.txt");	

		try (Scanner in = new Scanner(food)){
			String temp = "";
			int counter = 0;
			while(in.hasNext()){
				String s = in.next();
				if(s.substring(s.length()-1).equals(",")){
					counter += 1;
					temp += s;
					temp = temp.substring(0, temp.length()-1);
					if(counter % 4 == 0){
						System.out.println(temp);
						temp = "";
					}
					else{
						temp +=  " ";
					}	
				}
				else if(counter % 4 == 3){
					temp += s;
					System.out.println(temp);
				}
				else{
					temp += s + " ";
				}	
			}
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
}
