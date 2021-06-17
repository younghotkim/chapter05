package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		
		//파일을 읽는다 --> 한줄씩 --> 출력
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<Person> pList = new ArrayList<Person>();
		
		while(true) {
		
			String line = br.readLine(); //한줄씩 읽는다
			
			if(line == null) {
				break;
			}
			
			String[] pInfo = line.split(","); //자른다 (new String)
			
			String name = pInfo[0];
			String hp = pInfo[1];
			String company = pInfo[2];
			
			Person p = new Person(name, hp, company); // 메모리에 p라는 인스턴스 생성
			
			pList.add(p); // List에 p 추가
			
			
			
		}
		
		for(int i=0; i<pList.size(); i++) {
			
			System.out.println("이름: " + pList.get(i).getName());
			System.out.println("핸드폰: " + pList.get(i).getHp());
			System.out.println("회사: " + pList.get(i).getCompany());
			System.out.println("");
		}
		
		System.out.println("정우성정보: " + pList.get(1).getName() + "," + pList.get(1).getHp());
		
		br.close();
		
		Person p2 = new Person("김영하","010-1111-2222","0000");
		
		pList.add(p2);
		
		for(int i=0; i<pList.size(); i++) {
			
			System.out.println("이름: " + pList.get(i).getName());
			System.out.println("핸드폰: " + pList.get(i).getHp());
			System.out.println("회사: " + pList.get(i).getCompany());
			System.out.println("");
		}
		
		Writer fw = new FileWriter ("C:\\javaStudy\\file\\newDB.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		for (int i = 0; i<pList.size(); i++) {
		
			bw.write(pList.get(i).getName() + "," + pList.get(i).getHp() + "," + pList.get(i).getCompany());
			bw.newLine();
		}
	
		
		bw.close();

	}

}
