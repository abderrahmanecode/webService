package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService (serviceName = "BanqueWS")
public class BanqueService {

        @WebMethod (operationName = "conversionEuroToDH")
        public double conversionEuroToDh(@WebParam(name = "montant" ) double montant) {
            return montant * 10.5;
        }

        public double conversionDhToEuro(double montant) {
            return montant / 10.5;
        }

        @WebMethod
        public Compte getCompte(@WebParam( name = "code" )int code) {
            return new Compte(code, Math.random() * 9000, new Date());
        }
        @WebMethod
        public List<Compte> ListComptes() {
           return List.of(
                     new Compte(1, Math.random() * 9000, new Date()),
                     new Compte(2, Math.random() * 9000, new Date()),
                     new Compte(3, Math.random() * 9000, new Date())
              );

        }

}
