package Calendar;
import java.util.*;

public class Ex10_1 {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
		System.out.println("�� ���� �⵵: " + today.get(Calendar.YEAR));
		System.out.println("��: " + today.get(Calendar.MONTH));
		System.out.println("�� ���� ��°��: " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� ��°��: " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("�̴��� ����: " + today.get(Calendar.DATE));
		System.out.println("�̴��� ���: " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("������ ����: " + today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("������ ����: " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("�̴��� ��° ����: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("���� ����: " + today.get(Calendar.AM_PM));
		
		//System.out.println("�ð�: " + today.get(Calendar.HOUR));whffu����\\
		
		System.out.println("�ð�: " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("��: " + today.get(Calendar.MINUTE));
		System.out.println("��: " + today.get(Calendar.SECOND));
		System.out.println("1000���� 1��: " + today.get(Calendar.MILLISECOND));
		
		System.out.println("timezone: " + today.get(Calendar.ZONE_OFFSET)/(60*60*1000));
		
		System.out.println("�̴��� ������ ��: " + today.get(Calendar.DATE));
				
	}

}
