public class Test {
    public static void main(String[] args) {
        MyDate md1 = new MyDate(15,2,2011);
        MyDate md2 = new MyDate(23,4,1002);
        MyDate md3 = new MyDate(15,2,2011);

        System.out.println(md1.equals(md2));
        System.out.println(md1.equals(md3));

        System.out.println("Hashcode md1 = "+md1.hashCode());
        System.out.println("Hashcode md2 = "+md2.hashCode());
        System.out.println("Hashcode md3 = "+md3.hashCode());
    }
}
