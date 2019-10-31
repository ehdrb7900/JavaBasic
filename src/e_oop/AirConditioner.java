package e_oop;

public class AirConditioner {
	
	// 온도가 18 ~ 30까지만 변경할 수 있게 해주시고,
	// 전원을 켰을 때만 버튼들이 작동되도록 메서드들을 변경해주세요.
	
	boolean power;// 전원
	int temperature; // 온도
	int airVolume; // 풍량
	
	AirConditioner() {
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	// 전원 버튼
	void power(){
		power = !power;
		if(power == true){
			System.out.println("전원 켜짐");
		} else {
			System.out.println("전원 꺼짐");
		}
	}
	
	// 온도+ 버튼
	void temperatureUp(){
		if(power && temperature < 30){
			temperature++;
		}
	}
	
	// 온도- 버튼
	void temperatureDown(){
		if(power && temperature > 18){
			temperature--;
		}
	}
	
	// 풍량 버튼
	void airVolume(){
		if(power && 3 < ++airVolume){
			airVolume = 1;
		}
	}

	public static void main(String[] args) {
		AirConditioner ac = new AirConditioner();
		ac.temperatureUp();
		System.out.println("전원 : " + ac.power);
		System.out.println("온도 : " + ac.temperature + "°C");
		
		ac.power();
		ac.temperatureUp();
		System.out.println("온도 : " + ac.temperature + "°C");
		ac.temperatureDown();
		ac.temperatureDown();
		System.out.println("온도 : " + ac.temperature + "°C");
		ac.airVolume();
		System.out.println("풍량 : " + ac.airVolume + "단계");
		ac.airVolume();
		System.out.println("풍량 : " + ac.airVolume + "단계");
		ac.airVolume();
		System.out.println("풍량 : " + ac.airVolume + "단계");
		ac.airVolume();
		System.out.println("풍량 : " + ac.airVolume + "단계");
		
		ac.power();
		ac.power();
		
		System.out.println("온도 : " + ac.temperature + "°C");
		System.out.println("풍량 : " + ac.airVolume + "단계");
		
	}

}
