import java.util.*;
import java.io.*;

public class scan {
	
//	File[] files = new File(	

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

/*		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT Files", "txt");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(parent);
		if(returnVal == JFileChooser.APPROVE_OPTION){
			chooser.getSelectedFile().getName();
		}

		File drink = new File(chooser.getSelectedFile().getName());	
*/
//		Collection<File> all = new ArrayList<File>();
		
		File drink = new File("drinkListOne.txt");		
//		try (Scanner sc = new Scanner(drink)){
		try (Scanner in = new Scanner(drink)){
			in.useDelimiter(", ");
			String temp = "";
			while(in.hasNext()){
				String d = in.next();
			/*	if(s.substring(s.length()-1).equals(",")){
					counter += 1;
					temp += s;
					temp = temp.substring(0, temp.length()-1);
				}
				else if(counter % 4 == 3){
					temp += s;
					System.out.println(temp);
				}
				else{
					temp += s + " ";
				}*/
				System.out.println(d);	
			}
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
}
