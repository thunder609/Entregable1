public class Calculadora {

    float result,a ,b;

    public Calculadora(float  a, float b, float result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }
    public Calculadora() {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public float getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
    public float sumar( float a , float b){
       return  a+b;

    }
    public float dividir( float a , float b){
        try {
            result= a / b;
        }catch(ArithmeticException e){
            System.out.println("Divcion en 0");
        }

        return result;
    }
    public float restar( float a , float b){

            return a - b;
    }
   public float multiplicar( float a , float b) {
       try {
           result= a / b;
       } catch (ArithmeticException e) {
           System.out.println("erro");
       }
       return result;
   }
    @Override
    public String toString() {
        return "Calculadora{" +
                "a=" + a +
                ", b=" + b +
                ", result=" + result +
                '}';
    }


}
