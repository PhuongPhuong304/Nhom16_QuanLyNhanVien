/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Other
 */
public class NhanvienDAO {
    public static List<Nhanvien> list = new ArrayList<>();
    
    public int add(Nhanvien sv){
        list.add(sv);
        return 1;
    }
    public List<Nhanvien> getAllNhanVien(){
        return list;
    }
    public int delNhanVienByID( String manv ) {
        for(Nhanvien sv : list){
            if ( sv.getMaNV().equalsIgnoreCase(manv) ) {
                list.remove(sv);
                return 1; 
            }
        }
        return -1;
    }
    public Nhanvien getNhanVienByID(String id){
        for (Nhanvien nv : list){
            if(nv.getMaNV().equalsIgnoreCase(id)){
                return nv;
            }
        }
        return  null;
    }
    
    public Boolean hasNhanVienByID(String id){
        for (Nhanvien nv : list){
            if(nv.getMaNV().equalsIgnoreCase(id)){
                return true;
            }
        }
        return  false;
    }
    public int updateSinhVienByID(Nhanvien svNew){
        for(Nhanvien nv: list){
            if(nv.getMaNV().equalsIgnoreCase(svNew.getMaNV())){
                nv.setDiaChi(svNew.getDiaChi());
                nv.setGioiTinh(svNew.isGioiTinh());
                nv.setHinhAnh(svNew.getHinhAnh());
                nv.setNgaySinh(svNew.getNgaySinh());
                nv.setEmail(svNew.getEmail());
                nv.setSđt(svNew.getSđt());
                nv.setTenNV(svNew.getTenNV());
                return  1;
            }
        }
        return  -1;
    }
}
