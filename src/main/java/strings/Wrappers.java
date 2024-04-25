package strings;

public class Wrappers {

    public static void main(String[] args) {
        // String to Byte
        String byteString = "10";
        byte byteValue = Byte.parseByte(byteString);
        System.out.println("Byte: " + byteValue);

        // String to Short
        String shortString = "100";
        short shortValue = Short.parseShort(shortString);
        System.out.println("Short: " + shortValue);

        // String to Integer
        String intString = "1000";
        int intValue = Integer.parseInt(intString);
        System.out.println("Integer: " + intValue);

        // String to Long
        String longString = "10000";
        long longValue = Long.parseLong(longString);
        System.out.println("Long: " + longValue);

        // String to Float
        String floatString = "3.14";
        float floatValue = Float.parseFloat(floatString);
        System.out.println("Float: " + floatValue);

        // String to Double
        String doubleString = "2.718";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println("Double: " + doubleValue);

        // String to Character
        String charString = "A";
        char charValue = charString.charAt(0);
        System.out.println("Character: " + charValue);

        // String to Boolean
        String booleanString = "true";
        boolean booleanValue = Boolean.parseBoolean(booleanString);
        System.out.println("Boolean: " + booleanValue);

        // Byte to String
        byte byteValueExample = 10;
        String strByteValue = Byte.toString(byteValueExample);
        System.out.println("String: " + strByteValue);

        //  Integer to String
        int intValueExample = 1000;
        String strIntValue = Integer.toString(intValueExample);
        System.out.println("String: " + strIntValue);

        //  Long to String
        long longValueExample = 10000;
        String strLongValue = Long.toString(longValueExample);
        System.out.println("String: " + strLongValue);

        //  Float to String
        float floatValueExample = 3.14f;
        String strFloatValue = Float.toString(floatValueExample);
        System.out.println("String: " + strFloatValue);

        //  Double to String
        double doubleValueExample = 2.718;
        String strDoubleValue = Double.toString(doubleValueExample);
        System.out.println("String: " + strDoubleValue);

        // Boolean to String
        boolean booleanValueExample = true;
        String strBooleanValue = Boolean.toString(booleanValueExample);
        System.out.println("String: " + strBooleanValue);
    }
}
