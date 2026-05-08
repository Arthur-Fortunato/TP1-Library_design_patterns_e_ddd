package br.com.infnet.entity;

import br.com.infnet.interfaces.Item;
import br.com.infnet.interfaces.LoanObserver;
import br.com.infnet.observer.OverdueNotifier;

import java.time.LocalDate;

public class Loan {
    private Item item;
    private User user;
    private LocalDate dueDate;
    private LoanObserver observer = new OverdueNotifier();

    public Loan(Item item, User user) {
        this.item = item;
        this.user = user;
        this.dueDate = LocalDate.now().minusDays(1); // só pra testar vencido
    }

    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }

    public void checkStatus() {
        observer.notify(this);
    }

    public Item getItem() {
        return item;
    }
}