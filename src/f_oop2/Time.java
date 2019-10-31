package f_oop2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(0 > hour || hour > 24){
			System.out.println("입력값이 범위를 벗어났습니다.");
		} else {
			this.hour = hour;
		}
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(0 > minute || minute > 60){
			System.out.println("입력값이 범위를 벗어났습니다.");
		} else {
			this.minute = minute;
		}
	}
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if(0 > second || second> 60){
			System.out.println("입력값이 범위를 벗어났습니다.");
		} else {
			this.second = second;
		}
	}
	
}
