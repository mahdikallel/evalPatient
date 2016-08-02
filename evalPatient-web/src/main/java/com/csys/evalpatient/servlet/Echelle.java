/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.servlet;

import com.csys.evalpatient.generic.WS;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.time.DateTime;
import org.json.simple.JSONObject;
import service.AnyTypeArray;
import service.Evaluation;

/**
 *
 * @author Nabil Moalla
 */
public class Echelle extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Gson gson = new GsonBuilder().serializeNulls().create();
        try {
            String type = request.getParameter("type");
            String function = request.getParameter("function");
            if (WS.portEchelleWS == null) {
                WS webService = new WS();
                webService.EchelleWS();

            }

            if (type.equals("consult")) {
                if (function.equals("getAllEchelle")) {
                    out.println(gson.toJson(WS.portEchelleWS.findallechelle()));
                } else if (function.equals("GetResultByNumDossAndCodeEchelle")) {
                    int numEchelle = Integer.parseInt(request.getParameter("numEchelle"));
                    int numDos = Integer.parseInt(request.getParameter("numDos"));
                    List<JSONObject> list = new ArrayList<JSONObject>();
                    List<AnyTypeArray> list1 = (WS.portEchelleWS.getResultByNumDossAndCodeEchelle(numDos, numEchelle));

                    for (int i = 0; i < list1.size(); i++) {

                        int valeur = Integer.parseInt(list1.get(i).getItem().get(0).toString());
                        // out.print(valeur+"<br>");
                        DateTime myDate = DateTime.parse(list1.get(i).getItem().get(1).toString());
                        int year = myDate.getYear();
                        int month = myDate.getMonthOfYear();
                        int day = myDate.getDayOfMonth();
                        int hour = myDate.getHourOfDay();
                        int minute = myDate.getMinuteOfHour();
                        int seconde = myDate.getSecondOfMinute();
                        String date = day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + seconde;

                        JSONObject obj = new JSONObject();
                        obj.put("valeur", valeur);
                        obj.put("date", date);
                        list.add(obj);
                    }
                    out.println(gson.toJson(list));
                } else if (function.equals("GetListReponseParEchelle")) {
                    String numEchelle = request.getParameter("numEchelle");
                    List<Evaluation> list = new ArrayList<Evaluation>();
                    List<AnyTypeArray> listAux;
                    listAux = WS.portEchelleWS.getListReponseParEchelle(Integer.parseInt(numEchelle));
                    for (int i = 0; i < listAux.size(); i++) {
                        Evaluation eval = new Evaluation();
                        eval.setFamille(listAux.get(i).getItem().get(0).toString());
                        eval.setSousFamille(listAux.get(i).getItem().get(1).toString());
                        eval.setValeur(listAux.get(i).getItem().get(2).toString());
                        eval.setCodeFamille(listAux.get(i).getItem().get(4).toString());
                        eval.setCodeSousFamille(listAux.get(i).getItem().get(5).toString());
                        eval.setId(String.valueOf(i));
                        list.add(eval);
                        eval = null;
                    }
                    out.println(gson.toJson(list));
                }
            } else if ("update".equals(type)) {
                if ("insertResultatEvaluation".equals(function)) {
                    String dateSys = request.getParameter("dateSys");
                    int numDos = Integer.parseInt(request.getParameter("numDos"));
                    int valeur = Integer.parseInt(request.getParameter("valeur"));
                    String codeSousFamille = request.getParameter("codeSousFamille");
                    WS.portEchelleWS.insertResultatEvaluation(numDos, codeSousFamille, valeur, dateSys);
                } else if ("incrementID".equals(function)) {
                    String code = request.getParameter("code");
                    String tableName = request.getParameter("tableName");
                    //out.print("code="+code+"<br>");
                    //out.print("tableName="+tableName+"<br>");
                    String number=WS.portEchelleWS.incrementID(code, tableName);
                    out.println(gson.toJson(number));
                    //out.print("number="+number+"<br>");
                    
                } else if ("insertEchelle".equals(function)) {
                    String codeEchelle = request.getParameter("codeEchelle");
                     String designation = request.getParameter("designation");
                    int valeurMinimale = Integer.parseInt(request.getParameter("valeurMinimale"));
                    int valeurMoyenne = Integer.parseInt(request.getParameter("valeurMoyenne"));
                    int ValeurMaximale = Integer.parseInt(request.getParameter("ValeurMaximale"));
                    String description = request.getParameter("description");
                    WS.portEchelleWS.insertEchelle(codeEchelle, designation, valeurMinimale, valeurMoyenne, ValeurMaximale, description);
                }

            }

        } finally {
            out.close();
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
