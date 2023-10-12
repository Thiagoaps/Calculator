package entities;

public class Calculator {
	private Double firstValue;
    private Double secondValue;

    public Calculator(){
    }

    public Calculator(Double firstValue, Double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public Double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(Double firstValue) {
        this.firstValue = firstValue;
    }

    public Double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(Double secondValue) {
        this.secondValue = secondValue;
    }

    public double addition () {
       return firstValue + secondValue;
    }
    public double subtraction () {
        return firstValue - secondValue;
    }
    public double multiplication () {
        return firstValue * secondValue;
    }
    public double division () {
        return firstValue / secondValue;
    }

}
