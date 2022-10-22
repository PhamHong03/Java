public class Test {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println("Min mm = "+mm.timMin(5,8));
        System.out.println("Min mm = "+mm.timMin(3.4,2.4));
        System.out.println("Tinh tong = "+mm.tinhTong(34,65));
        double[] arr = new double[] {1,23,6,3};
        System.out.println("Tinh tong arr ="+mm.tinhTong(arr));
    }
    // Overloading: Ta viết những phương thức có tên giống nhau nhưng giá trị truyền vào mỗi phương thức là khác nhau
    // Tên phương thức trùng nhau_truyền vào khác nhau
}
