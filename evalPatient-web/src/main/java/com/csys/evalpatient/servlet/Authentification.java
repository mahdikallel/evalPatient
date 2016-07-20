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
import javax.servlet.http.HttpSession;
import service.AccessControl;
import service.Tracecnx;

/**
 *
 * @author Mahdi Kallel <mahdi-kallel@live.fr>
 */
public class Authentification extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        if (WS.portEchelleWS == null) {
            WS webService = new WS();
            webService.EchelleWS();

        }

        HttpSession session = request.getSession(true);
        String login = "";
        String password = "";
        String codeMed = "";
        String codePin = "";

        String mode = request.getParameter("mode");
        if (mode.equalsIgnoreCase("normal")) {
            login = request.getParameter("login");
            password = request.getParameter("password");
        }
        // out.print("password" + password);
        //  out.print("login" + login);
        AccessControl clientUser = null;
        if (mode.equalsIgnoreCase("normal")) {
            clientUser = WS.portEchelleWS.verifLogin(login, password);
            // out.print(WS.portEchelleWS.toString());
        }

        if (clientUser != null) {
            // WS.portEchelleWS.updateUserConnected(ListeConnexion.get(0).getId(), 0, true);
            session.setAttribute("user", clientUser.getUserName());
            session.setAttribute("groupe", clientUser.getGrp());
            session.setAttribute("codemed", clientUser.getCodeMedecinInfirmier());

            // out.println("Password succes:" + clientUser.getPassWord());
            out.print("succes");

        } else {
            out.print("error");
            session.setAttribute("error", 1);
        }
        //Récupération Adresse IP
        String adresseip = request.getHeader("X-FORWARDED-FOR");
        if (adresseip == null) {
            adresseip = request.getRemoteAddr();
        }
       // out.print("ip" + adresseip);
        /* List<Tracecnx> ListeConnexion = null;
        if (mode.equalsIgnoreCase("normal")) {
            ListeConnexion = WS.portEchelleWS.getTraceCnx(login, adresseip);
        }
        if (ListeConnexion !=null ) {
            out.print("IP:  " + ListeConnexion.get(0).getAdresseIP());
        } else {
            out.print("Liste vide");
        }*/
 /* if (ListeConnexion.isEmpty() == false) {
                    XMLGregorianCalendar actuelle = WS.portEchelleWS.getFullDate();
                    XMLGregorianCalendar datecnx = ListeConnexion.get(0).getDateCnx();
                    java.util.Date dtactuelle = actuelle.toGregorianCalendar().getTime();
                    java.util.Date dtdatecnx = datecnx.toGregorianCalendar().getTime();
                    long interval = dtactuelle.getTime() - dtdatecnx.getTime();
                    long diffminute = TimeUnit.MINUTES.convert(interval, TimeUnit.MILLISECONDS);
                    int temps_attente = 10;

                    if (ListeConnexion.get(0).isEtat() == false && diffminute < temps_attente) {
                        long reste = temps_attente - diffminute;
                        out.print("reste:" + reste);
                    } else {
                        AccessControl clientUser = null;
                        if (mode.equalsIgnoreCase("normal")) {
                            clientUser = WS.portEchelleWS.verifLogin(user, password);
                        } 

                        if (clientUser != null) {
                            WS.portEchelleWS.updateUserConnected(ListeConnexion.get(0).getId(), 0, true);
                            session.setAttribute("user", clientUser.getUserName());
                            session.setAttribute("groupe", clientUser.getGrp());
                            session.setAttribute("codemed", clientUser.getCodeMedecinInfirmier());

                            out.print("succes:" + clientUser.getCodeMedecinInfirmier());
                        } else if (clientUser == null) {
                            int compteur = ListeConnexion.get(0).getCompteur();
                            if (compteur <= 3) //Pas de limitation
                            {
                              //  WS.portDossierSoinWS.updateUserConnected(ListeConnexion.get(0).getId(), compteur + 1, true);
                                out.print("echec:" + (4 - compteur));
                            } else if (compteur > 3 && compteur < 7) //Captcha
                            {
                              //  WS.portDossierSoinWS.updateUserConnected(ListeConnexion.get(0).getId(), compteur + 1, true);
                                out.print("captcha:" + (7 - compteur));
                            } else if (compteur >= 7) //Blocage
                            {
                              //  WS.portDossierSoinWS.updateUserConnected(ListeConnexion.get(0).getId(), 0, false);
                                out.print("bloque");
                            }
                        }
                    }
                } */

 /*else if (ListeConnexion.isEmpty() == true) {
                    Boolean creationTrace = WS.portDossierSoinWS.createNewUserConnected(user, adresseip);
                    if (creationTrace == true) {
                        ListeConnexion = WS.portDossierSoinWS.getTracecnxByLoginIP(user, adresseip);
                        int compteur = ListeConnexion.get(0).getCompteur() + 1;
                        int id = ListeConnexion.get(0).getId();
                        Boolean etat = ListeConnexion.get(0).isEtat();

                        AccessControl clientUser = null;
                        if (mode.equalsIgnoreCase("normal")) {
                            clientUser = WS.portDossierSoinWS.authentification(user, password);
                        } 
                        if (clientUser != null) {
                            session.setAttribute("user", clientUser.getUserName());
                            session.setAttribute("groupe", clientUser.getGrp());
                            session.setAttribute("codemed", clientUser.getCodeMedecinInfirmier());

                            out.print("succes:" + clientUser.getCodeMedecinInfirmier());
                        } else if (clientUser == null) {
                            WS.portDossierSoinWS.updateUserConnected(id, compteur, etat);
                            out.print("echec:4");
                        }
                    } else {
                        out.print("erreur");
                    }
                }*/
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
