package Out;

public class Out {
	private int outerIv = 0; // private 접근제어 instance variable
	static int outerCv = 0; // static 접근제어 class variable
	
	class InstanceInner{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
//		int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;  // Local variable
		final int LV = 0; // 상수
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;
			int liv4 = LV;
		}
	}
	
}
