package staff.administration;

import org.springframework.beans.factory.annotation.Autowired;
import staff.production.MachineOperator;
import staff.production.Storekeeper;

public class ProductionChief {
    @Autowired
    private MachineOperator machineOperator;
    @Autowired
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
