package controller;

import model.Product;
import service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    ProductServiceImpl productService = new ProductServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("act");
        if (action == null) {
            action = "";
        }
        switch (action) {
//            case "searchByPrice":
//                searchByPrice(request, response);
//                break;
            default:
                showList(request, response);
        }

// B3: Test duong dan       request.getRequestDispatcher("category/list.jsp").forward(request,response);
    }

//    private void searchByPrice(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String one = request.getParameter("one");
//        String two = request.getParameter("two");
//        List<Product> products = productService.findAll();
//        String key = request.getParameter("key");
//        if (key != null && key != "") {
//            products = productService.findByName(key);
//        }
//        else if (one != null && two != null)
//        {
//            products = productService.findByPrice(Integer.parseInt(one),Integer.parseInt(two));
//        }
//        request.setAttribute("ds", products);
//        request.getRequestDispatcher("product/list.jsp").forward(request,response);
//    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //        String key = request.getParameter("key");
//        List<Product> products = productService.findAll();
//        if (key != null) {
//            products = productService.findByName(key);
//        }


//        List<Product> products = productService.findAll();
//        String key = request.getParameter("key");
//        if (key != null) {
//            products = productService.findByName(key);
//        }
//        request.setAttribute("ds", products);
//        request.getRequestDispatcher("product/list.jsp").forward(request,response);
        String one = request.getParameter("one");
        String two = request.getParameter("two");
        List<Product> products = productService.findAll();
        String key = request.getParameter("key");
        if (key != null && key != "") {
            products = productService.findByName(key);
        }
        else if (one != null && two != null)
        {
            products = productService.findByPrice(Integer.parseInt(one),Integer.parseInt(two));
        }
        request.setAttribute("ds", products);
        request.getRequestDispatcher("product/list.jsp").forward(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
