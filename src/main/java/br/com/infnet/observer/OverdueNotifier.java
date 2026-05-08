package br.com.infnet.observer;

import br.com.infnet.entity.Loan;
import br.com.infnet.interfaces.LoanObserver;

public class OverdueNotifier implements LoanObserver {
    public void notify(Loan loan) {
        if (loan.isOverdue()) {
            System.out.println("O empréstimo do item: " + loan.getItem().getTitle() + " está vencido.");
        }
    }
}
