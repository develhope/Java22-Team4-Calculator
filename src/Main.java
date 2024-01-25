public class Main {
public static void main (String[] args){

        System.out.println(divisionMethod(12,66));
        System.out.println(moltiplicationMethod(13,6));
        System.out.println(additionMethod(2,9));
        System.out.println(subtrationMethod(34,8));

    }

    //metodo che definisce la divisione:
    public static float divisionMethod(float firstValue, float secondValue){

        return firstValue / secondValue;

    }
    //metodo che definisce la moltiplicazione:
    public static float moltiplicationMethod(float firstValue, float secondValue){

        return firstValue * secondValue;

    }
    //metodo che definisce l'addizione:
    public static float additionMethod(float firstValue, float secondValue){

        return firstValue + secondValue;

    }

    //metodo che definisce la sottrazione:
    public static float subtrationMethod(float firstValue, float secondValue){

        return firstValue - secondValue;

    }
}
