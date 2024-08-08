package staff.administration;

import staff.production.MachineOperator;
import staff.production.Storekeeper;

public class ProductionChief {
    private MachineOperator machineOperator;
    private Storekeeper storekeeper;

    public void setMachineOperator(MachineOperator machineOperator) {
        this.machineOperator = machineOperator;
    }

    public void setStorekeeper(Storekeeper storekeeper) {
        this.storekeeper = storekeeper;
    }

    public void giveOrders(){
        machineOperator.work();
        storekeeper.work();
    }
}
