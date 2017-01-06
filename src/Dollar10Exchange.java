/**
 * Created by TheOriginMS7 on 05.12.2016.
 */
public class Dollar10Exchange implements Exchange {
    private Exchange next;

    @Override
    public void setNext(Exchange next){
        this.next = next;
    }

    public void getMoney(Currency currency){
        int m = currency.getAmount();
        if(m/10 != 0){
            System.out.println(m / 10 + " - amount of 10 Dollars banknote");
        }
    }
}
