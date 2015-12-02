package singleton;


/**
 * “皇帝”类，皇帝只有一个
 * @author barcelona
 *
 */
public class Emperor {

	/**
	 * Singelon模式类的构造函数必须为私有化
	 */
	private Emperor() {
		// TODO Auto-generated constructor stub
	}
	
	
	private static Emperor emperor = null;
	
	public static synchronized Emperor getEmperor() {
		
		/**
		 * 懒加载
		 */
		if ( emperor == null ) {
			
			emperor = new Emperor();
		}
			
		return emperor;
	}
	
}
