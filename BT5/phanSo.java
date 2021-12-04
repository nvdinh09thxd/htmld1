package Buoi9;

import java.util.Scanner;

public class phanSo {
	int tuSo;
	int mauSo;
	public phanSo(int tuSo, int mauSo) {
		super();
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	
	public phanSo() {
		super();
	}
	
	public void nhapPhanSo(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap tu so: ");
		tuSo=sc.nextInt();
		do{
			System.out.print("Nhap mau so khac 0: ");
			mauSo=sc.nextInt();
		}while(mauSo==0);
	}

	public void inPhanSo(){
		if(tuSo==0) System.out.println("0");
		else System.out.println(tuSo+"/"+mauSo);
	}
	public phanSo nghichDaoPhanSo(){
		phanSo a = new phanSo();
		a.tuSo=mauSo;
		a.mauSo=tuSo;
		return a;
	}
	public double giaTriThuc(){
		return(tuSo/mauSo);
	}
	public int UCLN(int a, int b){
		while(a!=b){
			if(a>b) a-=b;
			else b-=a;
		}
		return a;
	}
	public void rutGonPhanSo(){
		int a = tuSo;
		int b = mauSo;
		if(a==0) return;
		tuSo=a/UCLN(a, b);
		mauSo=b/UCLN(a, b);
	}
	public phanSo congPhanSo(phanSo a){
		phanSo tong = new phanSo();
		tong.tuSo=tuSo*a.mauSo+a.tuSo*mauSo;
		tong.mauSo=mauSo*a.mauSo;
		tong.rutGonPhanSo();
		return tong;
	}
	public phanSo truPhanSo(phanSo a){
		phanSo hieu = new phanSo();
		hieu.tuSo=tuSo*a.mauSo-a.tuSo*mauSo;
		hieu.mauSo=mauSo*a.mauSo;
		hieu.rutGonPhanSo();
		return hieu;
	}
	public phanSo nhanPhanSo(phanSo a){
		phanSo tich = new phanSo();
		tich.tuSo=tuSo*a.tuSo;
		tich.mauSo=mauSo*a.mauSo;
		tich.rutGonPhanSo();
		return tich;
	}
	public phanSo chiaPhanSo(phanSo a){
		phanSo thuong = new phanSo();
		thuong.tuSo=tuSo*a.mauSo;
		thuong.mauSo=mauSo*a.tuSo;
		thuong.rutGonPhanSo();
		return thuong;
	}
}

