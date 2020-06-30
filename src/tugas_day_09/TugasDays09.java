package tugas_day_09;

import java.io.*;
import java.util.*;

public class TugasDays09 {
    public static InputStreamReader r = new InputStreamReader(System.in);
    public static BufferedReader br = new BufferedReader(r);

    public static ArrayList<Worker> listStaff = new ArrayList<Worker>();
    public static ArrayList<Worker> listManajer = new ArrayList<Worker>();

    public static void main(String args[]) throws Exception {
        int paramsMenu = 0;
        while (paramsMenu != 3) {
            System.out.println("Menu");
            System.out.println("1. Buat Worker");
            System.out.println("2. Hitung Tunjangan");
            System.out.println("3. Exit");
            System.out.print("Enter data: ");
            paramsMenu = Integer.parseInt(br.readLine());
            System.out.println("data is: " + paramsMenu +"\n");
            switchProgram(paramsMenu);
        }
        br.close();
        r.close();
    }

    public static void switchProgram(int params) throws Exception {
        if (params == 1) {
            System.out.println("### Buat Worker ###");
            buatWorker();

        } else if (params == 2) {
            System.out.println("### Hitung Tunjangan ###");
             hitungTunjangan();
        }else if (params == 3) {
            System.out.println("### Exit ###");
            System.out.println("Terimakasih ^^");
        } else {
            System.out.println("Inputan anda salah, coba lagi ! ");
        }

        System.out.print("\n\n");
    }

    static void buatWorker() throws Exception {
        int staffOrManajer = 0;

        System.out.println("Pilih Jabatan: ");
        System.out.println("1. Staff ");
        System.out.println("2. Manajer");
        System.out.print("Pilihan anda: ");
        staffOrManajer = Integer.parseInt(br.readLine());

        int idKaryawan;
        int absenKaryawan;
        int umurKaryawan;
        String namaKaryawan;

        System.out.print("ID Karyawan: ");
        idKaryawan = Integer.parseInt(br.readLine());
        System.out.print("Nama Karyawan: ");
        namaKaryawan = br.readLine();
        System.out.print("Absensi Karyawan: ");
        absenKaryawan = Integer.parseInt(br.readLine());
        System.out.print("Umur Karyawan: ");
        umurKaryawan = Integer.parseInt(br.readLine());

        if(staffOrManajer == 1){
            Worker worker = new Staff(idKaryawan, absenKaryawan, namaKaryawan, umurKaryawan);
            listStaff.add(worker);
        } else if (staffOrManajer == 2 ) {
            Worker worker = new Staff(idKaryawan, absenKaryawan, namaKaryawan, umurKaryawan);
            listManajer.add(worker);
        }

        System.out.println("\nData Sukses Diinput !");
        System.out.println("------------- \n");

//        Worker stafsus01 = new Staff( 1, 22,"Andi", 18);
//        Worker stafsus02 = new Staff(2, 22,"Pawit", 19);
//        Worker stafsus03 = new Staff(3, 25,"Dendi", 20);
//        Worker menteri01 = new Manager(4, 31,"Rizky", 21);
//        Worker menteri02 = new Manager(5, 31,"Ragil", 22);
//        Worker menteri03 = new Manager(6, 20,"Stef", 23);
//        listStaff.add(stafsus01);
//        listStaff.add(stafsus02);
//        listStaff.add(stafsus03);
//        listManajer.add(menteri01);
//        listManajer.add(menteri02);
//        listManajer.add(menteri03);

        System.out.println("Berhasil membuat Arraylist Staff dan Manajer !!");
    }

    static void hitungTunjangan() throws Exception {
        int pilihan;

        System.out.println("Pilih Jabatan");
        System.out.println("1. Staff");
        System.out.println("2. Manajer");

        System.out.print("Pilih Jabatan: ");
        pilihan = Integer.parseInt(br.readLine());

        if (pilihan == 1){
            System.out.println("###  Staff ###");
            int index = cariByID(listStaff);
            if(index > -1) {
                Staff data = (Staff) listStaff.get(index);

                System.out.println("Total Tunjangan:"+ data.hitungTunjanganMakan());
            }

        } else if (pilihan == 2){
            System.out.println("###  Manajer ###");
            int index = cariByID(listManajer);
            if(index > -1) {
                Manager data = (Manager) listManajer.get(index);
                System.out.println("Total Tunjangan:"+ data.hitungTunjanganEntertaint()+data.hitungTunjanganTransport());
            }


        } else {
            System.out.print("Maff Salah Input !");
        }
    }



    static int cariByID(ArrayList<Worker> listWorker) throws Exception {
        int inputID;
        int indexFindArrayList = -1;

        System.out.print("Pilih ID:");
        inputID = Integer.parseInt(br.readLine());

        for (int i = 0; i < listWorker.size(); i++) {
            if (listWorker.get(i).id == inputID) {
                indexFindArrayList = i;
                break;
            }
        }
        return indexFindArrayList;
    }
}






