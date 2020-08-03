package com.task.switchcase.may262020;

public class TaskBreak {
	public void taskBreak() {
		int m=45;
		for(int z=35;z<=m;z++) {
			if(z==39) {
				break;
			}
			System.out.println(z);
			
		}
		System.out.println("Outside the Loop");
		System.out.println("Statement After for Loop");
	}

	public static void main(String[] args) {
		TaskBreak tb=new TaskBreak();
		tb.taskBreak();

	}

}
