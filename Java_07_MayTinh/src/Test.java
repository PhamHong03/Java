public class Test {
    public static void main(String[] args) {
        Day day1 = new Day(13,4,2002);
        Day day2 = new Day(5,3,2003);
        Day day3 = new Day(4,5,1990);

        QuocGia qg1 = new QuocGia("VN","Viet Nam");
        QuocGia qg2 = new QuocGia("HQ","Han Quoc");
        QuocGia qg3 = new QuocGia("USA","My");

        HangSanXuat hsx1 = new HangSanXuat("Macbook",qg2);
        HangSanXuat hsx2 = new HangSanXuat("VN laptop",qg1);
        HangSanXuat hsx3 = new HangSanXuat("Asus",qg3);

        Computer computer1 = new Computer(hsx1,day1,1500,12);
        Computer computer2 = new Computer(hsx2,day2,2000,24);
        Computer computer3 = new Computer(hsx3,day3,1000,48);

        System.out.println("Gia Ban Re Hon");
        System.out.println("Computer 1 va Computer 2 :"+computer1.kiemTraGiaThapHon(computer2));
        System.out.println("Computer 2 va Computer 3: "+computer2.kiemTraGiaThapHon(computer3));

        System.out.println("Ten Quoc Gia: ");
        System.out.println(computer1.layTenQuocGia());
        System.out.println(computer2.layTenQuocGia());
        System.out.println(computer3.layTenQuocGia());

    }
}
