/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.TaiKhoanDAO;
import model.Account;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.ICustomerService;
import service.impl.CustomerService;

/**
 *
 * @author admin
 */
@WebServlet("/dang-nhap")
public class LoginController extends HttpServlet{
    private ICustomerService customerservice = new CustomerService();

    public LoginController() {
    }
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       TaiKhoanDAO tk = new TaiKhoanDAO();
       
        req.setAttribute("model", tk.loadData());
//       RequestDispatcher rd = req.getRequestDispatcher("view/login.jsp");
//       rd.forward(req, resp);
        req.setAttribute("customer",customerservice.findAll());
        RequestDispatcher rd = req.getRequestDispatcher("view/customer.jsp");
        rd.forward(req, resp);  
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }
    
}
