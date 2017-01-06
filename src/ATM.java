/**
 * Created by TheOriginMS7 on 06.01.2017.
 */
public class ATM {
    public void getMon(int money){
        Dollar10Exchange exc10 = new Dollar10Exchange();
        Dollar20Exchange exc20 = new Dollar20Exchange();
        Dollar50Exchange exc50 = new Dollar50Exchange();
        exc50.setNext(exc20);
        exc20.setNext(exc10);
        exc50.getMoney(new Currency(money));
    }
}
