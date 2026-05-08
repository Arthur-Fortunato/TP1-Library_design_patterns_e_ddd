package br.com.infnet.facade;

import br.com.infnet.entity.Library;
import br.com.infnet.entity.Loan;
import br.com.infnet.entity.User;
import br.com.infnet.factory.ItemFactory;
import br.com.infnet.interfaces.Item;
import br.com.infnet.interfaces.SearchStrategy;
import br.com.infnet.strategy.TitleSearchStrategy;

public class LibraryFacade {
    private Library library = Library.getLibrary();
    private SearchStrategy searchStrategy = new TitleSearchStrategy();

    public void addItem(String type, String title) {
        Item item = ItemFactory.create(type, title);
        library.items.add(item);
    }

    public void addUser(String name) {
        library.users.add(new User(name));
    }

    public void loanItem(String title, String userName) {
        Item item = searchStrategy.search(library.items, title);
        if (item == null) {
            System.out.println("Item não encontrado.");
            return;
        }
        User user = library.users.get(0);
        Loan loan = new Loan(item, user);
        library.loans.add(loan);
    }

    public void checkLoans() {
        for (Loan loan : library.loans) {
            loan.checkStatus();
        }
    }
}