package com.userdefined.pojo2.june12020.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.userdefined.pojo1.june12020.EmpDetails;

public class BankEmployeeDetails {

	public static void main(String[] args) {
		List<BankDetails> l=new ArrayList<BankDetails>();
		BankDetails b=new BankDetails();
		b.setBankAccountHolder("XYZ");
		b.setIFSC("IPFS006");
		b.setBankBranch("BTM");
		b.setDepostiedaAmount(10000000);
		b.setWithDrawAmount(1000000f);
		b.setRemainingAmount(9000000f);
		

		BankDetails b1=new BankDetails();
		b1.setBankAccountHolder("ABC");
		b1.setIFSC("IPFS007");
		b1.setBankBranch("MADIWALA");
		b1.setDepostiedaAmount(1000000f);
		b1.setWithDrawAmount(100000f);
		b1.setRemainingAmount(900000f);
		
		BankDetails b2=new BankDetails();
		b2.setBankAccountHolder("MNO");
		b2.setIFSC("IPFS008");
		b2.setBankBranch("MARATHALLI");
		b2.setDepostiedaAmount(100000f);
		b2.setWithDrawAmount(10000f);
		b2.setRemainingAmount(90000f);
		
		l.add(b);
		l.add(b1);
		l.add(b2);
		
			
		for (BankDetails b3 : l) {
			System.out.println(b3.getBankAccountHolder());
			System.out.println(b3.getIFSC());
			System.out.println(b3.getBankBranch());
			System.out.println(b3.getDepostiedaAmount());
			System.out.println(b3.getWithDrawAmount());
			System.out.println(b3.getRemainingAmount());
			System.out.println("=======================================");
			
		}
		Map<Integer,BankDetails> l1=new HashMap<Integer,BankDetails>();

		
		BankDetails b4=new BankDetails();
		b4.setBankAccountHolder("XYZ");
		b4.setIFSC("IPFS006");
		b4.setBankBranch("BTM");
		b4.setDepostiedaAmount(10000000);
		b4.setWithDrawAmount(1000000f);
		b4.setRemainingAmount(9000000f);
		
		
		BankDetails b5=new BankDetails();
		b5.setBankAccountHolder("ABC");
		b5.setIFSC("IPFS007");
		b5.setBankBranch("MADIWALA");
		b5.setDepostiedaAmount(1000000f);
		b5.setWithDrawAmount(100000f);
		b5.setRemainingAmount(900000f);
		
		BankDetails b6=new BankDetails();
		b6.setBankAccountHolder("MNO");
		b6.setIFSC("IPFS008");
		b6.setBankBranch("MARATHALLI");
		b6.setDepostiedaAmount(100000f);
		b6.setWithDrawAmount(10000f);
		b6.setRemainingAmount(90000f);
		
		l1.put(1,b4);
		l1.put(2,b5);
		l1.put(3,b6);
		
		Set<Entry<Integer, BankDetails>> xy=l1.entrySet();
		for (Entry<Integer, BankDetails> bn : xy) {
			BankDetails value=bn.getValue();
			System.out.println(value);
			System.out.println(bn.getKey());
			System.out.println(bn.getValue().getBankAccountHolder());
			System.out.println(bn.getValue().getIFSC());
			System.out.println(bn.getValue().getBankBranch());
			System.out.println(bn.getValue().getDepostiedaAmount());
			System.out.println(bn.getValue().getWithDrawAmount());
			System.out.println(bn.getValue().getRemainingAmount());
			System.out.println("======================================================================");


			


			
		}


		
		
		
	}

}
