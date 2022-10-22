public class Test {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(4,5);
        ToaDo td2 = new ToaDo(7,2);
        ToaDo td3 = new ToaDo(18,4);

        //Shape h = new Shape(td1); loi

        Shape h1 = new Diem(td1);
        Shape h2 = new HinhTron(td2,10);
        Shape h3 = new HinhChuNhat(td3,10,30);

        System.out.println("Dien tich1 = "+h1.Area());
        System.out.println("Dien tich2 ="+h2.Area());
        System.out.println("Dien tich 3 = "+h3.Area());


    }
}
