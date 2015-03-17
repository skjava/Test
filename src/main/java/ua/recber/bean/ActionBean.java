/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.recber.bean;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author recber
 */
public class ActionBean {

    private List<String> a1 = new ArrayList<String>();
    private List<String> a2 = new ArrayList<String>();

    public synchronized void addA1(String action1) {
        a1.add(action1);
    }

    public synchronized List<String> getA1() {
        return new ArrayList<String>(a1);
    }
    
    public synchronized void addA2(String action2) {
        a2.add(action2);
    }

    public synchronized List<String> getA2() {
        return new ArrayList<String>(a2);
    }
    public static ActionBean get(HttpSession session) {
        ActionBean cart = (ActionBean) session.getAttribute("cart");
        if (cart == null) {
            cart = new ActionBean();
            session.setAttribute("cart", cart);
        }

        return cart;
    }
}