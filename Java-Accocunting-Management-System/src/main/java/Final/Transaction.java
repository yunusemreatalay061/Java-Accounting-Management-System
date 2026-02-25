/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;

public class Transaction {
    private int transactionId;
    private String transactionDate;
    private String type;
    private String category;
    private float amount;
    private String description;
    private String currency;
    private String username;

    public Transaction(int transactionId, String transactionDate, String type, String category, float amount, String description, String currency, String username) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.currency = currency;
        this.username = username;
    }

    // Getter metodları
    public int getTransactionId() {
        return transactionId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public float getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public String getCurrency() {
        return currency;
    }

    public String getUsername() {
        return username;
    }
}
