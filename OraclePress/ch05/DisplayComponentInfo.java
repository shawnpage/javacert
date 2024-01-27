class Component {

  static public String getComponentName() { return "Mastery"; }

  public long getId() { return 12345; }

}



class Question extends Component {

  static public String getComponentName() { return "QWS"; }

  public long getId() { return 54321; }

}



public class DisplayComponentInfo {

  public static void main(String[] args) {

    Question question = new Question();

    Component component = question;

    System.out.println("|" + component.getComponentName() + "|" + question.getComponentName() +

                       "|" + component.getId()     + "|" + question.getId() + "|");

  }

}

a. The code will fail to compile.

b. The code will compile and print |QWS|Mastery|12345|54321| at runtime.

c. The code will compile and print |Mastery|QWS|12345|54321| at runtime.

d. The code will compile and print |QWS|QWS|12345|12345| at runtime.

e. The code will compile and print |Mastery|Mastery|12345|54321| at runtime.

f. The code will compile and print |QWS|QWS|12345|12345| at runtime.

g. The code will compile and print |Mastery|QWS|54321|54321| at runtime.
