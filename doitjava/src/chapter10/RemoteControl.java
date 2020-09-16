package chapter10;

public interface RemoteControl {
	// 상수 필드
		public int MAX_VOLUME = 10; // public은 없어도 관계 없음 기울어진 글자는 상수 표시
		public int MIN_VOLUME = 0; // public은 없어도 관계 없음

		// 추상 메소드
		public void turnOn();

		public void turnOff();

		public void setVolume(int volume);

		//디폴트 메소드
		default void setMute(boolean mute) {
			if (mute) {
				System.out.println("음소거 상태로 설정합니다.");
			} else {
				System.out.println("음소거 상태를 해제합니다.");
			}
		}
		
		//정적 메소드
		static void changeBattery() {
			System.out.println("건전지를 교환합니다.");
		}
}
