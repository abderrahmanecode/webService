package ws;

import jakarta.xml.bind.annotation.*;

import java.util.Date;
 import jakarta.xml.bind.annotation.XmlRootElement;
 import jakarta.xml.bind.annotation.XmlTransient;



@XmlRootElement (name = "Compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {

        private int code;
        private double solde;

        @XmlTransient // to avoid the date to be serialized
        private Date dateCreation;

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public Compte() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
