class tt {
    int lenght;
    int breath;

    tt(int l, int b) {
        this.lenght = l;
        this.breath = b;
    }

    public int area()
    {
        return lenght * breath;
    }
}
 public class assignment3{
    public static void main(String[] args) {
        tt obj = new tt(4,5);
        tt obj1 = new tt(5,8);

        System.out.println(obj.area());
        System.out.println(obj1.area());

    }


}