package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader ("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			
			String str = br.readLine();
			
			if (str == null) {
				break;
			}
			
			String[] d = str.split(",");
			
			String name = d[0];
			String hp = d[1];
			String company = d[2];
			
			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사 " + company);
			System.out.println("");
			
			
			
			
		}
		
		br.close();
		
		
		
		
		
		

	}

}
