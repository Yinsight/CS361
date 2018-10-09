
public class Dijkstra {
	
	public static int gcd(int n, int m) {
		   if(m == n)
		      return m;
		   else if (m > n)
		      return gcd(m-n, n);
		   else
		      return gcd(m, n-m);
		}
	
	public static void main (String[] args) {
		int x=20, y=30;
		System.out.println (gcd(x,y));
	}

}
