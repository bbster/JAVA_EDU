import javax.swing.JOptionPane;

public class Ex13_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ���� " + input + " �Դϴ�.");
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(99999);
			}catch(Exception e) {}
		}
	}
}
