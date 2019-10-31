package e_oop;

public class TV {
	// TV를 대상으로 가능한 TV와 비슷하게 TV 클래스를 만들어주세요.
	
	boolean power;
	int volume;
	int channel;
	
	TV(){
		power = false;
		volume = 10;
		channel = 1;
	}
	
	void power(){
		power = !power;
	}
	
	void volumeUp(){
		if(power && volume < 30){
			volume++;
		}
	}
	
	void volumeDown(){
		if(power && volume > 0){
			volume--;
		}
	}
	
	void channelUp(){
		if(power && ++channel > 999){
			channel = 1;
		}
	}
	
	void channelDown(){
		if(power && --channel < 1){
			channel = 999;
		}
	}
	
	void channelSelection(int channel){
		this.channel = channel;
	}
	
	public static void main(String[] args) {
		TV t = new TV();
		System.out.println("전원 : " + t.power);
		System.out.println("음량 : " + t.volume);
		System.out.println("채널 번호 : " + t.channel);
		
		t.power();
		
		System.out.println("전원 : " + t.power);
		
		t.volumeUp();
		System.out.println("음량 : " + t.volume);
		t.volumeDown();
		t.volumeDown();
		System.out.println("음량 : " + t.volume);
		
		t.channelDown();
		System.out.println("채널 번호 : " + t.channel);
		t.channelUp();
		System.out.println("채널 번호 : " + t.channel);
		t.channelSelection(11);
		System.out.println("채널 번호 : " + t.channel);
		
		// 과제. 클래스 하나로 간단한 프로그램을 만들어주세요.
		// 발표 : 프로그램 주제, 기능, 메서드 구성, 시연
		
	}
	
}
