/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.dao;

import com.csys.evalpatient.model.Resultat;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.xml.datatype.DatatypeFactory;

/**
 *
 * @author Nabil Moalla
 */
public class Resultatdao {

    EntityManager em = FactoriesRepository.GetEntityManager(FactoriesRepository.getEvalPatientPU());
    EntityTransaction tx = em.getTransaction();

    public List<Resultat> findallresultat() {
        Query q = em.createNamedQuery("Resultat.findAll", Resultat.class);
        return q.getResultList();

    }

    public List<Object[]> GetResultByNumDossAndCodeEchelle(int numDoss, int codeEchelle) {
        try {
            List<Object[]> list = new ArrayList<Object[]>();
            String sql;
            sql = "SELECT SUM(Resultat.valeur),date FROM Resultat INNER JOIN Sous_Famille ON Resultat.Code_Sous_Famille = Sous_Famille.Code_Sous_Famille INNER JOIN Famille_Echelle ON Sous_Famille.Code_Famille = Famille_Echelle.Code_Famille where Num_Dossier =" + numDoss + " AND Code_Echelle =" + codeEchelle + "  group by date";
            System.out.println("Requete  " + sql);
            Query q = em.createNativeQuery(sql);
            list = q.getResultList();
            return list;
        } catch (Exception e) {
            Logger.getLogger(Resultatdao.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }

    }

    public List<Object[]> GetListReponseParEchelle(int numEchlle) {
        try {
            List<Object[]> list = new ArrayList<Object[]>();
            String sql;
            sql = "SELECT  Famille_Echelle.Designation as Famille, Sous_Famille.Designation AS Sous_Famille, Sous_Famille.Valeur as 'Valeur','0' as '  ', Famille_Echelle.Code_Famille,Sous_Famille.Code_Sous_Famille,Famille_Echelle.Code_Aide FROM Sous_Famille INNER JOIN Famille_Echelle ON Sous_Famille.Code_Famille = Famille_Echelle.Code_Famille WHERE (Famille_Echelle.Code_Echelle =" + numEchlle + ") order by Famille_Echelle.Code_Famille,Sous_Famille.Valeur";
            System.out.println("Requete  " + sql);
            Query q = em.createNativeQuery(sql);
            list = q.getResultList();
            return list;
        } catch (Exception e) {
            Logger.getLogger(Resultatdao.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public void InsertResultatEvaluation(int numDos, String codSousFamille, int valeur,String dateSys) {
        try {

            tx.begin();
            String sql;

          
            
            sql = "INSERT INTO [gclinPin].[dbo].[Resultat]([Num_Dossier],[Code_Sous_Famille],[valeur],[Date]) VALUES(" + numDos + "," + codSousFamille + "," + valeur + ",'"+dateSys+"')  ";
            System.out.println("Requete  " + sql);
            Query q = em.createNativeQuery(sql);
            q.executeUpdate();
            tx.commit();
        } catch (Exception e) {
            System.out.println("erreur INSERTION");
            Logger.getLogger(Resultatdao.class.getName()).log(Level.SEVERE, null, e);

        }
    }

}
