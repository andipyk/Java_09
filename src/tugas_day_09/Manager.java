package tugas_day_09;

public class Manager extends Worker{

    int tunjanganTransport = 1000;
    int tunjanganEntertaint = 500;

    public Manager(int id, int absen, String nama, int umur) {
        super(id, absen, nama, umur);
    }

    int hitungTunjanganTransport(){
        return tunjanganTransport * super.absen;
    }

    int hitungTunjanganEntertaint(){
        return tunjanganEntertaint * super.absen;
    }

}