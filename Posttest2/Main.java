import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

class Planet{
    private String nama;
    private String orbit_bintang;
    private double massa;
    private double diameter;
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getOrbit_bintang() {
        return orbit_bintang;
    }
    public void setOrbit_bintang(String orbit_bintang) {
        this.orbit_bintang = orbit_bintang;
    }
    public double getMassa() {
        return massa;
    }
    public void setMassa(double massa) {
        this.massa = massa;
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public Planet (String nama, String orbit, double massa, double diameter){
        this.nama = nama;
        this.orbit_bintang = orbit;
        this.massa = massa;
        this.diameter = diameter;
    }
    public void data(){
        System.out.println(this.nama);
        System.out.println("<================>");
        System.out.println("[Massa] " + this.massa);
        System.out.println("[Diameter] " + this.diameter);
        System.out.println("[Bintang orbit] " + this.orbit_bintang); 
        System.out.println("<================>");
    }
}

class Bintang{
    private String nama;
    private String warna;
    private double massa;
    private double diameter;
    private double temperatur;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public double getMassa() {
        return massa;
    }
    public void setMassa(double massa) {
        this.massa = massa;
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public double getTemperatur() {
        return temperatur;
    }
    public void setTemperatur(double temperatur) {
        this.temperatur = temperatur;
    }

    public Bintang (String nama, String warna, double massa, double diameter, double temperatur) {
        this.nama = nama;
        this.warna = warna;
        this.massa = massa;
        this.diameter = diameter;
        this.temperatur = temperatur;
    }
    public void data(){
        System.out.println(this.nama);
        System.out.println("<================>");
        System.out.println("[Warna] " + this.warna);
        System.out.println("[Massa] " + this.massa);
        System.out.println("[Diameter] " + this.diameter); 
        System.out.println("[Temperatur] " + this.temperatur); 
        System.out.println("<================>");
    }
}

class Galaksi{
    private String nama;
    private String jenis;
    private double massa;
    private double diameter;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public double getMassa() {
        return massa;
    }
    public void setMassa(double massa) {
        this.massa = massa;
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public Galaksi (String nama, String jenis, double massa, double diameter) {
        this.nama = nama;
        this.jenis = jenis;
        this.massa = massa;
        this.diameter = diameter;
    }
    public void data(){
        System.out.println(this.nama);
        System.out.println("<================>");
        System.out.println("[Massa] " + this.massa);
        System.out.println("[Diameter] " + this.diameter);
        System.out.println("[Jenis] " + this.jenis); 
        System.out.println("<================>");
    }    
}

class Objek{
    private String nama;
    private String jenis;
    private double massa;
    private double diameter;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public double getMassa() {
        return massa;
    }
    public void setMassa(double massa) {
        this.massa = massa;
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public Objek (String nama, String jenis, double massa, double diameter) {
        this.nama = nama;
        this.jenis = jenis;
        this.massa = massa;
        this.diameter = diameter;
    }
    public void data(){
        System.out.println(this.nama);
        System.out.println("<================>");
        System.out.println("[Massa] " + this.massa);
        System.out.println("[Diameter] " + this.diameter);
        System.out.println("[Jenis] " + this.jenis); 
        System.out.println("<================>");
    }    
}

public class Main {
    // static String redx = "\033[1;31m", redy="\033[0m"; 

    static ArrayList<Planet> planet = new ArrayList<Planet>();
    static ArrayList<Bintang> bintang = new ArrayList<Bintang>();
    static ArrayList<Galaksi> galaksi = new ArrayList<Galaksi>();
    static ArrayList<Objek> objek = new ArrayList<Objek>();

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Scanner n = new Scanner(System.in);

    public static void goo(int row, int column){
        char escCode = 0x1B;
        System.out.print(String.format("%c[%d;%df", escCode, row, column));
    }
    public static void cls() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void menu(){
        String m = """
                   ---SPACE INDEX---
            <=============================>
            ||      [1. Show Data]       ||
            ||    [2. Input New data]    ||
            ||         [3. Exit]         ||
            <=============================>
            ===============================
            || Input Command: 
            ===============================
                """;
        System.out.println(m);

    }
    public static void tambah(String tipe) throws IOException, InterruptedException {
        try {
            System.out.println("--------Masukkan Data-------");
            double temperatur = 0;
            System.out.print("Nama "+tipe+": "); String nama = br.readLine();
            if(tipe == "planet"){
                System.out.print("Orbit(hari): ");
            } if (tipe == "bintang"){
                System.out.print("Temperatur(Celcius): "); temperatur = Double.parseDouble(br.readLine());
                System.out.print("Warna: ");
            } if(tipe == "galaksi" || tipe == "objek"){
                System.out.print("Jenis: ");
            }
            String lanjut = br.readLine();
            System.out.print("Mass(kg): "); double massa = Double.parseDouble(br.readLine());
            System.out.print("Diameter(m): "); double diameter = Double.parseDouble(br.readLine());
            
            if(tipe == "planet"){
                planet.add( new Planet(nama, lanjut, massa, diameter) );
            }
            if(tipe == "bintang"){
                bintang.add( new Bintang(nama, lanjut, massa, diameter, temperatur ) );
            }
            if(tipe == "galaksi"){
                galaksi.add( new Galaksi(nama, lanjut, massa, diameter) );
            }
            if(tipe == "objek"){
                objek.add( new Objek(nama, lanjut, massa, diameter) );
            }
    
            System.out.println("Data berhasil ditambahkan! ");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        } catch (NumberFormatException e) {
            cls();
            System.out.println("Masukkan salah!");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException err) {
                Thread.currentThread().interrupt();
            }
            return;
        }
 
    }

    public static void tampil() throws IOException, InterruptedException {

        System.out.println("\n---------Planet---------");
        if(planet.size() != 0){
        for(int i=0; i<planet.size(); i++){
            System.out.print(i+1 + " ");
            planet.get(i).data();
            
        }} else {
            System.out.println("Data Planet Kosong...");
        }

        System.out.println("\n---------Bintang---------");
        if(bintang.size() != 0){
        for(int i=0; i<bintang.size(); i++){
            System.out.print(i+1 + " ");
            bintang.get(i).data();          
        }} else {
            System.out.println("Data Bintang Kosong...");            
        }

        System.out.println("\n---------Galaksi---------");
        if(galaksi.size() != 0){
        for(int i=0; i<galaksi.size(); i++){
            System.out.print(i+1 + " ");
            galaksi.get(i).data();           
        }} else {
            System.out.println("Data Galaksi Kosong...");
        }

        System.out.println("\n---------Objek Lain-Lain---------");
        if(objek.size() != 0){
        for(int i=0; i<objek.size(); i++){
            System.out.print(i+1 + " ");
            objek.get(i).data();         
        }} else {
            System.out.println("Data Objek lain-lain Kosong...");
        }
        System.out.print("""
             
                      ---MENU---
            <=============================>
            ||        [1. Edit]          ||
            ||        [2. Delete]        ||
            ||        [3. Back]          ||
            <=============================>
            ===============================
            || Input Command:  """);
        int a = Integer.parseInt(br.readLine());
        if(a == 1){
            System.out.print("""
                           ---EDIT---
                <=============================>
                ||        [1. Planet]        ||
                ||        [2. Bintang]       ||
                ||        [3. Galaksi]       ||
                ||       [4. Objek Lain]     ||
                ||       [5. Kembali ]       ||
                <=============================>
                ===============================
                || Input Command:  """);
            int submenu = Integer.parseInt(br.readLine());
            if(submenu == 1) {
                ubah("planet"); cls();
                tampil();
                return;
            }else if(submenu == 2) {
                ubah("bintang"); cls();
                tampil();
                return;
            } else if(submenu == 3) {
                ubah("galaksi"); cls();
                tampil();
                return;
            } else if(submenu == 4) {
                ubah("objek");cls();
                tampil();
                return;
            } else {
                cls();
                tampil(); 
                return;
            }
        } else if(a == 2){
            System.out.print("""
                           ---DELETE---
                <=============================>
                ||        [1. Planet]        ||
                ||        [2. Bintang]       ||
                ||        [3. Galaksi]       ||
                ||       [4. Objek Lain]     ||
                ||       [5. Kembali ]       ||
                <=============================>
                ===============================
                || Input Command:  """);
            int submenu = Integer.parseInt(br.readLine());
            if(submenu == 1) {
                hapus("planet");
                cls();
                tampil(); return;
            }else if(submenu == 2) {
                hapus("bintang");
                cls();
                tampil(); return;
            } else if(submenu == 3) {
                hapus("galaksi");
                cls();
                tampil(); return;
            } else if(submenu == 4) {
                hapus("objek");
                cls();
                tampil(); return;
            } else {
                cls();
                tampil(); return;
            }   
        } else {
            return;
        }
    }

    public static void ubah(String tipe) throws IOException, InterruptedException{
        try {
            System.out.println("Masukkan nomor data yang ingin diubah: "); int no = Integer.parseInt(br.readLine());
        
            if(tipe == "planet"){
                if(no-1 >= planet.size()){
                    System.out.println("Data tidak ada!");
                    try{
                        Thread.sleep(1000);
                    } catch(InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return;
                }
                System.out.println("--------Data Lama-------");
                planet.get(no-1).data();
            }
            if(tipe == "bintang"){
                if(no-1 >= bintang.size()){
                    System.out.println("Data tidak ada!");
                    try{
                        Thread.sleep(1000);
                    } catch(InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return;
                }
                System.out.println("--------Data Lama-------");
                bintang.get(no-1).data();
            }
            if(tipe == "galaksi"){
                if(no-1 >= galaksi.size()){
                    System.out.println("Data tidak ada!");
                    try{
                        Thread.sleep(1000);
                    } catch(InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return;
                }
                System.out.println("--------Data Lama-------");
                galaksi.get(no-1).data();
            }
            if(tipe == "objek"){
                if(no-1 >= objek.size()){
                    System.out.println("Data tidak ada!");
                    try{
                        Thread.sleep(1000);
                    } catch(InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return;
                }
                // System.out.println("--------Data Lama-------");
                // objek.get(no-1).data();
            }
    
    
            System.out.println("--------Masukkan Data Baru-------");
            double temperatur = 0;
            System.out.println("Nama "+tipe+": ");
            String nama = "";
            String lanjut = "";
            double massa = 0;
            double diameter = 0;
            if(tipe == "planet"){
                System.out.print(planet.get(no-1).getNama() + "\r");  nama = br.readLine();
                System.out.println("Orbit(hari): ");
                System.out.print(planet.get(no-1).getOrbit_bintang() + "\r"); lanjut = br.readLine();
                System.out.println("Massa(kilogram): "); 
                System.out.print(planet.get(no-1).getMassa() + "\r"); massa = Double.parseDouble(br.readLine());
                System.out.println("Diameter(meter): ");
                System.out.print(planet.get(no-1).getDiameter() + "\r"); diameter = Double.parseDouble(br.readLine());
            } if (tipe == "bintang"){
                System.out.print(bintang.get(no-1).getNama() + "\r");   nama = br.readLine();
                System.out.println("Temperatur(celcius): ");
                System.out.print(bintang.get(no-1).getTemperatur() + "\r"); temperatur = Double.parseDouble(br.readLine());
                System.out.println("Warna: ");
                System.out.print(bintang.get(no-1).getWarna() + "\r"); lanjut = br.readLine();
                System.out.println("Massa(kilogram): "); 
                System.out.print(bintang.get(no-1).getMassa() + "\r"); massa = Double.parseDouble(br.readLine());
                System.out.println("Diameter(meter): ");
                System.out.print(bintang.get(no-1).getDiameter() + "\r"); diameter = Double.parseDouble(br.readLine());
            } if(tipe == "galaksi"){
                System.out.print(galaksi.get(no-1).getNama() + "\r");   nama = br.readLine();
                System.out.print("Jenis: ");
                System.out.print(galaksi.get(no-1).getJenis() + "\r"); lanjut = br.readLine();
                System.out.println("Massa(kilogram): "); 
                System.out.print(galaksi.get(no-1).getMassa() + "\r"); massa = Double.parseDouble(br.readLine());
                System.out.println("Diameter(meter): ");
                System.out.print(galaksi.get(no-1).getDiameter() + "\r"); diameter = Double.parseDouble(br.readLine());
            } if(tipe == "objek"){
                System.out.print(objek.get(no-1).getNama() + "\r");   nama = br.readLine();
                System.out.println("Jenis: ");
                System.out.print(objek.get(no-1).getJenis() + "\r");lanjut = br.readLine();
                System.out.println("Massa(kilogram): "); 
                System.out.print(objek.get(no-1).getMassa() + "\r"); massa = Double.parseDouble(br.readLine());
                System.out.println("Diameter(meter): ");
                System.out.print(objek.get(no-1).getDiameter() + "\r"); diameter = Double.parseDouble(br.readLine());
            }
            
            
            if(tipe == "planet"){
                planet.set(no-1, new Planet(nama, lanjut, massa, diameter) );
            }
            if(tipe == "bintang"){
                bintang.set(no-1, new Bintang(nama, lanjut, massa, diameter, temperatur ) );
            }
            if(tipe == "galaksi"){
                galaksi.set(no-1, new Galaksi(nama, lanjut, massa, diameter) );
            }
            if(tipe == "objek"){
                objek.set(no-1, new Objek(nama, lanjut, massa, diameter) );
            }
    
    
            System.out.println("Data berhasil diubah! ");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        } catch (NumberFormatException e) {
            cls();
            System.out.println("Masukkan salah!");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException err) {
                Thread.currentThread().interrupt();
            }
            return;
        }
        

    }

    public static void hapus(String tipe) throws IOException, InterruptedException{
        try {
            System.out.println("Masukkan nomor data yang ingin dihapus: "); int no = Integer.parseInt(br.readLine());

            if(tipe == "planet"){
                if(no-1 >= planet.size()){
                    System.out.println("Data tidak ada!");
                    try{
                        Thread.sleep(1000);
                    } catch(InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return;
                }
                System.out.println("--------Hapus Data Berikut?-------\n1. ya\n2. tidak");
                planet.get(no-1).data();
            }
            if(tipe == "bintang"){
                if(no-1 >= bintang.size()){
                    System.out.println("Data tidak ada!");
                    try{
                        Thread.sleep(1000);
                    } catch(InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return;
                }
                System.out.println("--------Hapus Data Berikut?-------\n1. ya\n2. tidak");
                bintang.get(no-1).data();
            }
            if(tipe == "galaksi"){
                if(no-1 >= galaksi.size()){
                    System.out.println("Data tidak ada!");
                    try{
                        Thread.sleep(1000);
                    } catch(InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return;
                }
                System.out.println("--------Hapus Data Berikut?-------\n1. ya\n2. tidak");
                galaksi.get(no-1).data();
            }
            if(tipe == "objek"){
                if(no-1 >= objek.size()){
                    System.out.println("Data tidak ada!");
                    try{
                        Thread.sleep(1000);
                    } catch(InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return;
                }
                System.out.println("--------Hapus Data Berikut?-------\n1. ya\n2. tidak");
                objek.get(no-1).data();
            }
            int konfirmasi = Integer.parseInt(br.readLine());
    
            if(konfirmasi == 1){
                if(tipe == "planet"){
                    planet.remove(no-1);
                }
                if(tipe == "bintang"){
                    bintang.remove(no-1);
                }
                if(tipe == "galaksi"){
                    galaksi.remove(no-1);
                }
                if(tipe == "objek"){
                    objek.remove(no-1);
                }
                
                System.out.println("Data berhasil dihapus! ");
                try{
                    Thread.sleep(1000);
                } catch(InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }            
        } catch (NumberFormatException e) {
            cls();
            System.out.println("Masukkan salah!");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException err) {
                Thread.currentThread().interrupt();
            }
            return;
        }

    }

    public static void main(String[] args)throws IOException, InterruptedException{        
        while(true){
            cls();
            menu();
            goo(8, 20);
            
            int menu = 0, submenu; 
            try{
                menu = Integer.parseInt(br.readLine());
                switch(menu){
                    case 1:
                        cls();
                        tampil();
                        break;
                    case 2:
                        cls();
                        System.out.println("""
                                     ---NEW DATA---
                            <=============================>
                            ||        [1. Planet]        ||
                            ||        [2. Bintang]       ||
                            ||        [3. Galaksi]       ||
                            ||       [4. Objek Lain]     ||
                            <=============================>
                            ===============================
                            || Input Command: 
                            ===============================
                                """);
                        goo(9, 20);
                        submenu = Integer.parseInt(br.readLine());
                        cls();
                        if(submenu == 1) {
                            tambah("planet");
                        }else if(submenu == 2) {
                            tambah("bintang");
                        } else if(submenu == 3) {
                            tambah("galaksi");
                        } else if(submenu == 4) {
                            tambah("objek");
                        }
                        
                        break;
                    case 3:
                        cls();
                        System.out.println("Thank you!");
                        System.exit(0);
                        break;
                    default:
                        cls();
                        goo(7, 0); System.out.print("Masukkan Salah!");
                        try{
                            Thread.sleep(1000);
                        } catch(InterruptedException err) {
                            Thread.currentThread().interrupt();
                        }
                }
            } catch(NumberFormatException e) {
                cls();
                goo(7, 0); System.out.print("Masukkan salah!         ");
                try{
                    Thread.sleep(1000);
                } catch(InterruptedException err) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

