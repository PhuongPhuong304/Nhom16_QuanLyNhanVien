/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Other
 */
public class NgayCong {

    private int id;
    private Nhanvien nv;
    private Double songaycong, songaynghi, giolamthem;

    public NgayCong() {
    }

    public NgayCong(int id, Nhanvien sv, double songaycong, double songaynghi, double giolamthem) {
        this.id = id;
        this.nv = sv;
        this.songaycong = songaycong;
        this.songaynghi = songaynghi;
        this.giolamthem = giolamthem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nhanvien getnv() {
        return nv;
    }

    public void setnv(Nhanvien nv) {
        this.nv = nv;
    }

    public double getsongaycong() {
        return songaycong;
    }

    public void setsongaycong(double songaycong) {
        this.songaycong = songaycong;
    }

    public double getsongaynghi() {
        return songaynghi;
    }

    public void setsongaynghi(double songaynghi) {
        this.songaynghi = songaynghi;
    }

    public double getgiolamthem() {
        return giolamthem;
    }

    public void setgiolamthem(double giolamthem) {
        this.giolamthem = giolamthem;
    }
    
}
