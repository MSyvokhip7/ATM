/**
 * Created by TheOriginMS7 on 05.12.2016.
 */
public class Dollar20Exchange implements Exchange {
    private Exchange next;

    @Override
    public void setNext(Exchange next){
        this.next = next;
    }

    public void getMoney(Currency currency){
        int m = currency.getAmount();
        next.getMoney(new Currency(m % 20));
        if(m/20 != 0){
            System.out.println(m / 20 + " - amount 20 Dollars banknote");
        }
    }
}
