package com.epam.TDD;

public class RemoveAInFirstTwoPlaces {

	public String remove(String string) {
		StringBuilder result=new StringBuilder("");
		int n=Math.min(2,string.length());
		for(int i=0;i<n;i++) {
			if(string.charAt(i)!='A') result.append(string.charAt(i)+"");
		}
		if(string.length()>2) result.append(string.substring(2));
		return result.toString();
	}

}
