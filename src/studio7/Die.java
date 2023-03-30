package studio7;

public class Die {
	private int n;
	
	public int Die(int n){
		this.n = n;
		return (int)((Math.random()*this.n)+1);
	}
	
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}

}
