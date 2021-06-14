/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Other
 */
public class NgayCongDAO {

    List<NgayCong> list = new ArrayList<>();

    public int add(NgayCong d) {
        list.add(d);
        return 1;
    }

    public List<NgayCong> getAllNgayCong() {
        return list;
    }

    public NgayCong getOneNgayCongByMaNV(String manv) {
        for (NgayCong d : list) {
            if (d.getnv().getMaNV().equalsIgnoreCase(manv)) {
                return d;
            }
        }
        return null;
    }

    public int updateNgaycong(NgayCong dNew) {
        for (NgayCong d : list) {
            if (d.getnv().getMaNV().equalsIgnoreCase(dNew.getnv().getMaNV())) {
                d.setsongaycong((dNew.getsongaycong()));
            }
            d.setsongaynghi((dNew.getsongaynghi()));
            d.setgiolamthem(dNew.getgiolamthem());
            return 1;
        }
        return -1;
    }

    public int delNgaycong(String manv) {
        NgayCong d = getOneNgayCongByMaNV(manv);
        if (d != null) {
            list.remove(d);
            return 1;
        }
        return -1;
    }
    public NgayCong getAllPosition(int pos){
     return list.get(pos);
    }
}
