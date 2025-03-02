package skp.IOC_App_git;


public class App {
	
	public static int sum(int x , int y) {
		return x+y;
	}
	
    public static void main(String[] args) {
    	
       int res = App.sum(100,200);
       System.out.println(res);
       
    }
    
}
