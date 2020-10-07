class Money  {
  protected int amount;
  protected String currency;
  public boolean equals(Object object)  {
    Money money = (Money) object;
    return this.amount == money.amount && this.currency().equals(money.currency());
  }

  static Money dollar(int amount)  {
    return new Money(amount, "USD");
  }

  Money times(int multiplier){
    return new Money(amount * multiplier, currency);
  };

    
  static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  String currency(){
    return this.currency;
  };

} 
