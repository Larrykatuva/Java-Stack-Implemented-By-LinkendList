
public class LinkStackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkStack ls = new LinkStack();
		
		ls.push(22, 30);
		ls.push(67, 45);
		ls.push(90, 11);
		ls.push(30, 34);
		ls.push(89, 31);
		
		System.out.println(ls.isEmpty()+"\n");
		
		ls.displayStack();

	}

}
