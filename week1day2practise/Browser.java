package week1day2practise;

public class Browser {
		
	protected String launchbrowser (String browsername) {
		System.out.println("Browser "+browsername+" Launched");
		return browsername;
		}
		
	protected void loadurl()
	{System.out.println("Url is loaded");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Browser	br = new Browser();
	
	String browsername = br.launchbrowser("Firefox")	;
	System.out.println(browsername);
	br.loadurl();
		
	}

}
