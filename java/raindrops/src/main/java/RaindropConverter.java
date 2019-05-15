class RaindropConverter {

    String convert(int number) {

        if (number == 0) return "0";

        String result = "";
        if (number % 3 == 0) {
            result += "Pling";
        }
        if (number % 5 == 0) {
            result += "Plang";
        }
        if (number % 7 == 0) {
            result += "Plong";
        }

        return result.length() == 0 ? String.valueOf(number) : result;
    }

}
