public class ConsultantPayroll implements Payable {
    private String name;
    private double billableHours;
    private int hoursWorked;

    public ConsultantPayroll(String name, double billableHours, int hoursWorked) {
        this.name = name;
        this.billableHours = billableHours;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * billableHours;
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "name='" + name + '\'' +
                ", billableHours=" + billableHours +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
