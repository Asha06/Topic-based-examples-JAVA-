package B2Chap03;
//page no:3.6

class ExGenericTypeInference<X,Y> {
	private X first;
	private Y second;
	
	public ExGenericTypeInference(X a1,Y a2){
		first=a1;
		second=a2;
	}
	public X getFirst(){
		return first;
	}
	public Y getSecond(){
		return second;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExGenericTypeInference<String,Integer> obj1=new ExGenericTypeInference<String,Integer>("Test",1);
		System.out.println("String is "+obj1.getFirst());
		System.out.println("Integer is "+obj1.getSecond());
		
		ExGenericTypeInference<Integer,String> obj2=new ExGenericTypeInference<Integer,String>(2,"Demo");
		System.out.println("String is "+obj2.getFirst());
		System.out.println("Integer is "+obj2.getSecond());
	}

}
