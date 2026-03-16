package org.example.EX4;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Ticket implements  Comparable<Ticket> {
    private int id;
    private Priorite priorite;
    private Statut statut;
    private Date dateCreation;
    private int tempsEstime; // en minutes

    public Ticket(int id, Priorite priorite, Statut statut, Date dateCreation, int tempsEstime) {
        this.id = id;
        this.priorite = priorite;
        this.statut = statut;
        this.dateCreation = dateCreation;
        this.tempsEstime = tempsEstime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Priorite getPriorite() {
        return priorite;
    }

    public void setPriorite(Priorite priorite) {
        this.priorite = priorite;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }
    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getTempsEstime() {
        return tempsEstime;
    }

    public void setTempsEstime(int tempsEstime) {
        this.tempsEstime = tempsEstime;
    }
    @Override
    public int compareTo(Ticket t) {
        int p = t.priorite.ordinal() - this.priorite.ordinal();
        if (p != 0) return p;
        return this.dateCreation.compareTo(t.dateCreation);
    }

    public static List<Ticket> getTicketsATraiter(List<Ticket> tickets, int tempsDisponible) {
        List<Ticket> openTickets = tickets.stream()
                .filter(t -> t.statut == Statut.OPEN)
                .sorted()
                .collect(Collectors.toList());
        List<Ticket> ticketsTraites = new ArrayList<>();
        int tempsRestant = tempsDisponible;
        for (Ticket t : openTickets) {
            if (t.getTempsEstime() <= tempsRestant) {
                ticketsTraites.add(t);
                tempsRestant -= t.getTempsEstime();
            }
        }
        return ticketsTraites;
    }


}


