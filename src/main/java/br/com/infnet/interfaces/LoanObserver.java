package br.com.infnet.interfaces;

import br.com.infnet.entity.Loan;

public interface LoanObserver {
    void notify(Loan loan);
}
