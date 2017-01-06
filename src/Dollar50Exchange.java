/**
 * Created by TheOriginMS7 on 05.12.2016.
 */
public class Dollar50Exchange implements Exchange {

    private Exchange next;

    @Override
    public void setNext(Exchange next){
        this.next = next;
    }

    public void getMoney(Currency currency){
        int m = currency.getAmount();
        next.getMoney(new Currency(m % 50));
        if(m/50 != 0){
            System.out.println(m / 50 + " - amount 50 Dollars banknote");
        }
    }
}
