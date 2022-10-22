package bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerCat {
    ArrayList<CatDetail> catArrayList = new ArrayList<>();


    public ManagerCat(){

    }
    public void input(ColourManager colourManager){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu n: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            CatDetail catDetail = new CatDetail();
            catDetail.nhap(colourManager);

           catArrayList.add(catDetail);
        }
    }
    public void display(){
        for(int i=0;i<catArrayList.size();i++){
            catArrayList.get(i).hienthi();
        }
    }

    public void sortByTable(){
        Collections.sort(catArrayList, new Comparator<CatDetail>() {
            @Override
            public int compare(CatDetail o1, CatDetail o2) {
                if( o1.getIdColor()<= o2.getIdColor()){
                    return -1;
                }
                return 1;
            }
        });
        display();
    }
    public void sort(){
        Collections.sort(catArrayList, new Comparator<CatDetail>() {
            @Override
            public int compare(CatDetail o1, CatDetail o2) {
                return o1.getMau().compareTo(o2.getMau());
            }
        });
        display();
    }
    public void sortByColor (){

    }
    public void find(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai can tim kiem: ");
        int cnt =0;
        String  loai = sc.nextLine();
        for(CatDetail catDetail : catArrayList){
            if(catDetail.getLoai().equalsIgnoreCase(loai)){
                catDetail.hienthi();
                cnt++;
            }
        }
        if(cnt==0){
            System.out.println("Khong tim thay meo nao co loai ");
        }
    }
}
