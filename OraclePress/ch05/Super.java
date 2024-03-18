class MySuper {

    int number;

    MySuper(int i) {
System.out.println("here in 1 var constructor");

        number = i;
    }

    // MySuper() {
    //     this.number = 1;
    // }
}



class MySub extends MySuper {

  int count;

    
    MySub(int count, int num) {
        super(num);
        System.out.println("here in 2 var constructor");


        this.count = count;

    }



    // (1) INSERT CONSTRUCTOR HERE
    //MySub() {}
    //MySub(int count) { this.count = count; }
    //MySub(int count) { super(); this.count = count; }
    //MySub(int count) { this.count = count; super(count); }
    MySub(int count) { this(count, count); }
    // MySub(int count) {
    //     //this(count, 0);
    //     super(count);
    // }

}

class Super {
    public static void main(String []args) {
        System.out.println("test");

        MySub mySub = new MySub(1,2);
    }
}
