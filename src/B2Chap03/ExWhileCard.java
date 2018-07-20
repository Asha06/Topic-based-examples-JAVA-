package B2Chap03;
//Page no:3.8

public class ExWhileCard<T> {
	private T t;
	public void  setValue(T t){
		this.t=t;
	}
	public T getValue(){
		return t;
	}
	public boolean compare(ExWhileCard<? extends String> wcd){
		if(t==wcd.t)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExWhileCard<String> obj1=new ExWhileCard<String>();
		obj1.setValue("Demo");
		
		ExWhileCard<String> obj2=new ExWhileCard<String>();
		obj2.setValue("Demo");
		
		System.out.println("Value of first object: "+obj1.getValue());
		System.out.println("Value of second objcet: "+obj2.getValue());
		
		System.out.println("Are both equal? "+obj1.compare(obj2));	
	}
}
