package com.test.day14;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class WriteFile {

	
	public static void main(String[] args) {
		
		writeFile(args);
		
//		String path ="C:\\Sathish\\Oct2018";
//		
//		File file = new File(path);
//		
//		String[] fileNames = file.list();
//		
//		for (String string : fileNames) {
//			File tem= new File(path+File.separator+string);
//			
//			if(tem.isFile()){
//			System.out.println(string);
//			}
//			tem= null;
//		}
		
	}
	
	public static void list(String[] args) {
		
		String tmp="hi my first hi write first first first file hi program2 my  !!";
		
		String[][] arry= new String[50][50];
		
		//00 01
		//10 11
		//20 21
		
		String[] stringArry= tmp.split("\\s");
		
		
		for (int x = 0; x < stringArry.length; x++) {
			for (int y = 0; y < 2; y++) {
				
				if(isExisting(arry, stringArry.length,stringArry[x])){
					int getindx=getindx(arry, stringArry.length,stringArry[x]);
					int count= Integer.parseInt(arry[getindx][1]);
					arry[getindx][1] =String.valueOf(count+1);
					break;
				}else{
					arry[x][0]= stringArry[x];
					arry[x][1] ="1";
					break;
				}
				
				//System.out.print("  " +x+","+y);
			}
			
			//System.out.println();
		}
		
		for (int x = 0; x < arry.length; x++) {
			for (int y = 0; y < 2; y++) {
				if (arry[x][y] != null)
					System.out.print(arry[x][y] + "  ");
			}
			System.out.println();
		}

		System.out.println("");
		
	}
	
	
	
	private static boolean isExisting(String[][] arry, int length, String string) {

		for (int x = 0; x < length; x++) {
			for (int y = 0; y < 2; y++) {
				if(arry[x][y] == null)
						return false;
				if (arry[x][y].equals(string)) {
					return true;
				}
			}
		}

		return false;
	}
	
	private static int getindx(String[][] arry, int length, String string) {

		for (int x = 0; x < length; x++) {
			for (int y = 0; y < 2; y++) {
				if(arry[x][y] == null)
						return -1;
				if (arry[x][y].equals(string)) {
					return x;
				}
			}
		}

		return -1;
	}


	public static void writeFile(String[] args) {
		Random radom=new Random();
		
		int rdm= radom.nextInt(500);
		
		String tmp="hi my first write file program2  !!" + "\n\n"+ rdm;
		try {
			BufferedOutputStream out= new BufferedOutputStream(new FileOutputStream("C:\\Sathish\\Oct2018\\abc"+rdm+".txt"));
			
			out.write(tmp.getBytes());
			out.flush();
			out.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
