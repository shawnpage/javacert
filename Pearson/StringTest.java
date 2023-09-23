public class StringTest {


    public static void main (String args[]) {
        
        int i = 0;

        String s = "Values: ";

        loop: while (i < 5) {
            if (i++ % 2 == 0) continue loop;

            s.concat(", ")
                .concat(Integer.toString(i)); // line n1
        }
        
        System.out.println(s);
    }
}


// What is the result?
// A) Values: 1, 3
// B) Valeus: 2, 4
// C) Values:
// D) Compilation fails at line n1
// E) The program runs forever with no output
