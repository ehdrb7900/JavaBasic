package e_oop;

import java.util.Arrays;

public class BluetoothSpeaker {
	
	boolean power;			// 전원
	boolean mode;			// 모드 선택 -> true : 블루투스, false : AUX
	boolean isMute;			// 음소거 여부
	int volume;				// 음량 (0 ~ 30)
	int volumeTemp;			// 음량 임시 저장 (음소거시)
	String[] registDiv = new String[15];	// 등록된 기기 리스트
	int registNum;			// 등록된 기기 개수
	String pairing;			// 페어링된 기기
	
	BluetoothSpeaker() {	//	생성자
		power = false;
		volume = 10;
		mode = true;		//	블루투스 모드
	}
	
	void power(){			// 전원 On / Off
		if(power){
			System.out.println("전원이 꺼졌습니다.");
			pairing = null;
		} else {
			System.out.println("전원이 켜졌습니다.");
		}
		power = !power;
	}
	
	void info(){			// 정보 출력
		if(power){
			System.out.println("전원 : On");
		} else {
			System.out.println("전원 : Off");
		}
		
		if(mode){
			System.out.println("모드 : 블루투스" );
		} else {
			System.out.println("모드 : AUX");
		}
		
		System.out.println("음량 : " + volume);
		System.out.println("등록된 기기 : " + registNum + "개");
		
		System.out.print("페어링 된 기기 : ");
		
		if(pairing == null) {
			System.out.println("현재 페어링 된 기기가 없습니다.");
		} else {
			System.out.println(pairing);
		}
		
		
	}
	
	void volumeUp(){		// 음량 증가
		if(power && volume < 30){
			volume++;
			System.out.println("음량 : " + volume);
		}
	}
	
	void volumeDown(){		// 음량 감소
		if(power && volume > 0){
			volume--;
			System.out.println("음량 : " + volume);
		}
	}
	
	void mute(){			// 음소거
		if(power){
			if(isMute){
				volumeTemp = volume;
				volume = 0;
				System.out.println("volume : " + "(mute)");
				
			} else {
				volume = volumeTemp;
				System.out.println("volume : " + volume);
			}
		}
	}
	
	void regist(String machineName){		// 기기 등록
		if(power){
			if(registNum < 15){
				registDiv[registNum++] = machineName;
			} else {
				System.out.println("등록 가능한 개수를 초과하였습니다.");
			}
		}
	}
	
	void remove(String machineName){		// 기기 삭제
		if(power){
			boolean equals = false;
			int i;
			for(i = 0; i < registDiv.length; i++){
				if(machineName.equals(registDiv[i])){
					equals = true;
					break;
				}
			}
			
			if(equals){
				for(int j = i + 1; j < registDiv.length; j++){
					if(j == registDiv.length - 1){
						registDiv[j] = null;
						registNum--;
					} else {
						registDiv[j - 1] = registDiv[j];
					}
					
				}
				System.out.println("기기 " + machineName + "이(가) 삭제되었습니다.");
			} else {
				System.out.println("해당 기기가 존재하지 않습니다. (" + machineName + ")");
			}
		}
	}
	
	void pairing(String machineName){		// 페어링
		if(power){
			for(int i = 0; i < registDiv.length; i++){
				if(machineName.equals(registDiv[i])){
					pairing = machineName;
					System.out.println("페어링 되었습니다. (" + pairing + ")");
					break;
				} else if(i == registDiv.length - 1){
					System.out.println("해당 기기가 존재하지 않습니다. (" + machineName + ")");
				}
			}
		}
	}
	
	String showPairing(){		// 페어링 된 기기 출력
		return pairing==null ? "페어링 된 기기가 없습니다." : pairing;
	}
	
	void changeMode(){		// 모드 변경
		if(mode){
			System.out.println("AUX모드로 변경되었습니다.");
		} else {
			System.out.println("Bluetooth모드로 변경되었습니다.");
		}
		mode = !mode;
	}
	
	public static void main(String[] args) {
		BluetoothSpeaker sp = new BluetoothSpeaker();
		
		sp.power();				//	전원 ON
		sp.volumeUp();			//	볼륨 증가
		sp.volumeUp();
		sp.volumeDown();		//	볼륨 감소
		sp.info();				//	정보 출력
		
		sp.regist("오동규Phone");		//	기기등록
		System.out.println(Arrays.toString(sp.registDiv));	//	등록된 기기 리스트(배열) 출력
		sp.pairing("오동규Phon");		//	페어링 (등록되지 않은 기기)
		sp.pairing("오동규Phone");	//	페어링 (등록되어 있는 기기)
		
		sp.mute();		//	음소거
		sp.info();		
		sp.changeMode();		//	모드 변경 ( Bluetooth -> AUX )
		sp.power();				//	전원 OFF (페어링 해제)
		sp.power();				//	전원 ON
		sp.mute();				//	음소거 해제
		sp.info();				
		
		sp.remove("오동규Phon");	//	기기 제거 (등록되지 않은 기기 제거)
		sp.remove("오동규Phone");	// 	기기 제거 (등록되어 있는 기기 제거)
		System.out.println(Arrays.toString(sp.registDiv));	// 기기 리스트 출력
		sp.info();
		
		
	}

}
