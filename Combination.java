public class Combination {

    private int a;
    private int b;
    private int c;

    public Combination( int first, int second, int third ) {
        a = first;
        b = second;
        c = third;
    }

    public boolean equals( Combination other ) {
        return ((other!=null)&&(a==other.a)&&(b==other.b)&&(c==other.c));
    }

    public String toString() {
        return(a+":"+b+":"+c);
    }
}