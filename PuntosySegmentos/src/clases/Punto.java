package clases;

public class Punto {
	
		private int x;
		private int y;
		
		public Punto () {
			
			this.x = 0;
			this.y = 0;
			
		}
		
		public Punto (int x, int y) {
			
			this.x = x;
			this.y = y;
			
		}
		
		public int getX () {
			
			return this.x;
			
		}
		
		public int getY () {
			
			return this.y;
			
		}
		
		public void setX (int newX) {
			
			this.x = newX;
			
		}
		
		public void setY (int newY) {
			
			this.y = newY;
			
		}
		
		public String toString () {
			
			return "( " + this.x + " , " + this.y + " )";
		}

}
