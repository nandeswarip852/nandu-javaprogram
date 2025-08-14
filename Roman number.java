   import java.util.Scanner;\n" +
                "\n" +
                "public class Main {\n" +
                "\n" +
                "    public static String convertToRoman(int number) {\n" +
                "        String roman = \"\";\n" +
                "\n" +
                "        int thousands = number / 1000;\n" +
                "        int hundreds = (number % 1000) / 100;\n" +
                "        int tens = (number % 100) / 10;\n" +
                "        int ones = number % 10;\n" +
                "\n" +
                "        // Thousands place\n" +
                "        switch (thousands) {\n" +
                "            case 3: roman += \"MMM\";\n" +
                "            break;\n" +
                "            case 2: roman += \"MM\";\n" +
                "            break;\n" +
                "            case 1: roman += \"M\";\n" +
                "            break;\n" +
                "            default: break; // 0 means no thousands\n" +
                "        }\n" +
                "\n"+
                "        // Hundreds place\n"+
                "        switch (hundreds) {\n"+
                "            case 9: roman += \"CM\";\n"+
                "            break;\n"+
                "            case 8: roman += \"DCCC\";\n"+
                "            break;\n"+
                "            case 7: roman += \"DCC\";\n"+
                "            break;\n"+
                "            case 6: roman += \"DC\";\n"+
                "            break;\n"+
                "            case 5: roman += \"D\";\n"+
                "            break;\n"+
                "            case 4: roman += \"CD\";\n"+
                "            break;\n"+
                "            case 3: roman += \"CCC\";\n"+
                "            break;\n"+
                "            case 2: roman += \"CC\";\n"+
                "            break;\n"+
                "            case 1: roman += \"C\";\n"+
                "            break;\n"+
                "            default: break;\n"+
                "        }
				 // Tens place
        switch (tens) {
            case 9: roman += "XC";
            break;
            case 8: roman += "LXXX";
            break;
            case 7: roman += "LXX";
            break;
            case 6: roman += "LX";
            break;
            case 5: roman += "L";
            break;
            case 4: roman += "XL";
            break;
            case 3: roman += "XXX";
            break;
            case 2: roman += "XX";
                break;
                case 1:roman +="X";
                break;
        default:break;
                }

                // Ones place
                switch(ones){
                case 9:roman +="IX";
                break;
                case 8:roman +="VIII";
                break;
                case 7:roman +="VII";
                break;
                case 6:roman +="VI";
                break;
                case 5:roman +="V";
                break;
                case 4:roman +="IV";
                break;
                case 3:roman +="III";
                break;
                case 2:roman +="II";
                break;
                case 1:roman +="I";
                break;
        default:break;
                }

                return roman;
    }