package tugas_day_09;

public class Staff extends Worker{
    int tunjanganMakan = 5000;

    public Staff(int id, int absen, String nama, int umur) {
        super(id, absen, nama, umur);
    }


    int hitungTunjanganMakan(){
        return tunjanganMakan * super.absen;
    }

}