/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ma.emsi.tp1customermahmoudrazzouk.jsf;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;
import ma.emsi.tp1customermahmoudrazzouk.entity.Customer;
import service.CustomerManager;


@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
private List<Customer> customerList;  
@Inject  
private CustomerManager customerManager;
  public CustomerBean() {
  }
  /** 
   * Retourne la liste des clients pour affichage dans une DataTable.
   */  
  public List<Customer> getCustomers() {
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return customerList;
  }  
}
