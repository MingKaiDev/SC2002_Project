import java.util.List;

public class MedicationInventoryUI {
    public void printMainMenu() {
        System.out.println("\n1. View Medication Inventory");
        System.out.println("2. Update Medication Inventory");
        System.out.println("3. Back");
    }
    public void printMedicationInventory() {
        List <Medicine> medicineList = Medicine.getAllMedicines();
        System.out.println("\nMedication Inventory:");
        for (Medicine medicine : medicineList){
            System.out.println(String.format("Medicine: %s", medicine.getMedicineName()));
            System.out.println(medicine.getQuantity() > medicine.getLowQAlert() ? String.format("Quanity: %d", medicine.getQuantity()) : String.format("Quanity: %d (Low Quantity. Please Top Up)", medicine.getQuantity()));
            System.out.println(String.format("Low Quantity Alert: %d \n", medicine.getLowQAlert()));
        }
    }
}
