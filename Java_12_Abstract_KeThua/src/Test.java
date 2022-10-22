public class Test {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("HAng 1","Viet Nam");
        HangSanXuat h2 = new HangSanXuat("Hang 2","Nhat Ban");
        HangSanXuat h3 = new HangSanXuat("HAng 3","Han Quoc");

        MayBay p1 = new MayBay(h1, "Xang");
        PhuongTienDiChuyen p2 = new XeOTo(h2,"Xang");
        PhuongTienDiChuyen p3 = new XeDap(h3);

        System.out.println("Lay hang san xuat: ");
        System.out.println("p1: "+p1.layTenHangSanXuat());
        System.out.println("Bat Dau");
        p2.start();

        System.out.println("Lay van toc: ");
        System.out.println("p1: "+p1.layVanToc());
        System.out.println("p2: "+p2.layVanToc());
        System.out.println("p3: "+p3.layVanToc());

        System.out.println("Cat Canh");
        p2.start();

    }
}
