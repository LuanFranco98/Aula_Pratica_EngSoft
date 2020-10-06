abstract class Money  {
  protected int amount;
  protected String currency;
  public boolean equals(Object object)  {
    Money money = (Money) object;
    return this.amount == money.amount &&  getClass().equals(money.getClass());
  }

  static Money dollar(int amount)  {
    return new Dollar(amount, "USD");
  }

  abstract Money times(int multiplier);

    
  static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }

  Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  abstract String currency();

} 
