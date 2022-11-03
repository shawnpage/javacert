// Add any necessary import statements here



public class TestClass {

    public static void doesThisCompile(boolean check) {
        var question = 0;
        question = 1;
        var answer = -1;
        if (check) {
            answer = 2;
        } else {
            answer = 3;
        }
        System.out.println(answer);
    }

    // public void twoTypes() {
    //     int a, var b = 3;  // DOES NOT COMPILE
    //     var n = null;      // DOES NOT COMPILE
    // }
    
    public static void main(String[] args) {
      // Add test code here
 
      // Add any print statements here

       int mythis = 10;
       System.out.println("Hello, World!");

       boolean check = false;
       doesThisCompile(check);
       
   }
}
