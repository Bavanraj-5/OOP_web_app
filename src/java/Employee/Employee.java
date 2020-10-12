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
public class Employee {
    private String ename;
    private int eno;
    private int econtact;
    private String eadd;
    
    public int getEno() {
        return eno;
    }
    public void seteno(int id) {
        eno = id;
    }
    public String getName() {
        return ename;
    }
    public void setName(String Name) {
        ename = Name;
    }
    public int getContact() {
        return econtact;
    }
    public void setContact(int no) {
        econtact = no;
    }
    public String getAdd() {
        return eadd;
    }
    public void setAdd(String address) {
        eadd = address;
    }
   /* @Override
    public String toString() {
        return "Employee [Employee number="+eno+", Name="+ename+", MobileNo="+econtact+", Address="+eadd+"]";
    }*/
    
}