package com.benno;
import java.util.Scanner;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Cetak Nama
     */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    Printer printer = new Printer();

        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        printer.setNama(scanner.nextLine());

        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJmlCetak(scanner.nextInt());

        printer.cetak(printer.getNama());

        printer.cetak(printer.getJmlCetak(), printer.getNama());

    }
}
