package libraries;

public class Validation {
    /**
     * Verifica se o número digitado é um número negativo
     * @param number Um número Double a ser analisado
     * @return Um booleano True caso seja um número negativo ou False caso não
     */
    public boolean checkIfNumberIsnegative(double number) {
        if (number < 0) {
            return true;
        } 
        
        return false;
    }

    /**
     * Verifica se o número digitado é igual a zero
     * @param number Número a ser analisado
     * @return Booleano True caso o número seja igual a zero e False caso não
     */
    public boolean checkIfNumberEqualsZero(double number) {
        return number == 0;
    }
}
