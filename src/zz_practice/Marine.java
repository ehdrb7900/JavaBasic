package zz_practice;

public class Marine {
	int x, y=0; // Marine의 위치좌표(x,y) 
	int hp = 60; // 현재 체력 
	static int weapon = 6; // 공격력 
	static int armor = 0; // 방어력

	static void weaponUp(){ 
		weapon++;
	}

	void armorUp(){ 
		armor++;
	}

	void move(int x, int y) { 
		System.out.println(this.x);
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		m1.weaponUp();
		m2.armorUp();
		System.out.println(weapon);
		Marine m3 = new Marine();
		System.out.println(armor);
		

	}

}
