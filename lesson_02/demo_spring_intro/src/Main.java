import staff.administration.Director;
import staff.administration.ProductionChief;
import staff.administration.SalesChief;
import staff.production.MachineOperator;
import staff.production.Merchandiser;
import staff.production.SalesManager;
import staff.production.Storekeeper;

public class Main {
    public static void main(String[] args) {
        MachineOperator machineOperator = new MachineOperator();
        Storekeeper storekeeper = new Storekeeper();
        SalesManager salesManager = new SalesManager();
        Merchandiser merchandiser = new Merchandiser();

        ProductionChief productionChief = new ProductionChief();
        productionChief.setMachineOperator(machineOperator);
        productionChief.setStorekeeper(storekeeper);

        SalesChief salesChief = new SalesChief();
        salesChief.setMerchandiser(merchandiser);
        salesChief.setSalesManager(salesManager);

        Director director = new Director();
        director.setSalesChief(salesChief);
        director.setProductionChief(productionChief);

        director.manageCompany();
    }
}