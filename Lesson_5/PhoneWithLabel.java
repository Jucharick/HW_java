package Lesson_5;

public class PhoneWithLabel {
    private String label;
    private int number;
    
    public PhoneWithLabel(String label, int number) {
        this.label = label;
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return  label + ": " + number;
    }

    
}
