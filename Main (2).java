class Main{
        public static void sun() {
                System.out.print( "Shine");
        }
        public static void summer (int temp) {
               if (temp > 100){ // I like the 100
               System.out.print("*");
               temp -= 1;
               summer(temp);
               }
        }
        public static void main(String[] args){
          summer(110);
          sun();
        }  
}        
