package Biblioteca;

public  interface ISBN {

    static boolean comprobacion(String isbn) throws ISBNException {
        int resultado;
        resultado = 0;
        if ((isbn.length() != 10 && isbn.length() == 13) && (isbn.length() != 13 && isbn.length() == 10)) {
            throw new ISBNLongitudErronea(isbn);
        }

        if (isbn.length() == 10) {

            char[] isbnArray = isbn.toCharArray();

            for (int i = 0; i < isbnArray.length; i++) {

                if (Character.isDigit(isbnArray[i])) {
                    resultado += Integer.parseInt(String.valueOf(isbnArray[i])) * (i + 1);
                } else if (Character.isLetter(isbnArray[i]) && i == (isbn.length() - 1) && (isbnArray[i] == 'x' || isbnArray[i] == 'X')) {
                    resultado += 10 * (i + 1);
                }

            }
            if (resultado % 11 != 0){
                throw new ISBNSumaErronea();
            } else if (isbn.length() == 10){
                return true;
            }

        } else if (isbn.length() == 13) {

            char[] isbnArray = isbn.toCharArray();

            for (int i = 1; i <= isbnArray.length - 1; i++) {

                if (Character.isDigit(isbnArray[i]) && i % 2 != 0){
                    resultado += Integer.parseInt(String.valueOf(isbnArray[i - 1]))  * 1;
                } else if (i % 2 == 0){
                    resultado += Integer.parseInt(String.valueOf(isbnArray[i -1]))  * 3;
                }

            }
                resultado %= 10;
                resultado = 10 - resultado;

                if (resultado != Integer.parseInt(String.valueOf(isbnArray[isbnArray.length -1])) ){
                    throw new ISBNSumaErronea();
                } else{
                    return true;
                }

        }
        return false;
    }


}
