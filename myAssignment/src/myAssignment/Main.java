package myAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import demoAssignment.Result;

public class Main {

	public static void main(String[] args) {
		ArrayList<bankAccount> ba = new ArrayList<>();
		ArrayList<bankTransactions> bt = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		try {
			File input1 = new File("C:\\Users\\dharshini-s\\OneDrive - HCL Technologies Ltd\\Attachments\\bankaccount.txt");
			Scanner d1 = new Scanner(input1);
			while (d1.hasNextLine()) {
				String[] data1 = d1.nextLine().split(",");
				ba.add(new bankAccount(data1[0], Integer.parseInt(data1[1]), data1[2], data1[3], data1[4],Integer.parseInt(data1[5])));
			}
			d1.close();
		} catch (FileNotFoundException e) {
			System.out.println("BankAccount File is not found");
			e.printStackTrace();
		}
		try {
			File input2 = new File("C:\\Users\\dharshini-s\\OneDrive - HCL Technologies Ltd\\Attachments\\banktransactions.txt");
		    Scanner d2 = new Scanner(input2);
		    while (d2.hasNextLine()) {
		    	String[] data2 = d2.nextLine().split(",");
		    	bt.add(new bankTransactions(data2[0],data2[1],Integer.parseInt(data2[2])));
		    }
		    d2.close();
		} catch (FileNotFoundException e) {
			System.out.println("Bank Transactions file is not found");
			e.printStackTrace();
		}
		System.out.println("Enter the input name");
		String inputName=sc.nextLine();
		System.out.format("%-15s%-15s%-15s%-15s%-15s%-20s%-20s\n","SNo","Name","Bank","Age","Gender","Transaction Date","Transaction Amount");
		int i = 1;
		List<Result> r = new ArrayList<>();
		for (bankAccount bao : ba) {
			if (bao.getName().equals(inputName)) {
				System.out.format("%-15d%-15s", i, inputName);
				for (bankTransactions bto : bt) {
					if (bao.getCn().equals(bto.getCn())) {
						r.add(new Result(bao.getGender(), bao.getAge(), bao.getBank(),bto.getTd(), bto.getAmt()));
					}
				}
				Collections.sort(r);
				for(Result o:r) {
					System.out.format("%-15s%-15d%-15s%-20s%-20d\n", o.getGender(), o.getAge(), o.getBank(),o.getTd(), o.getAmt());
					System.out.format("%-15s%-15s", " ", " ");
				}r.clear();break;
			}
		}i++;
	}
}