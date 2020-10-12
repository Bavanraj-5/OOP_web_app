/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;
import java.util.*;


/**
 *
 * @author User
 */
public class Salary {
    private int eno;
    private float basicSal;
    private float otRate;
    private float othrs;
    private float total;
    
    public void setTot(float t){
        total=t;
    }
    public float getTot(){
        return total;
    }
    public int getEno() {
        return eno;
    }
    public void seteno(int id) {
        eno = id;
    }
    public float getSal(){
        return basicSal;
    }
    public void setSal(float sal){
        basicSal=sal;
    }
    public float getOtr(){
        return otRate;
    }
    public void setOtr(float otr){
        otRate=otr;
    }
    public float getOthrs(){
        return othrs;
    }
    public void setOthrs(float oth){
        othrs=oth;
    }
}
