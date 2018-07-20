package B2Chap03;

public class ExGenericClass <T>{
	private T t;
	public void setValue(T t)
	{
		this.t=t;
	}
	public T getValue(){
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExGenericClass<Integer> iobj=new ExGenericClass<Integer>();
		iobj.setValue(10);
		System.out.println(iobj.getValue());
		ExGenericClass<String> obj=new ExGenericClass<String>();
		obj.setValue("Ten");
		System.out.println(obj.getValue());
	}

}
