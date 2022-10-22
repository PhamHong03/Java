public class Test {
    public static void main(String[] args) {
        Day day1 = new Day(2,12,2011);
        Day day2 = new Day(12,5,3012);
        Day day3 = new Day(2,12,2011);

        Author tacGia1 = new Author("Doi Ngan Dung Ngu Dai",day1);
        Author tacGia2 = new Author("NGuoi Nam Cham",day2);
        Author tacGia3 = new Author("Dung Bao Gio Di An Mot Minh",day3);

        Book book1 = new Book("Lap trinh C",4000,2003,tacGia1);
        Book book2 = new Book("Lap trinh Java",4000,1900,tacGia2);
        Book book3 = new Book("Cau Truc Du Lieu Va Giai Thuat",2003,2003,tacGia3);

        book1.inTenSach();
        book2.inTenSach();
        book3.inTenSach();

        System.out.println("So sanh Book1 va Book3: "+book1.kiemTraCungNamXuatBan(book3));
        System.out.println("Gia sau khi giam :"+ book1.giaSauKhiGiam(10));
        System.out.println("Gia sau khi giam :"+ book3.giaSauKhiGiam(40));

    }
}
