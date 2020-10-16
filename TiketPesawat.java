import java.util.Scanner;

public class TiketPesawat
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int b, kembalian;
		char pilihan;
		String nama, alamat;
		boolean loop = true;
		
		System.out.println("MASUKKAN PILIHAN MENGGUNAKAN HURUF BESAR!!!");
		System.out.println("Harga Tiket Pesawat:");
		System.out.println("A. Rp 5.000.000");
		System.out.println("B. Rp 2.000.000");
		System.out.println("C. Rp 1.000.000");
		System.out.print("Masukkan Nama: ");
			nama = input.nextLine();
		System.out.print("Masukkan Alamat: ");
			alamat  = input.nextLine();
		System.out.print("Pilihan: ");
			pilihan = input.next().charAt(0);
		System.out.print("Bayar: Rp ");
			b = input.nextInt();
		while(loop)
		{
			switch(pilihan)
			{
				case 'A': kembalian = b - 5000000;
					System.out.println("Nama: "+nama);
			 		System.out.println("Alamat: "+alamat);
			 		System.out.println("Kembalian = Rp "+kembalian);
			 		loop = false; 
			 		break;
				case'B': kembalian = b - 2000000;
					System.out.println("Nama: "+nama);
			 		System.out.println("Alamat: "+alamat);
					System.out.println("Kembalian = Rp "+kembalian);
					loop = false;
					break;
				case 'C': kembalian = b - 1000000;
					System.out.println("Nama: "+nama);
			 		System.out.println("Alamat: "+alamat);
					System.out.println("Kembalian = Rp "+kembalian);
					loop = false;
					break;
				default: System.out.println("Silahkan pilih harga tiket pesawat dari A-C");
			}
		}
	}
}