package july20;

public class GTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      GenericTree gt=new GenericTree();
      // 10 3 20 2 50 0 60 0 30 0 40 1 70 0
      gt.display();
     System.out.println("***********************");
      System.out.println(gt.size());
      //System.out.println(gt.height());
//      System.out.println("***********************");
//      gt.preorder();
//      System.out.println("***********************");
//      gt.postorder();
//      System.out.println("***********************");
      gt.levelorder();
      System.out.println("***********************");
      gt.levelorderlw();
      System.out.println("***********************");
      gt.levelorderzz();
//      System.out.println("***********************");
//      gt.printAtLevel(2);
//      System.out.println("***********************");
//      gt.levelOrderR();
	}

}
