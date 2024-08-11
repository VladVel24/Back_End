package staff.administration;

import org.springframework.beans.factory.annotation.Autowired;
import staff.production.Merchandiser;
import staff.production.SalesManager;

public class SalesChief {
    @Autowired
    private SalesManager salesManager;
    @Autowired
    private Merchandiser merchandiser;

    public void setSalesManager(SalesManager salesManager) {
        this.salesManager = salesManager;
    }

    public void setMerchandiser(Merchandiser merchandiser) {
        this.merchandiser = merchandiser;
    }

    public void giveOrders(){
        merchandiser.work();
        salesManager.work();
    }
}

