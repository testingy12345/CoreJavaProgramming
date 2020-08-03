package com.task.switchcase.may262020;

public class TaskContinue {
	public void taskContinue() {
		int u=89;
		for(int f=80;f<u;f++) {
			if(f==86) {
				continue;
			}
			System.out.println(f);
		}
		
	}
	

	public static void main(String[] args) {
		TaskContinue tc=new TaskContinue();
		tc.taskContinue();

	}

}
