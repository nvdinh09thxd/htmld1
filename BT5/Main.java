package Buoi9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		phanSo p1 = new phanSo();
		phanSo p2 = new phanSo();
		int chon;
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println("----------MENU----------");
			System.out.println("1. Nhap 2 phan so");
			System.out.println("2. In 2 phan so");
			System.out.println("3. Cong 2 phan so");
			System.out.println("4. Tru 2 phan so");
			System.out.println("5. Nhan 2 phan so");
			System.out.println("6. Chia 2 phan so");
			System.out.println("7. Rut gon phan so");
			System.out.println("8. Thoat");
			System.out.println("-------------------------");
			System.out.print("Nhap lua chon: ");
			chon = sc.nextInt();
		
		switch(chon){
		
		case 1: 
				System.out.println("----------NHAP PHAN SO----------");
				System.out.println("Nhap phan so thu nhat:");
		        p1.nhapPhanSo();
		        System.out.println("Nhap phan so thu hai:");
		        p2.nhapPhanSo();
		        break;
		case 2: 
				System.out.println("----------IN PHAN SO----------");
				System.out.print("Phan so thu nhat la:"); p1.inPhanSo();
				System.out.print("Phan so thu hai la:"); p2.inPhanSo();
				break;
		case 3: 
				System.out.println("----------TINH TONG 2 PHAN SO----------");
				phanSo tong = new phanSo();
				tong=p1.congPhanSo(p2);
				System.out.print("Tong cua 2 phan so la: ");
				tong.inPhanSo();
				break;
		case 4: 
				System.out.println("----------TINH HIEU 2 PHAN SO----------");
				phanSo hieu = new phanSo();
				hieu=p1.truPhanSo(p2);
				System.out.print("Hieu cua 2 phan so la: ");
				hieu.inPhanSo();
				break;
		case 5: 
				System.out.println("----------TINH TICH 2 PHAN SO----------");
				phanSo tich = new phanSo();
				tich=p1.nhanPhanSo(p2);
				System.out.print("Tich cua 2 phan so la: ");
				tich.inPhanSo();
				break;
		case 6: 
				System.out.println("----------TINH THUONG 2 PHAN SO----------");
				phanSo thuong = new phanSo();
				thuong=p1.chiaPhanSo(p2);
				System.out.print("Thuong cua 2 phan so la: ");
				thuong.inPhanSo();
				break;
		case 7:	
				System.out.println("----------RUT GON PHAN SO----------");
				System.out.println("Nhap phan so");
				phanSo a = new phanSo();
				a.nhapPhanSo();
				a.rutGonPhanSo();
				System.out.print("Phan so duoc rut gon la: ");
				a.inPhanSo();
				break;
		case 8: System.out.println("Thoat khoi chuong trinh!");
		}
		}while(chon!=8);
	}
}
