package chapter10;

public interface RemoteControl {
	// ��� �ʵ�
		public int MAX_VOLUME = 10; // public�� ��� ���� ���� ������ ���ڴ� ��� ǥ��
		public int MIN_VOLUME = 0; // public�� ��� ���� ����

		// �߻� �޼ҵ�
		public void turnOn();

		public void turnOff();

		public void setVolume(int volume);

		//����Ʈ �޼ҵ�
		default void setMute(boolean mute) {
			if (mute) {
				System.out.println("���Ұ� ���·� �����մϴ�.");
			} else {
				System.out.println("���Ұ� ���¸� �����մϴ�.");
			}
		}
		
		//���� �޼ҵ�
		static void changeBattery() {
			System.out.println("�������� ��ȯ�մϴ�.");
		}
}