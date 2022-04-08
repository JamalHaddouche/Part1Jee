package metier;
import dao.IDao;

public class IMetierImp implements IMetier{

    private IDao dao;
    //injecter dans la variable dao  d'un objet d'une classe qui implémete l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*24;//n'import quel calcul just pour tester
        return res;
    }
}
