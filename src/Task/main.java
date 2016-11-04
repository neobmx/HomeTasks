package Task;

public class main {
public static void main(String[] args) {
		
		int l = 6;
		int b = l + 1 + l;
		
		for(int i = 0; i < b; ++i) {
			
			if(i == l) {
				
				for(int j = 0; j < b; ++j) {
					System.out.print("*");
				}
				
			} else {
				
				for(int j = 0; j < b; ++j) {
					
					
					if (j == l) {
						
						System.out.print("*");
						
					} else {
						
						if (i < l) {
							if (j == l + i || j == l - i) {
								System.out.print("*");
							} else {								System.out.print(" ");
							}
						} else if (i > l) {
							
							if (j == i - l || j == b+l-1-i) {
								System.out.print("*");
							} else {
								System.out.print(" ");
							}
						}
						
					}
					
				}
				
			}
		
			
			
			
		
					System.out.println("");
		}
	}
}

