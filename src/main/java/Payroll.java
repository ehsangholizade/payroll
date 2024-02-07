import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Payroll {
    public static void main(String[] args) {
        Map<String, Payable> payableMap = new HashMap<>();
        payableMap.put("Consultant1", new ConsultantPayroll("Consultant1", 100, 200));
        payableMap.put("Consultant2", new ConsultantPayroll("Consultant2", 50, 100));
        payableMap.put("Employee1", new EmployeePayroll("Employee1", 20, 100));

        for (Map.Entry<String, Payable> entry : payableMap.entrySet()) {
            String name = entry.getKey();
            Payable payable = entry.getValue();
            System.out.println(name + " " + payable.calculatePay());
        }

        Iterator<Payable> iterator = payableMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().calculatePay());
        }
    }
}

