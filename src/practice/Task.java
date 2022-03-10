package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
	public LocalDate todoDate;  // タスク実行日
	public String todoTask;     // タスク内容

	// コンストラクタ
	public Task(String date, String todoTask) {
		this.todoDate = convertToLocalDate(date, "yyyy年M月d日");
		this.todoTask = todoTask;
	}

	// 文字列日付を LocalDate に変換
	public static LocalDate convertToLocalDate(String date,String format) {
		return LocalDate.parse(date, DateTimeFormatter.ofPattern(format));
	}

}
