/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPTUAN2.BAI1;

/**
 *
 * @author Ngoc Nhi
 */
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static void nhapTK(Account tk) {
		System.out.println("Nhap so tai khoan: ");
		tk.setsoTK(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhap ten tai khoan: ");
		tk.setTenTK(sc.nextLine());
		tk.setSoTien(50);
	}
	public static void Main(String[] args) {
		Account a[]=null;
		int k,b,n=0;
		long s,d,c,f;
		boolean flag = true;
		do {
			 System.out.println("Ban chon lam gi: ");
			 System.out.println("1.Them tai khoan\n"
					 + "2.In thong tin tai khoan\n" 
					 + "3.Nap tien vao tai khoan\n"
					 + "4.Rut tien\n"
					 + "5.Chuyen tien\n"
					 + "Nhap so khac de thoat");
					
		
	b=sc.nextInt();
	switch(b) {
	case 1://them tk
		System.out.println("Nhap so luong tai khoan muon them: ");
        n = sc.nextInt();
        a = new Account[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Tai khoan so " + (i+1));
            a[i] = new Account();
            nhapTK(a[i]);
        }
        break;
	case 2://in thong tin 
        System.out.printf("%-10s %-20s %-20s\n", "So TK", "Ten TK", "So tien trong TK");
        for (int i = 0; i < n; i++) {
            a[i].inTK();
        }
        break;
	case 3://nap tien
		System.out.println("Nhap so tai khoan can nap tien: ");
		s= sc.nextLong();
		for (int i=0;i<n;i++) {
			d =a[i].getsoTK();
			if (s==d) {
				System.out.println("Ban chon tai khoan: "+d);
				a[i].napTien();
			} else {
				System.out.println("");
			}
		break;
	case 4:
		System.out.println("Nhap so tai khoan can rut tien: ");
		s= sc.nextLong();
		for (int i=0;i<n;i++) {
			d =a[i].getsoTK();
			if (s==d) {
				System.out.println("Ban chon tai khoan: "+d);
				a[i].rutTien();
			}
		}
		break;	
	case 5://chuyen tien
		double chuyen,nhan,tienChuyen;
		System.out.print("Nhap so tai khoan chuyen tien :");
		s=sc.nextLong();
		System.out.print("Nhap so tai khoan nhan tien :");
		c=sc.nextLong();
		for (int i=0;i<n;i++){
			d=a[i].getsoTK();
			if (s==d) {
				chuyen=a[i].getSoTien();
				for (int j=0;i<n;j++) {
					f=a[j].getsoTK();
					if (c==f) {
						nhan = a[j].getSoTien();
						System.out.println("Nhap so tien can chuyen: ");
						tienChuyen=sc.nextDouble();
						if (tienChuyen <=chuyen) {
							chuyen = chuyen - tienChuyen;
							nhan = nhan + tienChuyen;
							a[i].setSoTien(chuyen);
							a[j].setSoTien(nhan);
							System.out.println("Tai khoan so " + d + " vua chuyen : $"+ tienChuyen);
							System.out.println("Tai khoan so " + d + " vua nhan : $" + tienChuyen);
						} else {
							System.out.println("So tien nhap khong hop le: !");
						}
						
					} else {
						System.out.println("");
					}
				} else { 
					System.out.println("");
				}
		}
		break;
		default:
			System.out.println("Bye!!");
			flag=false;
			break;
		}
		while (flag);
		}
	}
}


