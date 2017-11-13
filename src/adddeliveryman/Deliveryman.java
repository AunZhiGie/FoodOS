/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adddeliveryman;

/**
 *
 * @author owner
 */
public class Deliveryman {
  //private String d_no;
  private String d_name;  
  private String d_IcNo;
  private String d_PNo;
  private String d_status;
  private String d_gender;
  private String d_userName;
  private String d_password;
  

  public Deliveryman(){
      this("","","","","","","");
  }
  
  public Deliveryman(String d_name, String d_IcNo, String d_PNo, String d_status, String d_gender, String d_userName, String d_password) {
    //this.d_no = d_no;
    this.d_name =d_name;
    this.d_IcNo = d_IcNo;
    this.d_PNo = d_PNo;
    this.d_status = d_status;
    this.d_gender = d_gender;
    this.d_userName = d_userName;
    this.d_password = d_password;
  }
  

  /*public int getd_no() {
    d_no=1;
    d_no++;
    return d_no;
  }*/
  
  

  public String getd_name() {
    return d_name;
  }
  
  public void setd_name(String d_name){
      this.d_name = d_name;
  }
  
  public String getd_IcNo(){
      return d_IcNo;
  }
  
  public void setd_IcNo(String d_IcNo){
      this.d_IcNo = d_IcNo;
  }

  public String getd_PNo() {
    return d_PNo;
  }
  
  public void setd_PNo(String d_PNo){
      this.d_PNo = d_PNo;
  }
  
  public String getd_status() {
    return d_status;
  }
  
  public void setd_status(String d_status){
      this.d_status = d_status;
  }
  
  public String getd_gender() {
    return d_gender;
  }
  
  public void setd_gender(String d_gender){
      this.d_gender = d_gender;
  }
  
  public String getd_userName() {
    return d_userName;
  }
  
  public void setd_userName(String d_userName){
      this.d_userName = d_userName;
  }
  
  public String getd_password() {
    return d_password;
  }
  
  public void setd_password(String d_password){
      this.d_password = d_password;
  }
  
    public String toString() {
        return "Name=" + d_name + ", IC Number=" + d_IcNo + ", Phone number=" + d_PNo + ", Status=" + d_status + ", gender=" + d_gender + ", User Name=" + d_userName + ", password=" + d_password + '\n';
    }
}
