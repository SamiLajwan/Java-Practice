package service;

public interface paymentGateway {
    // RULE / CONTRACT
    // Jo bhi payment karega usko pay(amount) method dena hi padega
    public boolean pay(double amount);
}
