package midterm.salome_kikilashvili_2.task1;

import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    // Change studentName to your name
    private String SalomeKikilashvili;

    // Constructor
    public Fantasy(String SalomeKikilashvili) {
        this.SalomeKikilashvili = SalomeKikilashvili;
    }

    // Implementing abstract methods from AbstractFantasy
    @Override
    public String getWarsaw1() {
        return "Warsaw1"; // Example implementation, replace with actual logic
    }

    @Override
    public String getWebcam2() {
        return "Webcam2"; // Example implementation, replace with actual logic
    }

    // Implementing toString method
    @Override
    public String toString() {
        return "Fantasy created by " + SalomeKikilashvili;
    }

    // Implementing Dream interface methods (not used in this class)
    @Override
    public String methodBranding3(String argKnife5) {
        // Implementation not provided
        return null;
    }

    @Override
    public List<String> methodCoupe4(String argMoney6) {
        // Implementation not provided
        return null;
    }
}