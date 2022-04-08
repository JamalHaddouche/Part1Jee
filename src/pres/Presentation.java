package pres;
import dao.DaoImp;
import ext.DaoImp2;
import metier.IMetierImp;

public class Presentation {
    public static void main(String[] args) {
        /*
        Injection des dépendances par instanciation  statique => new
         */
        /*
        pour generer une valeur aléatoirements
        DaoImp dao=new DaoImp();
         */
        DaoImp2 dao=new DaoImp2();

        IMetierImp metier=new IMetierImp();
        metier.setDao(dao);
        System.out.println("le calcul donne le résultat suivant "+metier.calcul());
    }
}
