package practice;

import java.util.ArrayList;
import java.util.List;

public class Chapter4 {

	public static void main(String[] args) {

		Task task1 = new Task("2021年10月21日", "牛乳を買う");
		Task task2 = new Task("2021年9月15日", "○○社面談");
		Task task3 = new Task("2021年12月4日", "手帳を買う");
		Task task4 = new Task("2021年8月10日", "散髪に行く");
		Task task5 = new Task("2021年11月9日", "スクールの課題を解く");
		
		// System.out.println(task1.getTodoDate() + ":" + task1.getTodoTask());
		
		List<Task> list = new ArrayList<Task>();
		
		list.add(task1);
		list.add(task2);
		list.add(task3);
		list.add(task4);
		list.add(task5);
		
		list.sort((d1, d2) -> d1.todoDate.compareTo(d2.todoDate) );
		
		for (int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i).todoDate + ":" + list.get(i).todoTask );
			
		}
	}
}
